package edu.gatech.chai.USCore.model.util;

import java.util.Arrays;
import java.util.List;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;

public class USCoreBloodPressureUtil {
        public static CodeableConcept code = new CodeableConcept().addCoding(
                        new Coding("http://loinc.org", "85354-9", "Blood Pressure"));
        public static CodeableConcept systolicBPComponentCode = new CodeableConcept().addCoding(
                        new Coding("http://loinc.org", "8480-6", "Systolic Blood Pressure"));
        public static CodeableConcept diastolicBPComponentCode = new CodeableConcept().addCoding(
                        new Coding("http://loinc.org", "8462-4", "Diastolic blood pressure"));
        public static List<String> valueCodes = Arrays.asList(new String[] { "mm[Hg]" });
}
