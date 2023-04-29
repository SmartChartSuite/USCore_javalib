package edu.gatech.chai.USCore.model;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Condition;
import org.hl7.fhir.r4.model.Reference;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.CommonUtil;

@ResourceDef(name = "Condition", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition-problems-health-concerns")
public class USCoreConditionProblemsAndHealthConcerns extends Condition{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2865546892014612401L;

	public USCoreConditionProblemsAndHealthConcerns(){
		super();
	}
	
	public USCoreConditionProblemsAndHealthConcerns(CodeableConcept usCoreProblemOrHealthConcern, CodeableConcept code, Reference subject) {
		super();
		this.addCategory(usCoreProblemOrHealthConcern);
		this.setCode(code);
		this.setSubject(subject);
	}

	public void addSdohCategory() {
		for (CodeableConcept codeableConcept : getCategory()) {
			for (Coding coding : codeableConcept.getCoding()) {
				if (CommonUtil.observationSdohCategoryUri.equals(coding.getSystem()) 
					&& "sdoh".equals(coding.getCode())) {
						// We already have this.
						return;
				}
			}
		}

		// We do not have SOOH category. Add it now
		this.addCategory(CommonUtil.sdohCategory());
	}
}