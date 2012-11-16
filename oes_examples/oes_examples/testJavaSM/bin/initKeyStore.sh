#!/bin/sh
#
# $Header: entsec/oes/enroll/src/sh/initKeyStore.sh /entsec_11.1.1.4.0_dwg/1 2011/01/31 00:50:27 emlin Exp $
#
# initkeystore.sh
#
# Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved. 
#
#    NAME
#      initkeystore.sh - <one-line expansion of the name>
#
#    DESCRIPTION
#      <short description of component this file declares/defines>
#
#    NOTES
#      <other useful comments, qualifications, etc.>
#
#    MODIFIED   (MM/DD/YY)
#    emlin       01/22/11 - init key
#    wcai        01/17/11 - Creation
#


. ./setOesEnv.sh

java -classpath ${OES_CLASSPATH} -Dinstance.home=${INSTANCE_HOME} -Doracle.security.jps.config=${JPS_CONFIG_PATH} oracle.security.oes.tool.init.InitialKeyStores
java -classpath ${OES_CLASSPATH} -Dinstance.home=${INSTANCE_HOME} -Doracle.security.jps.config=${JPS_CONFIG_PATH} oracle.security.oes.tool.init.InitialKey
