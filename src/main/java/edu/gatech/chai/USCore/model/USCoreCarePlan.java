package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.CarePlan;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Type;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.USCoreCarePlanUtil;

@ResourceDef(name = "CarePlan", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-careplan")
public class USCoreCarePlan extends CarePlan{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4047361557661129776L;

	public USCoreCarePlan(Narrative text, CarePlanStatus status, CarePlanIntent intent, Reference subject) {
		super();
		this.setText(text);
		this.setStatus(getStatus());
		this.setIntent(intent);
		this.addCategory(USCoreCarePlanUtil.category);
		this.setSubject(subject);
	}
	
}
