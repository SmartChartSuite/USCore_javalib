package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Type;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.USCoreVitalSignsUtil;

@ResourceDef(name = "Observation", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-vital-signs")
public class USCoreVitalSigns extends Observation{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6051333994034814052L;

	public USCoreVitalSigns(ObservationStatus status, CodeableConcept code, Reference subject, DateTimeType effective) {
		super();
		this.setStatus(status);
		this.addCategory(USCoreVitalSignsUtil.category);
		this.setSubject(subject);
		this.setEffective(effective);
	}
	
	public USCoreVitalSigns(ObservationStatus status, CodeableConcept code, Reference subject, Period effective) {
		super();
		this.setStatus(status);
		this.setSubject(subject);
		this.setEffective(effective);
	}
	
	public USCoreVitalSigns(ObservationStatus status, CodeableConcept code, Reference subject, DateTimeType effective, Type value) {
		this(status,code,subject,effective);
		//TODO: Set check for UCUM values
		this.setValue(value);
	}
	
	public USCoreVitalSigns(ObservationStatus status, CodeableConcept code, Reference subject, Period effective, Type value) {
		this(status,code,subject,effective);
		//TODO: Set check for UCUM values
		this.setValue(value);
	}
	
}
