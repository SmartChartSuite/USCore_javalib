package edu.gatech.chai.USCore.model.util;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;


public class USCoreDiagnosticReportLabUtil {
	public static final String diagnosticReportLabCategoryUri = "http://terminology.hl7.org/CodeSystem/v2-0074";
	public static final CodeableConcept category = new CodeableConcept()
			.addCoding(new Coding(diagnosticReportLabCategoryUri, "LAB", ""));
}
