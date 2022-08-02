package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.CarePlan;
import org.hl7.fhir.r4.model.CareTeam;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Type;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.USCoreCarePlanUtil;

@ResourceDef(name = "CareTeam", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-careteam")
public class USCoreCareTeam extends CareTeam{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5388914860244507422L;
	
	public USCoreCareTeam(){
		super();
	}

	public USCoreCareTeam(CareTeamStatus status, Reference subject, CodeableConcept participantRole, Reference member) {
		super();
		this.setText(text);
		this.setStatus(getStatus());
		this.setSubject(subject);
		addParticipant(participantRole, member);
	}

	public USCoreCareTeam addParticipant(CodeableConcept participantRole, Reference member) {
		this.addParticipant(new CareTeamParticipantComponent().addRole(participantRole).setMember(member));
		return this;
	}
}