package tutorial;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.Jdk14Logger;
import org.apache.commons.logging.impl.SimpleLog;
import org.openliberty.openaz.azapi.AzService;
import org.openliberty.openaz.azapi.pep.PepRequest;
import org.openliberty.openaz.azapi.pep.PepRequestFactory;
import org.openliberty.openaz.azapi.pep.PepResponse;
import org.openliberty.openaz.pdp.provider.AzServiceFactory;
import org.openliberty.openaz.pdp.provider.SimpleConcreteSunXacmlService;
import org.openliberty.openaz.pep.PepRequestFactoryImpl;

import com.sun.xacml.ConfigurationStore;
import com.sun.xacml.Indenter;
import com.sun.xacml.ParsingException;
import com.sun.xacml.Policy;
import com.sun.xacml.PolicySet;
import com.sun.xacml.UnknownIdentifierException;

import test.TestUtils;
import test.policies.OpenAzLineContext;
import test.policies.OpenAzParseException;
import test.policies.OpenAzPolicyReader;
import test.policies.OpenAzXacmlObject;
import test.policies.OpenAzTokens.LineType;

/**
 * This class is intended to be general purpose tutorial for
 * using the OpenAz capabilities.
 * <p> 
 * More info can be found at OpenAz Wiki:
 * <ul>
 * <li><a href="http://openliberty.org/wiki/index.php/OpenAz_Main_Page">http://openliberty.org/wiki/index.php/OpenAz_Main_Page</a>
 * </ul>
 * To download the OpenAz sw, click on "Download GNU tarball" at 
 * the following URL:
 * <ul>
 * <li><a href="http://openaz.svn.sourceforge.net/viewvc/openaz/">http://openaz.svn.sourceforge.net/viewvc/openaz/</a>
 * </ul>
 * Then extract everything to a directory of your choice that will 
 * henceforth be referred to as:
 * <code><pre>
 * 		&lt;TOPOFPROJECT&gt;
 * </pre></code>
 * After the extraction, there should be a single directory under 
 * &lt;TOPOFPROJECT&gt; containing everything needed to build and
 * run the tutorial, as well as to use the test programs and build
 * new tests, applications, policies, and/or implementations of 
 * new OpenAz providers of AzApi and/or PepApi.
 * <code><pre>
 * 		&lt;TOPOFPROJECT&gt;\openaz
 * </pre></code>
 * The official azapi javadoc is located at:
 * <br>
 * <code><pre>
 * 		&lt;TOPOFPROJECT&gt;\openaz\azapi\doc\index.html
 * </pre></code>
 * <p>
 * 
 * To read this javadoc, and other test javadoc you may open the
 * following link, however, please be aware that the above link
 * is the official interface, while the following link also includes
 * impl javadoc and test javadoc, which are in a rougher state and
 * may include some obsolete information - so only use the javadoc
 * below if looking for impl or test details. It will be upgraded
 * to a more reliable state in the future.
 * <br>
 * <code><pre>
 * 		&lt;TOPOFPROJECT&gt;\openaz\test\doc\index.html
 * </pre></code>
 * <p>
 * In order to build the software and run the tutorial, "Java" and "ant"
 * must be installed on system where this will be taking place.
 * <p>
 * For reference: the following versions of Java and ant were used
 * to build and run the OpenAz software that is in this download:
 * <UL>
 * <LI>Java 1.6 (1.6.0_11-b03)</LI>
 * <LI>Ant 1.7.1</LI>
 * </UL>
 * At this point, the system where the above installation was done
 * should be ready to build and run the tutorial, etc. Instructions to
 * build and run can be found in the installation directory at:
 * <br>
 * <code><pre>
 *  	&lt;TOPOFPROJECT&gt;\openaz\docs\readme-docs.txt
 * </pre></code>
 * <p>
 * In particular, the docs directory contains a set of pdf files,
 * which originally were project emails. The following file is
 * a good place to find the minimal instructions to build and run:
 * <br>
 * <code><pre>
 * 	100806-version-101-email.txt 
 *  (note: use the .txt version to copy cmds, some may be truncated
 *   in the .pdf version)
 * </pre></code>
 * <p>
 * To start, the first thing that is provided is a demonstration
 * of how a xacml policy can be created, then used with the SunXacml
 * PDP to authorize access to resources.
 * <p>
 * The steps include:
 * <ul>
 * <li> Create a Xacml Policy
 * <li> Create an appl to access protected resources
 * <li> Run the appl and examine results
 * </ul>
 * @author Rich Levinson, Josh Bregman, Prateek Mishra
 *
 */
