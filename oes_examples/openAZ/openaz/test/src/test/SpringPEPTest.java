package test;

//import java.util.Arrays;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;

import org.openliberty.openaz.azapi.pep.PepRequestFactory;
import org.openliberty.openaz.azapi.pep.PepRequest;
import org.openliberty.openaz.azapi.pep.PepResponse;
import org.openliberty.openaz.pep.PepRequestFactoryImpl;

//import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.TestUtils;

/**
 * This is an example  that shows how to use Spring to configure a PEP
 */
public class SpringPEPTest {
    static TestUtils testUtils = new TestUtils();
    public static void main (String [] args)  throws Exception {
        
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {args[0]});
        
        
        PepRequestFactory pep = (PepRequestFactoryImpl)context.getBean("pep");
        
        PepRequest req = pep.newPepRequest("josh","read","foo");
        
        PepResponse resp = req.decide();
        
        System.out.println(resp.allowed());
        
        if (resp.allowed()) {
            testUtils.logObligations(resp);
            /*
            Map<String,Obligation> obligations = resp.getObligations();
            
            Iterator<String> obligationsIt = obligations.keySet().iterator();
            
            while (obligationsIt.hasNext()) {
                
                String obligationName = obligationsIt.next();
                
                Map<String,String> values = obligations.get(obligationName);
                
                System.out.println(obligationName+"=>"+values);
            }
            */
            
            
        }
        
    }
   
}
