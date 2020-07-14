package com.application.patrones.entities.catalogs;

import com.application.patrones.exceptions.ValidationException;

import java.util.Map;

public class Product implements Catalog{
    private String code;
    private String name;
    private String brandCode;
    private String supplierCode;

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

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }



    @Override
    public void validate() throws ValidationException {
        if(code == null || code.isEmpty()){
            throw new ValidationException("Producto: El código está vacío");
        }

        if(name == null || name.isEmpty()){
            throw new ValidationException("Producto: El nombre está vacío");
        }

        if(brandCode == null || brandCode.isEmpty()){
            throw new ValidationException("Producto: El código de marca está vacío");
        }

        if(supplierCode == null){
            throw new ValidationException("Producto: El código del proveedor está vacío");
        }
    }

    @Override
    public void setValues(Map values){
        setCode((String) values.get("code"));
        setName((String) values.get("name"));
        setBrandCode((String) values.get("brandCode"));
        setSupplierCode((String) values.get("supplierCode"));
    }
}
