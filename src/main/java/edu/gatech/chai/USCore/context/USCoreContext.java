package edu.gatech.chai.USCore.context;

import ca.uhn.fhir.context.FhirContext;
import edu.gatech.chai.USCore.model.USCoreAllergyIntolerance;
import edu.gatech.chai.USCore.model.USCoreCarePlan;
import edu.gatech.chai.USCore.model.USCoreCareTeam;
import edu.gatech.chai.USCore.model.USCoreCondition;
import edu.gatech.chai.USCore.model.USCoreDiagnosticReportLab;
import edu.gatech.chai.USCore.model.USCoreDiagnosticReportNote;
import edu.gatech.chai.USCore.model.USCoreOrganization;
import edu.gatech.chai.USCore.model.USCorePractitioner;
import edu.gatech.chai.USCore.model.USCoreVitalSigns;

public class USCoreContext extends FhirContext{
	
	public USCoreContext() {
		this.setDefaultTypeForProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-allergyintolerance", USCoreAllergyIntolerance.class);
		this.setDefaultTypeForProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careplan", USCoreCarePlan.class);
		this.setDefaultTypeForProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careteam", USCoreCareTeam.class);
		this.setDefaultTypeForProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition", USCoreCondition.class);
		this.setDefaultTypeForProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-diagnosticreport-lab", USCoreDiagnosticReportLab.class);
		this.setDefaultTypeForProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-diagnosticreport-note", USCoreDiagnosticReportNote.class);
		this.setDefaultTypeForProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-organization", USCoreOrganization.class);
		this.setDefaultTypeForProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitioner", USCorePractitioner.class);
		this.setDefaultTypeForProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-vital-signs", USCoreVitalSigns.class);
	}
}
