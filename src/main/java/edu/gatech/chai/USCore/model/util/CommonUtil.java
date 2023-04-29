package edu.gatech.chai.USCore.model.util;

import java.util.Collection;
import java.util.UUID;

import org.hl7.fhir.r4.model.CodeType;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DomainResource;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Resource;

public class CommonUtil {
	public static final String basicBooleanHL7System = "http://hl7.org/CodeSystem/v2-0136";
	public static final String snomedSystemUrl = "http://snomed.info/sct";
	public static final String loincSystemUrl = "http://loinc.org";
	public static final String uspsSystemURL = "https://www.usps.com/";
	public static final String observationSdohCategoryUri = "http://hl7.org/fhir/us/core/CodeSystem/us-core-tags";
	public static final String ucumSystemUrl = "http://unitsofmeasure.org";

	public static Extension getExtension(DomainResource resource, String url) {
		for (Extension extension : resource.getExtension()) {
			if (extension.getUrl().equals(url)) {
				return extension;
			}
		}
		return null;
	}
	
	public static void setUUID(Resource resource) {
		resource.setId(new IdType(UUID.randomUUID().toString()));
	}
	
	public static CodeableConcept findConceptFromCollectionUsingSimpleString(String key,Collection<CodeableConcept> collection) {
		for(CodeableConcept conceptIter:collection) {
			Coding coding = conceptIter.getCodingFirstRep();
			if(coding.getCode().equalsIgnoreCase(key) || coding.getDisplay().equalsIgnoreCase(key)) {
				return conceptIter;
			}
		}
		return null;
	}
	
	public static CodeType findCodeFromCollectionUsingSimpleString(String key,Collection<CodeType> collection) {
		for(CodeType conceptIter:collection) {
			if(conceptIter.getValue().equalsIgnoreCase(key)) {
				return conceptIter;
			}
		}
		return null;
	}
	
	public static boolean assignableFrom(Class test, Class[] candidates){
	    for(Class candidate : candidates){
	        if(candidate.isAssignableFrom(test)){
	            return true;
	        }
	    }

	    return false;
	}

	public static CodeableConcept usCoreProblemListCategory() {
		return new CodeableConcept(new Coding("http://terminology.hl7.org/CodeSystem/condition-category", "problem-list-item", "Problem List Item"));
	}

	public static CodeableConcept usCoreHealthConcernCategory() {
		return new CodeableConcept(new Coding("http://terminology.hl7.org/CodeSystem/condition-category", "health-concern", "Health Concern"));		
	}

	public static CodeableConcept sdohCategory() {
		return new CodeableConcept(new Coding("http://hl7.org/fhir/us/core/CodeSystem/us-core-tags", "sdoh", null));		
	}

	public static CodeableConcept getVitalSignsCategory() {
		return new CodeableConcept(new Coding("http://terminology.hl7.org/CodeSystem/observation-category", "vital-signs", null));
	}

}