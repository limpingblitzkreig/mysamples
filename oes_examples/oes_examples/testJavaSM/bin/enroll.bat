@echo off
@rem Copyright (c) 2004-2008 Oracle and/or its affiliates. All rights reserved.

call setOesEnv.bat

java -classpath %OES_CLASSPATH% -Doracle.security.jps.config=%JPS_CONFIG_PATH% -Dinstance.home=%INSTANCE_HOME% oracle.security.oes.enroll.EnrollmentClient -mode enroll -url https://dappiam01.cap.org:8201/enroll -smid testJavaSM %*


