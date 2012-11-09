<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<!-- Copyright (c) 2011, Subbu (Subrahmanyam) Devulapalli. All rights reserved. -->
<% 
session.invalidate();
response.sendRedirect(request.getContextPath() + "/welcome.html");
%>
