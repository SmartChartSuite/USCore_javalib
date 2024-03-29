package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Practitioner;

import ca.uhn.fhir.model.api.annotation.ResourceDef;

@ResourceDef(name = "Practitioner", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitioner")
public class USCorePractitioner extends Practitioner{
	
	public USCorePractitioner(){
		super();
	}
	
	public USCorePractitioner(Identifier identifier, HumanName name) {
		super();
		this.addIdentifier(identifier);
		this.addName(name);
	}
}
