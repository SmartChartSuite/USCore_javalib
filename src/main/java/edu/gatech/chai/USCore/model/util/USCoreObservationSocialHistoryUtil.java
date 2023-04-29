/*
 * Filename: /Users/mc142/Documents/workspace/BSeR/USCore_javalib/src/main/java/edu/gatech/chai/USCore/model/util/USCoreVitalSignsUtil copy.java
 * Path: /Users/mc142/Documents/workspace/BSeR/USCore_javalib/src/main/java/edu/gatech/chai/USCore/model/util
 * Created Date: Friday, April 21st 2023, 11:03:55 am
 * Author: Myung Choi
 * 
 * Copyright (c) 2023 GTRI - Health Emerging and Advanced Technologies (HEAT)
 */
package edu.gatech.chai.USCore.model.util;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;


public class USCoreObservationSocialHistoryUtil {
	public static final String observationSocialHistoryCategoryUri = "http://terminology.hl7.org/CodeSystem/observation-category";
	public static final CodeableConcept socialHistoryCategory = new CodeableConcept()
			.addCoding(new Coding(observationSocialHistoryCategoryUri, "social-history", ""));
}
