package edu.gatech.chai.USCore.model;

import java.math.BigDecimal;
import java.util.Date;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Quantity;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.CommonUtil;
import edu.gatech.chai.USCore.model.util.USCoreBodyHeightUtil;

@ResourceDef(name = "Observation", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-body-height")
public class USCoreBodyHeight extends USCoreVitalSigns {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7846812983446018041L;

	public USCoreBodyHeight() {
		super();
		super.setCode(USCoreBodyHeightUtil.code);
		super.addCategory(CommonUtil.getVitalSignsCategory());
	}

	public USCoreBodyHeight(Quantity quantity) {
		super();

		commonConstructor(quantity);
	}
	
	public USCoreBodyHeight(float value, String unitCode, String unitFullname) {
		super();

		Quantity quantity = new Quantity();
		quantity.setValue(new BigDecimal(value));
		quantity.setSystem(CommonUtil.ucumSystemUrl);
		quantity.setCode(unitCode);
		quantity.setUnit(unitFullname);
		commonConstructor(quantity);
	}
	
	public USCoreBodyHeight commonConstructor(Quantity quantity) {
		super.setCode(USCoreBodyHeightUtil.code);
		super.addCategory(CommonUtil.getVitalSignsCategory());
        super.setEffective(new DateTimeType(new Date()));

		if(quantity.getValue() == null) {
			throw new FHIRException("quantity requires a value");
		}
		if(quantity.getSystem() == null) {
			throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
		}
		if(quantity.getCode() == null) {
			throw new FHIRException("quantity requires a code");
		}
		if(quantity.getUnit() == null) {
			throw new FHIRException("quantity requires a unit string");
		}
		if(!CommonUtil.ucumSystemUrl.equals(quantity.getSystem())) {
			throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
		}
		if(!USCoreBodyHeightUtil.valueCodes.contains(quantity.getCode())) {
			throw new FHIRException("quantity code must be one of:"+String.join(",", USCoreBodyHeightUtil.valueCodes)+", found:"+quantity.getCode());
		}
		super.setValue(quantity);
		return this;
	}
}