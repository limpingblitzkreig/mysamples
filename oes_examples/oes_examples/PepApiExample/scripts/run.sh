#!/bin/sh

. build.properties

CLASSPATH="$CLASSPATH:${MIDDLEWARE_HOME}/${IDM_NAME}/modules/org.openliberty.openaz.azapi_1.0.jar"
CLASSPATH="$CLASSPATH:${MIDDLEWARE_HOME}/${IDM_NAME}/modules/oracle.jps_11.1.1/jps-platform.jar"
CLASSPATH="$CLASSPATH:${MIDDLEWARE_HOME}/${IDM_NAME}/modules/oracle.jps_11.1.1/jps-az-api.jar"
CLASSPATH="$CLASSPATH:${MIDDLEWARE_HOME}/${IDM_NAME}/modules/oracle.jps_11.1.1/jps-pep.jar"
CLASSPATH="$CLASSPATH:${MIDDLEWARE_HOME}/${IDM_NAME}/modules/oracle.jps_11.1.1/jps-manifest.jar"
CLASSPATH="$CLASSPATH:${MIDDLEWARE_HOME}/${IDM_NAME}/modules/oracle.jps_11.1.1/jps-platform.jar"
CLASSPATH="$CLASSPATH:${MIDDLEWARE_HOME}/${IDM_NAME}/modules/javax.servlet_1.0.0.0_2-5.jar"
CLASSPATH="$CLASSPATH:${MIDDLEWARE_HOME}/modules/javax.security.jacc_1.0.0.0_1-1.jar"
CLASSPATH="$CLASSPATH:${OES_CLIENT_HOME}/modules/oracle.oes.sm_11.1.1/oes-client.jar"
CLASSPATH="$CLASSPATH:../lib/PepSampleApp.jar"

export CLASSPATH
#echo $CLASSPATH


OES_INSTANCE_HOME="${OES_CLIENT_HOME}/oes_sm_instances/${OES_INSTANCE_NAME}"
export OES_INSTANCE_HOME


${JAVA_HOME}/bin/java -Doracle.security.jps.config=${OES_INSTANCE_HOME}/config/jps-config.xml oracle.security.example.PepSampleApp

