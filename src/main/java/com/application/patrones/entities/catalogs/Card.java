package com.application.patrones.entities.catalogs;

import com.application.patrones.exceptions.ValidationException;

import java.util.Map;

public class Card implements Catalog {
    private String code;
    private String customerCode;
    private String cvv;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void validate() throws ValidationException {
        if(code == null || code.isEmpty()){
            throw new ValidationException("Tarjeta: El código está vacío");
        }

        if(customerCode == null || customerCode.isEmpty()){
            throw new ValidationException("Tarjeta: El código de cliente está vacío");
        }

        if(cvv == null || cvv.isEmpty()){
            throw new ValidationException("Tarjeta: El cvv está vacío");
        }
    }

    @Override
    public void setValues(Map values){
        setCode((String) values.get("code"));
        setCustomerCode((String) values.get("customerCode"));
        setCvv((String) values.get("cvv"));
    }
}
