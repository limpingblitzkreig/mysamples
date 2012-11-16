#!/bin/sh
#
# $Header: entsec/oes/enroll/src/sh/setOesEnv.sh /entsec_11.1.1.4.0_dwg/3 2011/03/04 21:42:08 sregmi Exp $
#
# setOesEnv.sh
#
# Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved. 
#
#    NAME
#      setOesEnv.sh - <one-line expansion of the name>
#
#    DESCRIPTION
#      <short description of component this file declares/defines>
#
#    NOTES
#      <other useful comments, qualifications, etc.>
#
#    MODIFIED   (MM/DD/YY)
#    lelai       03/01/11 - Fix the classpath
#    sregmi      02/10/11 - XbranchMerge sregmi_oes_install_2 from main
#    sregmi      02/01/11 - Fix Classpath
#    emlin       01/25/11 - change pd jar file name
#    wcai        01/16/11 - Creation
#

INSTANCE_HOME=@instance.home@
export INSTANCE_HOME

OES_CLIENT_HOME=@OES_CLIENT_HOME@
export OES_CLIENT_HOME

CLASSPATHSEP=":"
export CLASSPATHSEP

OES_CLASSPATH="${OES_CLIENT_HOME}/modules/oracle.oes.sm_11.1.1/oes-client.jar:${CLASSPATH}"
export OES_CLASSPATH

JPS_CONFIG_PATH=${INSTANCE_HOME}/config/jps-config.xml
export JPS_CONFIG_PATH


