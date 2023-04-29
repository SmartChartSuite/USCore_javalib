package edu.gatech.chai.USCore.model;

import java.util.Date;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Quantity;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.chai.USCore.model.util.CommonUtil;
import edu.gatech.chai.USCore.model.util.USCoreBloodPressureUtil;

@ResourceDef(name = "Observation", profile = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-blood-pressure")
public class USCoreBloodPressure extends USCoreVitalSigns{
    public USCoreBloodPressure(){
        super();
        super.setCode(USCoreBloodPressureUtil.code);
        super.addCategory(CommonUtil.getVitalSignsCategory());
    }

    public USCoreBloodPressure(Quantity systolicBP, Quantity diastolicBP) {
        super();
        super.setCode(USCoreBloodPressureUtil.code);
        super.addCategory(CommonUtil.getVitalSignsCategory());
        super.setEffective(new DateTimeType(new Date()));

        ObservationComponentComponent systolicComponent = new ObservationComponentComponent();
        systolicComponent.setCode(USCoreBloodPressureUtil.systolicBPComponentCode);
        ObservationComponentComponent diastolicComponent = new ObservationComponentComponent();
        diastolicComponent.setCode(USCoreBloodPressureUtil.diastolicBPComponentCode);
        if(systolicBP != null){
            if(systolicBP.getValue() == null) {
                throw new FHIRException("quantity requires a value");
            }
            if(systolicBP.getSystem() == null) {
                throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
            }
            if(systolicBP.getCode() == null) {
                throw new FHIRException("quantity requires a code");
            }
            if(systolicBP.getUnit() == null) {
                throw new FHIRException("quantity requires a unit string");
            }
            if(!CommonUtil.ucumSystemUrl.equals(systolicBP.getSystem())) {
                throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
            }
            if(!USCoreBloodPressureUtil.valueCodes.contains(systolicBP.getCode())) {
                throw new FHIRException("quantity code must be one of:"+String.join(",", USCoreBloodPressureUtil.valueCodes)+", found:"+systolicBP.getCode());
            }
            systolicComponent.setValue(systolicBP);
        }

        if(diastolicBP != null){
            if(diastolicBP.getValue() == null) {
                throw new FHIRException("quantity requires a value");
            }
            if(diastolicBP.getSystem() == null) {
                throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
            }
            if(diastolicBP.getCode() == null) {
                throw new FHIRException("quantity requires a code");
            }
            if(diastolicBP.getUnit() == null) {
                throw new FHIRException("quantity requires a unit string");
            }
            if (!CommonUtil.ucumSystemUrl.equals(diastolicBP.getSystem())) {
                throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
            }
            if(!USCoreBloodPressureUtil.valueCodes.contains(diastolicBP.getCode())) {
                throw new FHIRException("quantity code must be one of:"+String.join(",", USCoreBloodPressureUtil.valueCodes)+", found:"+diastolicBP.getCode());
            }
            diastolicComponent.setValue(diastolicBP);
        }
        super.addComponent(systolicComponent);
        super.addComponent(diastolicComponent);
    }

    public void setDiastolic(Quantity diastolic) {
        if(diastolic != null){
            if(diastolic.getValue() == null) {
                throw new FHIRException("quantity requires a value");
            }
            if(diastolic.getSystem() == null) {
                throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
            }
            if(diastolic.getCode() == null) {
                throw new FHIRException("quantity requires a code");
            }
            if(diastolic.getUnit() == null) {
                throw new FHIRException("quantity requires a unit string");
            }
            if (!CommonUtil.ucumSystemUrl.equals(diastolic.getSystem())) {
                throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
            }
            if(!USCoreBloodPressureUtil.valueCodes.contains(diastolic.getCode())) {
                throw new FHIRException("quantity code must be one of:"+String.join(",", USCoreBloodPressureUtil.valueCodes)+", found:"+diastolic.getCode());
            }
        }

        for (ObservationComponentComponent component : getComponent()) {
            CodeableConcept bpCode = component.getCode();
            for (Coding coding : bpCode.getCoding()) {
                if ("http://loinc.org".equals(coding.getSystem()) 
                    && "8462-4".equals(coding.getCode())) {
                    component.setValue(diastolic);
                    return;
                }
            }
        }

        // Not existing. Creating one
        ObservationComponentComponent diastolicComponent = new ObservationComponentComponent();
        diastolicComponent.setCode(USCoreBloodPressureUtil.diastolicBPComponentCode);

        diastolicComponent.setValue(diastolic);
        super.addComponent(diastolicComponent);
    }

    public void setSystolic(Quantity systolic) {
        if(systolic != null){
            if(systolic.getValue() == null) {
                throw new FHIRException("quantity requires a value");
            }
            if(systolic.getSystem() == null) {
                throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
            }
            if(systolic.getCode() == null) {
                throw new FHIRException("quantity requires a code");
            }
            if(systolic.getUnit() == null) {
                throw new FHIRException("quantity requires a unit string");
            }
            if (!CommonUtil.ucumSystemUrl.equals(systolic.getSystem())) {
                throw new FHIRException("quantity requires a system url of: http://unitsofmeasure.org");
            }
            if(!USCoreBloodPressureUtil.valueCodes.contains(systolic.getCode())) {
                throw new FHIRException("quantity code must be one of:"+String.join(",", USCoreBloodPressureUtil.valueCodes)+", found:"+systolic.getCode());
            }
        }
        
        for (ObservationComponentComponent component : getComponent()) {
            CodeableConcept bpCode = component.getCode();
            for (Coding coding : bpCode.getCoding()) {
                if ("http://loinc.org".equals(coding.getSystem()) 
                    && "8480-6".equals(coding.getCode())) {
                    component.setValue(systolic);
                    return;
                }
            }
        }

        // Not existing. Creating one
        ObservationComponentComponent systolicComponent = new ObservationComponentComponent();
        systolicComponent.setCode(USCoreBloodPressureUtil.systolicBPComponentCode);

        systolicComponent.setValue(systolic);
        super.addComponent(systolicComponent);
    }
}
