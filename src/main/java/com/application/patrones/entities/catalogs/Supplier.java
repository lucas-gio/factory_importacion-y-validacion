package com.application.patrones.entities.catalogs;

import com.application.patrones.exceptions.ValidationException;

import java.util.Map;

public class Supplier implements Catalog {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void validate() throws ValidationException {
        if(code == null || code.isEmpty()){
            throw new ValidationException("Proveedor: El código está vacío");
        }

        if(name == null || name.isEmpty()){
            throw new ValidationException("Proveedor: El nombre está vacío");
        }
    }

    @Override
    public void setValues(Map values){
        setCode((String) values.get("code"));
        setName((String) values.get("name"));
    }
}
