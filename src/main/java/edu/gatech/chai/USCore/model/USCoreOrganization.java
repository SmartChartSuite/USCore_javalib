package edu.gatech.chai.USCore.model;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Organization;

import ca.uhn.fhir.model.api.annotation.ResourceDef;

@ResourceDef(name = "Organization", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-organization")
public class USCoreOrganization extends Organization{
	public USCoreOrganization(Identifier identifier, boolean active, String name) {
		this.addIdentifier(identifier);
		this.setActive(active);
		this.setName(name);
	}
	
	public USCoreOrganization addAddress(Address address) {
		checkAddress(address);
		return this.addAddress(address);
	}
	
	public void checkAddress(Address address) {
		if(address.getLine().size() > 4) {
			throw new FHIRException("Address has more than 4 lines and is not compliant with"
					+ "USCoreOrganization resource.Consider removing lines from Address");
		}
		if(address.getState() != null && address.getState().length() > 2) {
			throw new FHIRException("State designation of '" + address.getState()
					+ "'is longer than 2 characters. Use 2 letter state designations as defined in"
					+ "http://hl7.org/fhir/us/core/ValueSet-us-core-usps-state.html");
		}
		return;
	}
}
