package edu.gatech.chai.USCore.model.util;

import java.util.Arrays;
import java.util.List;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;

public class USCoreBMIUtil {
	public static CodeableConcept code = 
			new CodeableConcept().addCoding(
					new Coding("http://loinc.org","39156-5","Body mass index (BMI) [Ratio]"));
	public static List<String> valueCodes = 
			Arrays.asList(new String[]{"kg/m2"});
}
