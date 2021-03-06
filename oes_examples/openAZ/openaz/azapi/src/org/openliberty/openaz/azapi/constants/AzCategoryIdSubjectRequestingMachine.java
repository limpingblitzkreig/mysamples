/**
 * Copyright 2009 Oracle, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *
 * Authors:
 * 		Rich Levinson (Oracle)
 * Contributor:
 * 		Rich Levinson (Oracle)
 */
package org.openliberty.openaz.azapi.constants;

/** The AzCategoryIdSubjectRequestingMachine identifier indicates 
 * a system entity associated with the computer that initiated the 
 * access request. An example would be an IPsec identity. 
 */
public enum AzCategoryIdSubjectRequestingMachine implements AzCategoryId {
	/** XACML Category: <b>urn:oasis:names:tc:xacml:1.0:subject-category:requesting-machine</b>. */ 
	AZ_CATEGORY_ID_SUBJECT_REQUESTING_MACHINE(
			"urn:oasis:names:tc:xacml:1.0:subject-category:requesting-machine");
	private final String azCategoryId;

	AzCategoryIdSubjectRequestingMachine(String azCategoryId) {
		this.azCategoryId = azCategoryId;
	}

	@Override
	public String toString() {
		return azCategoryId;
	}
}