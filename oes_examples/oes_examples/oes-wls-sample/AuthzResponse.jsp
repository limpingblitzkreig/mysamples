<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Copyright (c) 2011, Subbu (Subrahmanyam) Devulapalli. All rights reserved. -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type"
	content="no-cache; text/html; charset=UTF-8; no-cache">
<title>Authorization Result</title>
</head>
<%@ page
	import="java.util.*, javax.security.jacc.PolicyContext, com.bea.security.*, weblogic.security.principal.*, javax.security.auth.*,
java.security.*, oracle.security.jps.openaz.pep.*, org.openliberty.openaz.azapi.pep.*,oracle.security.jps.util.SubjectUtil"%>

<body>
	<%      

  Subject user = weblogic.security.Security.getCurrentSubject();

  String applicationName = request.getParameterValues("Application_Name")[0];
  String resourceType = request.getParameterValues("Resource_Type")[0];
  String resourceName = request.getParameterValues("Resource_Name")[0];
  String action = request.getParameterValues("action")[0];
  
  String attr_name[] = new String[3];
  String attr_val[] = new String[3];
  
  attr_name[0] = request.getParameterValues("Attr_1_name")[0];
  attr_val[0] = request.getParameterValues("Attr_1_value")[0];
  
  attr_name[1] = request.getParameterValues("Attr_2_name")[0];
  attr_val[1] = request.getParameterValues("Attr_2_value")[0];
  
  attr_name[2] = request.getParameterValues("Attr_3_name")[0];
  attr_val[2] = request.getParameterValues("Attr_3_value")[0];
  
  if (applicationName.length() == 0) {
  	out.println("<br><b>Application Name should not be null</b>");

  } else if (resourceType.length() == 0) {
    out.println("<br><b>Resource Type should not be null</b>");
  
  } else if (resourceName.length() == 0) {
    out.println("<br><b>Resource Name should not be null</b>");
  
  } else if (action.length() == 0) {
    out.println("<br><b>Action Name should not be null</b>");
  
  } else {
 
  	String fullyQualifiedResource = applicationName + "/" + resourceType + "/" + resourceName;
  	
  	// Environmental/Context attributes
    Map<String, String> applicationContext = null;
    if (attr_name[0].length() > 0) {
     applicationContext = new HashMap<String, String>();
     applicationContext.put(attr_name[0], attr_val[0]);
     
     if (attr_name[1].length() > 0) {
       applicationContext.put(attr_name[1], attr_val[1]);
     }

     if (attr_name[2].length() > 0) {
       applicationContext.put(attr_name[2], attr_val[2]);
     }

    }
  	
  
  
    PepResponse oes_response = 
        PepRequestFactoryImpl.getPepRequestFactory()
                .newPepRequest(
                        user,   
                        action, 
                        fullyQualifiedResource,
                        applicationContext).decide();

  	out.println("<b>Authorization Response: " + oes_response.allowed() + "</b><br>");
  	out.println("<br>Authenticated User Name: " + request.getRemoteUser());
  	out.println("<br>Application Name: " + applicationName);
  	out.println("<br>Resource Type: " + resourceType);
  	out.println("<br>Resource: " + resourceName);
  	out.println("<br>Fully Qualified Resource:<br>" + fullyQualifiedResource);
  	out.println("<br>Action: " + action);
  	
    Map<String, Obligation> obligations = oes_response.getObligations();
    if (null != obligations) {
      out.println("<br><br>obligations:");
      int i = 0;
      for (String name : obligations.keySet()) {
        out.println("<br><br>(" + ++i + ") name = " + name + ", values = "
            + obligations.get(name).getStringValues());
      }
    } else {
       out.println("<br>No Obligations");
    }


  }
                        
%>

	<!-- 
	<br>
	<br>
	<br>
	<a href="AuthzRequest.html">Run another authorization</a>

	<br>
	<br>
	<a href="logout.jsp">Logout</a>
-->
</body>
</html>