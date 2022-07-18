package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.AllergyIntolerance;
import org.hl7.fhir.r4.model.Reference;

import ca.uhn.fhir.model.api.annotation.ResourceDef;

@ResourceDef(name = "AllergyIntolerance", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-allergyintolerance")
public class USCoreAllergyIntolerance extends AllergyIntolerance{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2621850526089714812L;

	public USCoreAllergyIntolerance(Reference patient) {
		super();
		this.setPatient(patient);
	}
}