public class OpenAzTutorial {
	
	public final static String CONTAINER = "orcl-weblogic"; 
	public final static String DEFAULT_PROVIDER_NAME = "AZ_SERVICE";
	public final static String SAMPLE_SESSION_USER_NAME = "Joe User";
	
	static TestUtils testUtils = new TestUtils();
	
	//Log log = LogFactory.getLog(this.getClass());
	Log log = LogFactory.getLog("OpenAzTutorialInstance");
	static Log logStatic = LogFactory.getLog(OpenAzTutorial.class);
	
	static LogFactory logFactory = LogFactory.getFactory();
    private static final Logger logger =
        Logger.getLogger(OpenAzTutorial.class.getName());

	/**
	 * This is the main program entry point that may be used to 
	 * run the OpenAz tutorial.
	 * <p>
	 * Steps to run:
	 * <ul>
	 * <li> create a policy: you may create a policy directly in 
	 * XACML XML or you may use an abbreviated syntax, which can
	 * then be used to generate the XACML XML.
	 * <li> execute the following command line from
	 * </ul>
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
			throws Exception {
		System.out.println("Start OpenAz Tutorial version 110");
		byte[] policyBytes = null;
		String policyFile = null;
		String[] policyFiles = null;
		String requestFile = null; // not used; artifact from openaz testing
		/*
		System.setProperty(
				"org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.SimpleLog");
		System.setProperty(
				"org.apache.commons.logging.simplelog.defaultlog", 
				"debug");
				*/
		setLogFeatures(logStatic);
		
		Properties props = System.getProperties();
		logStatic.trace("TRACE: System.getProperties() = " + props);
      	StringWriter sw = new StringWriter();
      	
		OpenAzTutorial openAzTutorial = new OpenAzTutorial();
      	// if an input file w shorthand xacml is provided, use it to
      	//  create a normal xacml xml file:
		if (args.length > 0) {
			policyFile = args[0];
			logStatic.info(
				"Policy file from OpenAzTutorial command line: " + 
				policyFile);
			File xacmlPolicyFile = openAzTutorial.createXacmlPolicy(policyFile);		
			policyFiles = new String[]{xacmlPolicyFile.getPath()};
			System.out.println(
				"xacmlPolicyFile = " + xacmlPolicyFile.getPath());
		}
		
		// Print above before logging starts as sanity in case there
		//  are logging problems
		System.out.println();
		try {	Thread.sleep(100);
			logStatic.trace("Wait to print above before logging starts\n");
		} catch (InterruptedException e) {}
		
		try {
			// Register an instance of SimpleConcreteSunXacmlService
			//  as the AzService provider:
			AzServiceFactory.registerProvider(
				DEFAULT_PROVIDER_NAME, 
				new SimpleConcreteSunXacmlService(
						requestFile,
						policyFiles));
		} catch (ParsingException pe) {
			pe.printStackTrace(new PrintWriter(sw));
			logStatic.info("SunXacml ParsingException: " +
					pe.getMessage() + "\n" + sw);
		} catch (UnknownIdentifierException uie) {
			uie.printStackTrace(new PrintWriter(sw));
			logStatic.info("SunXacml UnknownIdentifierException: " + 
					uie.getMessage() + "\n" + sw);
		}

