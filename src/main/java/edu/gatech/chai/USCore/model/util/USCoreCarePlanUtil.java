package edu.gatech.chai.USCore.model.util;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;


public class USCoreCarePlanUtil {
	public static final String observationCategoryUri = "http://hl7.org/fhir/ValueSet/observation-category";
	public static final CodeableConcept category = new CodeableConcept()
			.addCoding(new Coding(observationCategoryUri, "vital-signs", ""));
}
