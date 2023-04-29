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


public class USCoreSmokingStatusObservationUtil {
	public static final String smokingStatusObservationCategoryUrl = "http://terminology.hl7.org/CodeSystem/observation-category";
	
	public static final CodeableConcept smokingStatusObservationSocialHistoryCategory = new CodeableConcept()
		.addCoding(new Coding(smokingStatusObservationCategoryUrl, "social-history", ""));
	public static final CodeableConcept tobaccoSmokingStatusNHIS = new CodeableConcept()
		.addCoding(new Coding(CommonUtil.loincSystemUrl, "72166-2", "Tobacco smoking status NHIS"));

	// Smoking Status from ValueSet: https://vsac.nlm.nih.gov/valueset/2.16.840.1.113883.11.20.9.38/expansion
	public static final CodeableConcept neverSmokedTobacco = new CodeableConcept()
		.addCoding(new Coding(CommonUtil.snomedSystemUrl, "266919005", "Never smoked tobacco (finding)"));
	public static final CodeableConcept unknownSmokedTobacco = new CodeableConcept()
		.addCoding(new Coding(CommonUtil.snomedSystemUrl, "266927001", "Tobacco smoking consumption unknown (finding)"));
	public static final CodeableConcept occasionalSmokedTobacco = new CodeableConcept()
		.addCoding(new Coding(CommonUtil.snomedSystemUrl, "428041000124106", "Occasional tobacco smoker (finding)"));
	public static final CodeableConcept lightSmokedTobacco = new CodeableConcept()
		.addCoding(new Coding(CommonUtil.snomedSystemUrl, "428061000124105", "Light tobacco smoker (finding)"));
	public static final CodeableConcept heavySmokedTobacco = new CodeableConcept()
		.addCoding(new Coding(CommonUtil.snomedSystemUrl, "428071000124103", "Heavy tobacco smoker (finding)"));
	public static final CodeableConcept dailySmokedTobacco = new CodeableConcept()
		.addCoding(new Coding(CommonUtil.snomedSystemUrl, "449868002", "Smokes tobacco daily (finding)"));
	public static final CodeableConcept smoker = new CodeableConcept()
		.addCoding(new Coding(CommonUtil.snomedSystemUrl, "77176002", "Smoker (finding)"));
	public static final CodeableConcept exSmoker = new CodeableConcept()
		.addCoding(new Coding(CommonUtil.snomedSystemUrl, "8517006", "Ex-smoker (finding)"));

}