@echo off
@rem Copyright (c) 2004-2008 Oracle and/or its affiliates. All rights reserved.

SET INSTANCE_HOME=c:\Oracle\fmw\oes_client\oes_sm_instances\testJavaSM

SET OES_CLIENT_HOME=c:\Oracle\fmw\oes_client

SET OES_CLASSPATH=%OES_CLIENT_HOME%\modules\oracle.oes.sm_11.1.1\oes-client.jar;%CLASSPATH%

SET JPS_CONFIG_PATH=%INSTANCE_HOME%\config\jps-config.xml


