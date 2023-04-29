/*
 * Filename: /Users/mc142/Documents/workspace/BSeR/USCore_javalib/src/main/java/edu/gatech/chai/USCore/model/USCoreOrganization copy.java
 * Path: /Users/mc142/Documents/workspace/BSeR/USCore_javalib/src/main/java/edu/gatech/chai/USCore/model
 * Created Date: Friday, April 28th 2023, 12:02:52 am
 * Author: Myung Choi
 * 
 * Copyright (c) 2023 GTRI - Health Emerging and Advanced Technologies (HEAT)
 */
package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.Reference;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.USCoreSmokingStatusObservationUtil;

@ResourceDef(name = "Observation", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-smokingstatus")
public class USCoreSmokingStatusObservation extends Observation{

	public USCoreSmokingStatusObservation() {
		super();
		this.addCategory(USCoreSmokingStatusObservationUtil.smokingStatusObservationSocialHistoryCategory);
	}
	
	public USCoreSmokingStatusObservation(ObservationStatus status, CodeableConcept code, Reference subjectReference, CodeableConcept value) {
		super();
		this.addCategory(USCoreSmokingStatusObservationUtil.smokingStatusObservationSocialHistoryCategory);

		this.setStatus(status);
		this.setCode(code);
		this.setSubject(subjectReference);
		this.setValue(value);
	}
}