		// run the String input test using the registered provider
		openAzTutorial.runStringTest();
	}
	
	
	public void runStringTest() throws Exception {

		// This may be useful if non-default logging is used.
		// Default logging is "info". i.e. "info" and higher level log messages
		//  are printed to system.err in default configuration, which is
		//  basically unzip the files, build, and run.
		if (log.isTraceEnabled()) checkLogFeatures(log);

		log.info("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n" +
				 "      Running Test Style: String          \n" +
				 "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");
		log.info("Begin test style: String");
		
		// Create the az service. In the "real world" this will be done
		// by the container and invisible to the application. We will
		// probably have some std object that users can refer to as
		// the handle to the az service much like AccessControlContext
		// is used in std java env. i.e. the following will ultimately
		// be reducible to az.decide(str, str, str) for a typical appl
		
        //AzService az = new org.openliberty.openaz.
		//		pdp.provider.SimpleConcreteDummyService();
        //AzService az = new org.openliberty.openaz.
		//		pdp.provider.SimpleConcreteSunXacmlService();
		AzService az = AzServiceFactory.getAzService();
        
		if (!(az==null)){
			// The PepRequestFactory is used to create az requests by
			// passing it the parameters that are needed for az, in
			// this case, 3 strings:
			// init the factory w the container name and the az service
			PepRequestFactory pepReqFactory = 
				(PepRequestFactory)new PepRequestFactoryImpl(CONTAINER,az);
			
			// Define sample strings to provide to simple string PepRequest
 			String subjectId = SAMPLE_SESSION_USER_NAME;
 			String resourceId = "file:C\\toplevel";
 			
 			// try to match the policy:
 			subjectId = "Joe Smith";
 			resourceId = "C:\\\\jsmith\\\\a\\\\b\\\\c";
 			//String actionId = "read";
 			String actionId = "Tutorial-Read";
 			
 			// Create the actual request using the factory to
 			// create the request and passing the strings to
 			// specify the details of the request
			log.info("Creating pepReq - \n\t  w subject,action,resource: " +
					subjectId + ", " + actionId + ", " + resourceId);
			PepRequest pepReq = 
				pepReqFactory.newPepRequest(
						subjectId, actionId, resourceId); 
			
			// Issue the request and receive a PepResponse object
			// in return, which contains details of the results
			// of the request
			PepResponse pepRspCtx = pepReq.decide();
			
			// Print the result (allowed true or false) and
			// then log the obligations, if any were returned.
			log.info("\n\t" + subjectId + 
					" allowed() = " + pepRspCtx.allowed() + "\n");
			testUtils.logObligations(pepRspCtx);
			
			// Try bad user:			
			subjectId = "Joe Bad User";
			log.info("Creating pepReq - " +
				"\n\t  w subject,action,resource: " +
				subjectId + ", " + actionId + ", " + resourceId);
			pepRspCtx = pepReqFactory.newPepRequest(
					subjectId, actionId, resourceId).decide();
			log.info("\n\t" + subjectId + 
					" allowed() = " + pepRspCtx.allowed() + "\n");
			testUtils.logObligations(pepRspCtx);			
		}
		else
			log.info("az == null");		
	}
	
	/**
	 * This method uses the simple "xacml shorthand" syntax to create
	 * a xacml policy that is returned as a byte array.
	 * @return a File object containing the generated XML Policy file
	 */
	public File createXacmlPolicy(String policyFile) {
		//boolean result = false;
		//FileWriter fw = null;
		byte[] policyBytes = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		FileOutputStream fos = null;
		File xacmlPolicyFile = null;
		log.debug(
			"Logging with log.getClass().getName() = " + 
				log.getClass().getName());
		
		OpenAzLineContext oAzLineContext =
			new OpenAzLineContext(0, LineType.INIT);
		// create an OpenAzPolicyReader
		OpenAzPolicyReader oAzPolicyReader =
			new OpenAzPolicyReader(policyFile);
		try {
			OpenAzXacmlObject oAzXacmlObject =
				oAzPolicyReader.readAzLine(oAzLineContext);
			Object parsedObject = 
				oAzXacmlObject.getObject();
			PolicySet ps = (PolicySet) parsedObject;
			if (log.isInfoEnabled()) {
				log.info("Output Policy: ");
				ps.encode(System.out, new Indenter());
			}
			ps.encode(baos);
			policyBytes = baos.toByteArray();
			//ps.encode(fw);
			// for the output file, we need a name
			// take existing name and append ".xml"
			xacmlPolicyFile = new File(policyFile+".xml");
			fos = new FileOutputStream(xacmlPolicyFile);
			ps.encode(fos);
			
			/*
			System.out.println(
				"TRACE: RETURNing to main from readAzLine(" +
				"\n\t\t\tcurrentLineNumber = " + 
					oAzLineContext.getLineNumber() +
				"\n\t\t\tcurrentLineType = " + 
					oAzLineContext.getLineType() +
				"\n\t\t\tlookingForType = " + 
					oAzLineContext.getLookingForLineType() +
				"\n\treturned openAzXacmlObject = " + 
					oAzXacmlObject +
				"\n\t\t\treturned readAhead flag = " + 
					oAzXacmlObject.getReadAhead());
			if ( ! ( oAzXacmlObject == null ) ) {
				LineType parsedObjectLineType = 
					oAzXacmlObject.getLineType();
				parsedObject = 
					oAzXacmlObject.getObject();
				System.out.println(
					"TRACE: openAzXacmlObject.getLineType() = " + 
					parsedObjectLineType + 
					"\n\tclass = " + 
					parsedObject.getClass().getName());
				
				// write the sunxacml policy or policyset to xml xacml
				switch (parsedObjectLineType) {
				case PS:
					// most typical and general case
					ps = (PolicySet) parsedObject;
					ps.encode(System.out, new Indenter());
					break;
				case PL:
					// Single policy returned
					Policy pl = (Policy) parsedObject;
					pl.encode(System.out, new Indenter());
					break;
					default:
					System.out.println(
						"TRACE: unexpected parse object returned: " +
						parsedObject.getClass().getName());
				}
				
			} else {
				System.out.println(
					"TRACE: null object returned to main. Check for errors.");
			}
			*/
		} catch (OpenAzParseException oape) {
			log.fatal(
				"Exception reading policy pseudo file: " +
				oape.getMessage());
		} catch (FileNotFoundException fnf) {
			log.fatal(
				"FileNotFoundException: " + fnf.getMessage());
		}
		
		return xacmlPolicyFile;
	}
	
	public static void checkLogFeatures(Log log) {
		// some preliminary sanity check prints/logs
		//log.getLogger().setLevel(Level.ALL);
		if (log.isTraceEnabled()) {
			log.info(
				"runStringTest:  + " +
					"preliminary instance-level logging check follows:");
			log.info("log.isTraceEnabled() = " + log.isTraceEnabled());
			log.info("log.getLogger() class = " + log.getClass().getName());
	        log.info("Log = " + log.getClass() +
	        		"\n\tisFatalEnabled() = " + log.isFatalEnabled() +
	        		"\n\tisErrorEnabled() = " + log.isErrorEnabled() +
	        		"\n\tisWarnEnabled() = " + log.isWarnEnabled() +
	        		"\n\tisInfoEnabled() = " + log.isInfoEnabled() +
	        		"\n\tisDebugEnabled() = " + log.isDebugEnabled() +
	        		"\n\tisTraceEnabled() = " + log.isTraceEnabled() +
	        		"\n\tlog.getClass().getName() = " + log.getClass().getName());
	        log.debug("Logging debug (fine) instance");
	        
	        log.fatal("log.fatal: start marker");
	        //log.fatal("logLevel = " + logLevel);	
	        log.fatal("Logging Fatal (Fatal)");
	        log.error("Logging Error (Error)");
	        log.warn("Logging Warning (Warn)");
	        log.info("Logging Info (Info)");
	        log.debug("Logging Debug (fine)");
	        log.trace("Logging Trace (finest)");
	        log.info("log.isInfoEnabled() = " + log.isInfoEnabled());
	        log.info("log.isDebugEnabled() = " + log.isDebugEnabled());
	        log.fatal("log.fatal: end marker");
		}
		
	}
	
	public static void setLogFeatures(Log log) {
		// Following, logLevel must be one of (ow take default): 
		//		("trace", "debug", "info", "warn", "error", or "fatal").
		String logLevel = (String)logFactory.getAttribute(
				"org.apache.commons.logging.simplelog.defaultlog");
		logStatic.debug(
			"logFactory.getAttribute(" + 
				"\"org.apache.commons.logging.simplelog.defaultlog\") = " +
				logFactory.getAttribute(
					"org.apache.commons.logging.simplelog.defaultlog"));
		
		int logLevelInt = SimpleLog.LOG_LEVEL_INFO; // system default
		if ( ! (logLevel == null) ) {
			if (logLevel.equals("off"))
				logLevelInt = SimpleLog.LOG_LEVEL_OFF;		// 7
			else if (logLevel.equals("fatal"))
				logLevelInt = SimpleLog.LOG_LEVEL_FATAL;	// 6
			else if (logLevel.equals("error"))
				logLevelInt = SimpleLog.LOG_LEVEL_ERROR;	// 5
			else if (logLevel.equals("warn"))
				logLevelInt = SimpleLog.LOG_LEVEL_WARN;		// 4
			else if (logLevel.equals("info"))
				logLevelInt = SimpleLog.LOG_LEVEL_INFO;		// 3
			else if (logLevel.equals("debug"))
				logLevelInt = SimpleLog.LOG_LEVEL_DEBUG;	// 2
			else if (logLevel.equals("trace"))
				logLevelInt = SimpleLog.LOG_LEVEL_TRACE;	// 1
			else if (logLevel.equals("all"))
				logLevelInt = SimpleLog.LOG_LEVEL_ALL;		// 0
			/*
			logFactory.setAttribute(
				"org.apache.commons.logging.simplelog.defaultlog", 
					logLevelInt);
			logStatic.info("logFactory.getAttr(...defaultlog) = " +
				logFactory.getAttribute(
					"org.apache.commons.logging.simplelog.defaultlog"));
			*/
		}		
		String simpleLogClass = (String)logFactory.getAttribute(
				"org.apache.commons.logging.Log");
		if ( ! (simpleLogClass == null) ) {
			((SimpleLog)logStatic).setLevel(logLevelInt);
			SimpleLog simpleLog = (SimpleLog)logStatic;
			logStatic.debug(
				"Setting SimpleLog.setLevel(logLevelInt) = " + logLevelInt);
		}
		
		if (logStatic.isDebugEnabled()) {
			logStatic.fatal("logStatic.fatal: start marker");
			logStatic.fatal(
					"Logging with: logStatic.getClass().getName() = " +
					logStatic.getClass().getName());
			logStatic.fatal("logLevel = " + logLevel);	
			logStatic.fatal("Logging Fatal (Fatal)");
			logStatic.error("Logging Error (Error)");
			logStatic.warn("Logging Warning (Warn)");
			logStatic.info("Logging Info (Info)");
			logStatic.debug("Logging Debug (fine)");
			logStatic.trace("Logging Trace (finest)");
			logStatic.info("logStatic.isInfoEnabled() = " + 
					logStatic.isInfoEnabled());
			logStatic.info("logStatic.isDebugEnabled() = " + 
					logStatic.isDebugEnabled());
			logStatic.fatal("logStatic.fatal: end marker");
		}
		
		String[] attributeNames = logFactory.getAttributeNames();
		int attrNamesLen = attributeNames.length;

		log.trace(
			"\nTRACE: Log logStatic = LogFactory.getLog(OpenAzTutorial.class) -> " +
			"\n\tlogStatic.getClass().getName() = " + 
				logStatic.getClass().getName() +
			"\n\tlogFactory.getClass().getName() = " + 
				logFactory.getClass().getName() +
			"\n\tLogFactory.FACTORY_PROPERTIES = " + 
				LogFactory.FACTORY_PROPERTIES +
			"\n\tLogFactory.FACTORY_PROPERTY = " + 
				 LogFactory.FACTORY_PROPERTY +
			"\n\tLogFactory.FACTORY_DEFAULT = " + 				
				LogFactory.FACTORY_DEFAULT +
			"\n\tLogFactory.DIAGNOSTICS_DEST_PROPERTY = " + 				
				LogFactory.DIAGNOSTICS_DEST_PROPERTY +
			"\n\tLogFactory.HASHTABLE_IMPLEMENTATION_PROPERTY = " + 				
				LogFactory.HASHTABLE_IMPLEMENTATION_PROPERTY +
			"\n\tLogFactory.PRIORITY_KEY = " + 				
				LogFactory.PRIORITY_KEY +
			"\n\tLogFactory.TCCL_KEY = " + 				
				LogFactory.TCCL_KEY +
			"\n\tlogFactory.getAttributeNames().length = " + 
				attrNamesLen + 
			"\n\t\tlogFactory.getAttributeNames() = " + 
				attributeNames);
		if (attrNamesLen > 0) {
			for (int i=0;i<attrNamesLen;i++){
				log.trace("TRACE: logFactory.getAttributeNames()[" 
					+ i + "] = " + attributeNames[i] + 
					"\n\t\t\tvalue = " + 
					logFactory.getAttribute(attributeNames[i]));
			}
		} else {
			log.trace(
				"TRACE: attrNamesLen=0 => " + 
					"probably not reading a simplelog.properties file");
		}
		
		if ( ! (simpleLogClass == null) ) {
			log.trace(
				"\nSimpleLog.LOG_LEVEL_OFF = " + SimpleLog.LOG_LEVEL_OFF +
				"\nSimpleLog.LOG_LEVEL_FATAL = " + SimpleLog.LOG_LEVEL_FATAL +
				"\nSimpleLog.LOG_LEVEL_ERROR = " + SimpleLog.LOG_LEVEL_ERROR +
				"\nSimpleLog.LOG_LEVEL_WARN = " + SimpleLog.LOG_LEVEL_WARN +
				"\nSimpleLog.LOG_LEVEL_INFO = " + SimpleLog.LOG_LEVEL_INFO +
				"\nSimpleLog.LOG_LEVEL_DEBUG = " + SimpleLog.LOG_LEVEL_DEBUG +
				"\nSimpleLog.LOG_LEVEL_TRACE = " + SimpleLog.LOG_LEVEL_TRACE +
				"\nSimpleLog.LOG_LEVEL_ALL = " + SimpleLog.LOG_LEVEL_ALL);
		}
		log.trace(
			"TRACE: logLevel = (String)logFactory.getAttribute(" +
			"\"org.apache.commons.logging.simplelog.defaultlog\")logLevel = " + 
			"\n\t logLevel = " + logLevel + 
			"\n\t loglevelInt = LOG_LEVEL_<logLevel> = " + logLevelInt);
		
		log.trace(
			"TRACE: logFactory.getAttribute(defaultlog) = " + 
			logFactory.getAttribute(
				"org.apache.commons.logging.simplelog.defaultlog"));
				
		// Look at Sun Logger properties
		//  I think these are intended to go w JDK14Logger
		log.trace(
				"TRACE: Logger.getLogger(OpenAzTutorial.class.getName()) -> " +
				"\n\tlogger.getName() =  " + logger.getName() +
				"\n\tlogger.getClass().getName() = " + 
					logger.getClass().getName() +
				"\n\tlogger.getResourceBundle() = " +
					logger.getResourceBundle());
		
		//System.setProperty(
		//		"java.util.logging.config.file", 
		//		".\\policy\\openaz-logging.properties");
		
	}		
}
