package com.application.patrones.entities.catalogs;

import com.application.patrones.exceptions.ValidationException;

import java.util.Map;

public class Brand implements Catalog {
    private String code;
    private String name;

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

    @Override
    public void validate() throws ValidationException{
        if(code == null || code.isEmpty()){
            throw new ValidationException("Marca: el código está vacío.");
        }

        if(name == null || name.isEmpty()){
            throw new ValidationException("Marca: el nombre está vacío.");
        }
    }

    @Override
    public void setValues(Map values){
        setCode((String) values.get("code"));
        setName((String) values.get("name"));
    }
}
