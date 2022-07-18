package edu.gatech.chai.USCore.model.util;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;


public class USCoreVitalSignsUtil {
	public static final String careplanCategoryUri = "http://hl7.org/fhir/us/core/CodeSystem/careplan-category";
	public static final CodeableConcept category = new CodeableConcept()
			.addCoding(new Coding(careplanCategoryUri, "assess-plan", ""));
}
