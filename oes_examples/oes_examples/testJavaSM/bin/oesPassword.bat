@echo off
@rem Copyright (c) 2004-2008 Oracle and/or its affiliates. All rights reserved.

call setOesEnv.bat

java -classpath %OES_CLASSPATH% -Dinstance.home=%INSTANCE_HOME% -Doracle.security.jps.config=%JPS_CONFIG_PATH% oracle.security.oes.tool.oespassword.OesPasswordProd %*

