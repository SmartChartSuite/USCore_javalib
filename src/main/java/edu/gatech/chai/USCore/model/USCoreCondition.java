package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.CarePlan;
import org.hl7.fhir.r4.model.CareTeam;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Condition;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Type;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.USCoreCarePlanUtil;

@ResourceDef(name = "Condition", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition")
public class USCoreCondition extends Condition{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2865546892014612401L;

	public USCoreCondition(){
		super();
	}
	
	public USCoreCondition(CodeableConcept category, CodeableConcept code, Reference subject) {
		super();
		this.addCategory(category);
		this.setCode(code);
		this.setSubject(subject);
	}
}