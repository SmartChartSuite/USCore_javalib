/*
 * Filename: /Users/mc142/Documents/workspace/BSeR/USCore_javalib/src/main/java/edu/gatech/chai/USCore/model/USCorePractitioner copy.java
 * Path: /Users/mc142/Documents/workspace/BSeR/USCore_javalib/src/main/java/edu/gatech/chai/USCore/model
 * Created Date: Thursday, April 20th 2023, 1:57:37 pm
 * Author: Myung Choi
 * 
 * Copyright (c) 2023 GTRI - Health Emerging and Advanced Technologies (HEAT)
 */
package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.Reference;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.CommonUtil;
import edu.gatech.chai.USCore.model.util.USCoreObservationSocialHistoryUtil;

@ResourceDef(name = "Observation", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-observation-social-history")
public class USCoreObservationSocialHistory extends Observation{
	
	public USCoreObservationSocialHistory() {
		super();
		addCategory(USCoreObservationSocialHistoryUtil.socialHistoryCategory);
	}
	
	public USCoreObservationSocialHistory(CodeableConcept code, Reference subjectReference) {
		super();
		addCategory(USCoreObservationSocialHistoryUtil.socialHistoryCategory);

		this.setCode(code);
		this.setSubject(subjectReference);
	}

	public USCoreObservationSocialHistory(CodeableConcept code, USCorePatient subject) {
		super();
		addCategory(USCoreObservationSocialHistoryUtil.socialHistoryCategory);

		this.setCode(code);
		this.setSubject(subject.castToReference(subject));
	}

	public void addSdohCategory() {
		for (CodeableConcept codeableConcept : getCategory()) {
			for (Coding coding : codeableConcept.getCoding()) {
				if (CommonUtil.observationSdohCategoryUri.equals(coding.getSystem()) 
					&& "sdoh".equals(coding.getCode())) {
						// We already have this.
						return;
				}
			}
		}

		// We do not have SOOH category. Add it now
		this.addCategory(CommonUtil.sdohCategory());
	}
}
