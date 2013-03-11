/**
 * 
 */
package org.cap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;


import org.cap.services.securityservice.auth.AccessControlServiceRemote;
import org.cap.services.securityservice.auth.AccessControlServiceHome;
import org.cap.services.securityservice.auth.VirtualResources;



/**
 * @author ssarkar
 *
 */
public class TestSecurityServiceEJB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //JNDI name could be moved to a config file if change is anticipated.
		String _ADMIN_SERVICE_JNDI = "ejb.AccessControlServiceRemoteHome";
		AccessControlServiceRemote _accessService = null;
		try{		
			if (_accessService == null) { 
				Context ctx = new InitialContext(createEnvironment());
				Object admHomeObj = ctx.lookup(_ADMIN_SERVICE_JNDI);
				AccessControlServiceHome admHome = (AccessControlServiceHome) 
					PortableRemoteObject.narrow(
						admHomeObj, AccessControlServiceHome.class);
				_accessService = admHome.create();
			}	
			
		/*	String[] accessIDs = _accessService.getListUsers(
					"1544501",
					VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS);
			System.out.println(accessIDs);
		*/
			
			/*1003681, 1005041, 1005569, 1012417, 1014196, 1014202, 1014206, 1021380, 1032239, 1035304, 1045289, 1059847, 1059850, 
			 * 1081028, 1082796, 1091049, 1091348, 1096542, 1097003, 1102286, 1110854, 1114935, 1115403, 1115459, 1115983, 1116089, 1116735, 
			 * 1122622, 1136358, 1137548, 1138862, 1145014, 1147151, 1151313, 1156234, 1156422, 1159605, 1162510, 1165589, 1166726, 1167919, 
			 * 1173009, 1173014, 1173296, 1173436, 1173491, 1173609, 1173728, 1173773, 1173789, 1173794, 1173814, 1173824, 1173845, 1173856, 
			 * 1173858, 1173866, 1173902, 1173913, 1173925, 1173996, 1174017, 1174123, 1174195, 1174345, 1174430, 1174831, 1174987, 1175139, 
			 * 1175216, 1177484, 1178329, 1178335, 1178509, 1178831, 1178905, 1178985, 1179344, 1179616, 1179630, 1179631, 1179707, 1179869, 
			 * 1179918, 1179996, 1180186, 1180315, 1180738, 1180923, 1180928, 1180952, 1180977, 1181348, 1181542, 1181546, 1181839, 1182282, 
			 * 1183989, 1183995, 1184058, 1184072, 1184098, 1184203, 1184318, 1184366, 1184451, 1184483, 1184585, 
			 * 1184706, 1185977, 1186917, 1187393, 1187621, 1187713, 1192729, 1192849, 1256195, 900704, 905565]
			 */ 
			long begintime = Calendar.getInstance().getTimeInMillis();
			 System.out.println("Begin " + begintime);
			System.out.println(_accessService.accessAllowed("1014196", "1544501", VirtualResources.EDU_PORTAL_OCATP,
			org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));	
			System.out.println(_accessService.accessAllowed("1014196", "1003681", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1005041", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1005569", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1012417", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1014196", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1014202", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1014206", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1021380", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1032239", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1035304", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1045289", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1059847", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1059850", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1081028", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1082796", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1091049", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1091348", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1096542", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1097003", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1102286", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1110854", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1114935", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1115403", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1115459", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1115983", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1116089", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1116735", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1122622", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1136358", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1137548", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1138862", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1145014", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1147151", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1151313", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1156234", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1156422", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1159605", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1162510", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1165589", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1166726", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1167919", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173009", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173014", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173296", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173436", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173491", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173609", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173728", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173773", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173789", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173794", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173814", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173824", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173845", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173856", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173858", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173866", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173902", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173913", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173925", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1173996", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1174017", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1174123", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1174195", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1174345", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1174430", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1174831", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1174987", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1175139", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1175216", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1177484", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1178329", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1178335", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1178509", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1178831", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1178905", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1178985", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1179344", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1179616", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1179630", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1179631", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1179707", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1179869", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1179918", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1179996", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1180186", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1180315", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1180738", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1180923", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1180928", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1180952", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1180977", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1181348", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1181542", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1181546", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1181839", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1182282", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1183989", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1183995", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184058", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184072", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184098", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184203", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184318", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184366", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184451", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184483", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184585", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1184706", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1185977", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1186917", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1187393", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1187621", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1187713", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1192729", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1192849", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "1256195", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "900704", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1014196", "905565", VirtualResources.EDU_PORTAL_OCATP,
					org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
		System.out.println(_accessService.accessAllowed("1003681", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1005041", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1005569", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1012417", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1014196", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1014202", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1014206", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1021380", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1032239", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1035304", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1045289", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1059847", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1059850", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1081028", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1082796", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1091049", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1091348", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1096542", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1097003", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1102286", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1110854", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1114935", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1115403", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1115459", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1115983", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1116089", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1116735", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1122622", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1136358", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1137548", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1138862", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1145014", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1147151", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1151313", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1156234", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1156422", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1159605", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1162510", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1165589", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1166726", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1167919", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173009", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173014", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173296", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173436", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173491", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173609", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173728", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173773", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173789", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173794", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173814", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173824", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173845", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173856", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173858", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173866", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173902", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173913", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173925", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1173996", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1174017", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1174123", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1174195", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1174345", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1174430", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1174831", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1174987", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1175139", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1175216", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1177484", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1178329", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1178335", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1178509", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1178831", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1178905", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1178985", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1179344", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1179616", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1179630", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1179631", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1179707", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1179869", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1179918", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1179996", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1180186", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1180315", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1180738", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1180923", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1180928", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1180952", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1180977", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1181348", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1181542", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1181546", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1181839", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1182282", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1183989", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1183995", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184058", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184072", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184098", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184203", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184318", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184366", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184451", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184483", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184585", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1184706", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1185977", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1186917", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1187393", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1187621", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1187713", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1192729", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1192849", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("1256195", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("900704", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	System.out.println(_accessService.accessAllowed("905565", "1544501", VirtualResources.EDU_PORTAL_OCATP,
				org.cap.services.securityservice.auth.EducationPrivilege.OCATP_ACCESS));
	long endtime = 	 Calendar.getInstance().getTimeInMillis();
	System.out.println("End " + endtime);	
	System.out.println("Time take for crosslogix " + (endtime - begintime));
	 begintime = Calendar.getInstance().getTimeInMillis();
	 System.out.println("Begin OES " + begintime);
	 //System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1775301&user=1080062"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1775301&user=1080062"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1849001&user=1080062"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1877201&user=1080062"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=6946301&user=1080062"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7176237&user=1080062"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7190874&user=1080062"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1953401&user=1000437"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7214706&user=1000437"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=4197601&user=1054300"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7198109&user=1158661"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2702101&user=900034"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1524601&user=1105696"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2008703&user=1044171"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7091101&user=1047815"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=4628601&user=1105260"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7186489&user=904286"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2491601&user=1099463"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1361101&user=1011003"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2459601&user=1037081"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1606211&user=1024306"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2472805&user=1072602"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2473001&user=1072602"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1289901&user=122636"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1205201&user=242295"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1885101&user=1038986"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1233701&user=1036659"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2893201&user=1104625"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7182479&user=597698"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2031901&user=1179664"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1714201&user=1142553"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1399201&user=703489"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7177824&user=1004213"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7091101&user=1127476"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2239701&user=1033898"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7175222&user=905564"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1854001&user=1170601"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7198048&user=1170601"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=4340001&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220278&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220279&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220351&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220354&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220393&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220394&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220395&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220396&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220397&user=1152431"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1949401&user=1058656"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1636401&user=83850"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1673201&user=83850"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=3852901&user=1158782"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1471401&user=1055402"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1482201&user=1055402"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7197913&user=1055402"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1416201&user=1029146"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7183636&user=1158794"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1432501&user=1091194"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1575701&user=125185"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=4096001&user=1104887"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1032101&user=1128760"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1808227&user=1085530"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1662101&user=1069786"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1719736&user=1183807"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1320901&user=131852"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1430301&user=1022263"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2422001&user=1007142"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1644803&user=1066188"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1644903&user=1066188"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1287609&user=1065776"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1533401&user=237358"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1841901&user=1152151"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1708801&user=1098093"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7212993&user=1098093"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1413501&user=549761"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1413701&user=549761"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2141901&user=1171055"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1667801&user=1218858"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7195086&user=1124594"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2078901&user=1105770"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1175601&user=1127861"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2675401&user=1127861"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1807901&user=1065846"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1852401&user=1070295"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2000403&user=1192839"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2477601&user=106001"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1172001&user=1152259"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2398601&user=1160549"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2011201&user=1043276"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2011207&user=1043276"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2535901&user=1043276"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=6785001&user=1043276"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=6957801&user=1043276"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=6213201&user=1111577"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1261001&user=1210501"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2381201&user=1095266"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=3814601&user=1056379"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1555601&user=1041024"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1172001&user=901485"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1373501&user=905579"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1373601&user=905579"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2363401&user=1023573"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2366901&user=1023573"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1637201&user=1084754"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1163001&user=930728"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=3738601&user=1188741"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1439701&user=1081148"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1671301&user=1199035"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7217615&user=1209114"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1131301&user=218115"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1298101&user=1050425"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1637201&user=1083466"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7030601&user=1040060"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7210092&user=1180550"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1298101&user=713455"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1595601&user=1013566"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1687701&user=1114803"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1677701&user=1040743"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1714201&user=900917"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1714201&user=1132285"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1755401&user=1027419"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1632801&user=1003163"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1952901&user=1028213"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2312701&user=1028213"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1224501&user=1052817"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1974901&user=1073854"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1932101&user=602600"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2325301&user=1028193"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1295601&user=1018846"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2864601&user=1145805"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7210191&user=1182140"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1936501&user=1020773"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1974901&user=1117919"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=4319001&user=1045454"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1824301&user=1209055"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=6822604&user=1028487"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7199050&user=1028487"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7207294&user=1028487"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7197938&user=1030469"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1808201&user=1085528"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1808225&user=1085528"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1808229&user=1085528"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2587001&user=1108935"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1329401&user=1105154"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1569002&user=1217464"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=6768501&user=1217464"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=3152101&user=1026152"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2197201&user=1023792"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7220763&user=1213123"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1776301&user=1034404"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1685301&user=1020521"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1888701&user=1014779"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2316701&user=1086264"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1944101&user=1180607"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1364801&user=1011962"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1122701&user=177519"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=3144701&user=1063385"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7191467&user=1108139"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1855001&user=1060167"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1122701&user=1142457"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1699501&user=1213395"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1637201&user=1108504"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1460701&user=1117660"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2178103&user=1076471"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1746302&user=1077365"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1676601&user=1124953"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1335401&user=1161437"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1708801&user=1218849"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1176601&user=1087223"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1493101&user=1109238"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2439910&user=1218903"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1174501&user=89210"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2231001&user=1057919"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1727501&user=1080359"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1184103&user=1041769"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1826101&user=1070970"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2864601&user=1177935"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2431701&user=1187599"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=3010801&user=1155158"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1233701&user=1152652"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7194166&user=1071135"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2927301&user=1109263"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=4150301&user=1129389"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1935403&user=1024104"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7221015&user=237710"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1384801&user=1048454"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7008101&user=1061039"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1869201&user=134053"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1325401&user=1111575"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1306901&user=1202710"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1332201&user=1091687"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7190874&user=94069"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2192701&user=1142736"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1644801&user=1042473"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1644901&user=1042473"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1753101&user=120614"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1303801&user=1012423"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=5525504&user=1097828"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=3126101&user=1013619"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7219856&user=1013619"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7231951&user=574336"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=6982201&user=1071148"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=6982203&user=1071148"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1399201&user=1088426"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2327201&user=1075862"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7209152&user=1075862"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1319101&user=1051347"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1869201&user=904430"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1176901&user=1070350"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1180701&user=1070350"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7199055&user=1070350"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1568001&user=1039520"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7198959&user=1165208"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1664801&user=1032238"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1894301&user=596480"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1936501&user=1043266"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1407201&user=1081092"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1407213&user=1081092"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1407218&user=1081092"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7194152&user=1081092"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1073201&user=1057075"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1193301&user=1129515"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2374401&user=1098228"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1865201&user=192213"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1683501&user=1155747"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1683502&user=1155747"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1340501&user=1068025"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1305701&user=1143032"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1579102&user=1083975"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1193101&user=1012692"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1160101&user=1025736"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7184054&user=1158840"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1332601&user=1019053"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1160201&user=1009626"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1160205&user=1009626"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=2610501&user=1086285"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7185324&user=1003987"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=7106701&user=1053353"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1714201&user=1134128"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1121701&user=1060963"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1128701&user=1060963"));
	 System.out.println(getHttpResponse("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data/exec?selectedorg=1129117&user=1060963"));
	 endtime = 	 Calendar.getInstance().getTimeInMillis();
		System.out.println("End " + endtime);	
		System.out.println("Time take for oes " + (endtime - begintime));
	/*
1180001
1157537
1005569
1014189
1032239
1180738
1069904
1097003
1081028
1005041
1035306
1059847
1045289
1081027
900704
1178091
1014206
905565
1091049
1058461
1115403
1069892
1014918
1161873
1194788
1156422
1082796
1173296
1114935
1206079
1147585
1287640
1318729
1198495
	 */
		}
		catch (Exception e) {
			e.printStackTrace();

			System.out.println("Error getting ejb handle");
		} 

	}


	public static String getHttpResponse(String oesURLString) {
        String retString = "";
        try {
            StringBuffer sb = new StringBuffer();
            URL oesURL = new URL(oesURLString);
            URLConnection yc = oesURL.openConnection();
            BufferedReader in =
                new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();
            retString = sb.toString();
        } catch (Exception ex) {
            System.out.println("Error retrieving URL:" + ex.getMessage());
        }
        return (retString);
    }

    /**     
     * Returns an instance of the JNDI environment for default EJB services.
     * @return an instance of the JNDI environment for default EJB services.
     */   
    public static Hashtable createEnvironment() {
    	String factory = "weblogic.jndi.WLInitialContextFactory"; 
        String url = "t3://10.10.1.171:7011";
        String user ="guest"; 
       
        String password ="guest"; 

        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, factory);
        env.put(Context.PROVIDER_URL, url);
    
        if (user != null) {
            env.put(Context.SECURITY_PRINCIPAL, user);
            if (password == null) {
                password = "";
            }
            env.put(Context.SECURITY_CREDENTIALS, password);
        }
        return env;
    }
}
