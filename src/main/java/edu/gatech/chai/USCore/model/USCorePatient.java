/*
 * Filename: /Users/mc142/Documents/workspace/BSeR/USCore_javalib/src/main/java/edu/gatech/chai/USCore/model/USCoreCondition copy.java
 * Path: /Users/mc142/Documents/workspace/BSeR/USCore_javalib/src/main/java/edu/gatech/chai/USCore/model
 * Created Date: Friday, April 21st 2023, 2:39:11 pm
 * Author: Myung Choi
 * 
 * Copyright (c) 2023 GTRI - Health Emerging and Advanced Technologies (HEAT)
 */
package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Enumerations.AdministrativeGender;

import ca.uhn.fhir.model.api.annotation.ResourceDef;

@ResourceDef(name = "Patient", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-patient")
public class USCorePatient extends Patient {
	

	/**
	 * 
	 */
	public USCorePatient(){
		super();
	}
	
	public USCorePatient(Identifier identifier, HumanName humanName, AdministrativeGender gender) {
		super();

		this.addIdentifier(identifier);
		this.addName(humanName);
		this.setGender(gender);
	}
}