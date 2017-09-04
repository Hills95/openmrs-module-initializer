/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.initializer.api;

import org.openmrs.Concept;
import org.openmrs.api.OpenmrsService;

/**
 * The main service of this module, which is exposed for other modules. See
 * moduleApplicationContext.xml on how it is wired up.
 */
public interface InitializerService extends OpenmrsService {
	
	/**
	 * @return The path to the configuration folder (with NO trailing forward slash), eg.
	 *         "/opt/openmrs/configuration"
	 */
	String getConfigDirPath();
	
	/**
	 * @return The path to the checksum folder (with NO trailing forward slash), eg.
	 *         "/opt/openmrs/configuration_checksums"
	 */
	String getChecksumsDirPath();
	
	/**
	 * Loads the concepts from their domain config. dir, and saves them.
	 */
	void loadConcepts();
	
	/**
	 * Loads the drugs from their domain config. dir, and saves them.
	 */
	void loadDrugs();
	
	/**
	 * Loads the person attribute types from their domain config. dir, and saves them.
	 */
	void loadPersonAttributeTypes();
	
	/**
	 * Loads the global properties from their domain config. dir, and saves them.
	 */
	void loadGlobalProperties();
	
	/**
	 * Configure the idgen related instances (identifier sources... etc).
	 */
	void configureIdgen();
	
	/**
	 * Import the metadata sharing packages from their domain config. dir.
	 */
	void importMetadataSharingPackages();
	
	/**
	 * Loads the key-values into the cache from the JSON files.
	 */
	void loadJsonKeyValues();
	
	/**
	 * Fetches a value from the JSON key-value configuration.
	 */
	String getValueFromKey(String key);
	
	/**
	 * Guesses a concept from the JSON key-value configuration.
	 */
	Concept getConceptFromKey(String key, Concept defaultConcept);
	
	/**
	 * Guesses a concept from the JSON key-value configuration.
	 */
	Concept getConceptFromKey(String key);
}
