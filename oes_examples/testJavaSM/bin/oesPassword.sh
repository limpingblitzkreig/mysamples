#!/bin/sh
#
# $Header: entsec/oes/enroll/src/sh/oesPassword.sh /st_entsec_11.1.1.5.0oesbp/1 2011/08/23 07:50:27 jianz Exp $
#
# oesPassword.sh
#
# Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved. 
#
#    NAME
#      oesPassword.sh - <one-line expansion of the name>
#
#    DESCRIPTION
#      <short description of component this file declares/defines>
#
#    NOTES
#      <other useful comments, qualifications, etc.>
#
#    MODIFIED   (MM/DD/YY)
#    jianz       08/16/11 - fix bug 12857188
#    wcai        04/11/11 - set bootstrap password
#    wcai        02/21/11 - XbranchMerge wcai_trans_enroll_enhancement from
#                           main
#    wcai        02/13/11 - Support command line arguments
#    wcai        01/16/11 - Creation
#


. ./setOesEnv.sh

java -classpath ${OES_CLASSPATH} -Dinstance.home=${INSTANCE_HOME} -Doracle.security.jps.config=${JPS_CONFIG_PATH} oracle.security.oes.tool.oespassword.OesPasswordProd $*

