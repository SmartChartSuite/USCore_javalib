package edu.gatech.chai.USCore.model;

import java.util.Date;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.DiagnosticReport;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Type;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.USCoreCarePlanUtil;
import edu.gatech.chai.USCore.model.util.USCoreDiagnosticReportLabUtil;

@ResourceDef(name = "DiagnosticReport", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-diagnosticreport-note")
public class USCoreDiagnosticReportNote extends DiagnosticReport{
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1210607509426619954L;

	public USCoreDiagnosticReportNote(){
		super();
	}
	
	public USCoreDiagnosticReportNote(DiagnosticReportStatus status, CodeableConcept category, CodeableConcept code, Reference subject, DateTimeType effective, Date issued) {
		super();
		this.setStatus(status);
		this.addCategory(category);
		this.setCode(code);
		this.setSubject(subject);
		this.setEffective(effective);
		this.setIssued(issued);
	}
	
	public USCoreDiagnosticReportNote(DiagnosticReportStatus status, CodeableConcept category, CodeableConcept code, Reference subject, Period effective, Date issued) {
		super();
		this.setStatus(status);
		this.addCategory(category);
		this.setCode(code);
		this.setSubject(subject);
		this.setEffective(effective);
		this.setIssued(issued);
	}
	
}