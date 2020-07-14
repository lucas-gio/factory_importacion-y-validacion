package com.application.patrones.entities.catalogs;

import com.application.patrones.exceptions.ValidationException;

import java.util.Map;

public class Customer implements Catalog {
    private String code;
    private String name;
    private String lastName;
    private String registrationDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public void validate() throws ValidationException {
        if(code == null || code.isEmpty()){
            throw new ValidationException("Cliente: El código está vacío");
        }

        if(name == null || name.isEmpty()){
            throw new ValidationException("Cliente: El nombre está vacío");
        }

        if(lastName == null || lastName.isEmpty()){
            throw new ValidationException("Cliente: El apellido está vacío");
        }

        if(registrationDate == null){
            throw new ValidationException("Cliente: La fecha de registro está vacía");
        }
    }

    @Override
    public void setValues(Map values){
        setCode((String) values.get("code"));
        setName((String) values.get("name"));
        setLastName((String) values.get("lastName"));
        setRegistrationDate((String)values.get("registrationDate"));
    }
}
