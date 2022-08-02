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

@ResourceDef(name = "DiagnosticReport", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-diagnosticreport-lab")
public class USCoreDiagnosticReportLab extends DiagnosticReport{
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1210607509426619954L;
	
	public USCoreDiagnosticReportLab(){
		super();
	}

	public USCoreDiagnosticReportLab(DiagnosticReportStatus status, CodeableConcept code, Reference subject, DateTimeType effective, Date issued) {
		super();
		this.setStatus(status);
		this.addCategory(USCoreDiagnosticReportLabUtil.category);
		this.setCode(code);
		this.setSubject(subject);
		this.setEffective(effective);
		this.setIssued(issued);
	}
	
	public USCoreDiagnosticReportLab(DiagnosticReportStatus status, CodeableConcept code, Reference subject, Period effective, Date issued) {
		super();
		this.setStatus(status);
		this.addCategory(USCoreDiagnosticReportLabUtil.category);
		this.setCode(code);
		this.setSubject(subject);
		this.setEffective(effective);
		this.setIssued(issued);
	}
}