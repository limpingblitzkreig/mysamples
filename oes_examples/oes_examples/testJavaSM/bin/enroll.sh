#!/bin/sh
#
# $Header: entsec/oes/enroll/src/sh/enroll.sh /entsec_11.1.1.4.0_dwg/2 2011/02/21 04:55:06 wcai Exp $
#
# enroll.sh
#
# Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved. 
#
#    NAME
#      enroll.sh - <one-line expansion of the name>
#
#    DESCRIPTION
#      <short description of component this file declares/defines>
#
#    NOTES
#      <other useful comments, qualifications, etc.>
#
#    MODIFIED   (MM/DD/YY)
#    wcai        02/21/11 - XbranchMerge wcai_trans_enroll_enhancement from
#                           main
#    wcai        02/13/11 - Support command line arguments
#    wcai        01/17/11 - Creation
#

. ./setOesEnv.sh

java -classpath ${OES_CLASSPATH} -Doracle.security.jps.config=${JPS_CONFIG_PATH} -Dinstance.home=${INSTANCE_HOME} oracle.security.oes.enroll.EnrollmentClient -mode enroll -url https://dappiam01.cap.org:8201/enroll -smid testJavaSM $*


