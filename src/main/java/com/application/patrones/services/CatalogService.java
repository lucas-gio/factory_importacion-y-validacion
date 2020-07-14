package com.application.patrones.services;

import com.application.patrones.entities.catalogs.*;

import java.util.*;

/**
 * Una simple clase que simula catálogos de valores obtenidos por un medio (rest, archivo, rabbitmq)
 * que se requiere procesar para posteriormente ser almacenados.
 */
public class CatalogService {

    /**
     * Método que interpretaría los json pendientes de ser procesados.
     */
    public static List<Map> getParsedMessageToProcess(){
        List<Map> result = new ArrayList();

        result.add(getBrandTestData());
        result.add(getCardTestData());
        result.add(getCustomerTestData());
        result.add(getProductTestData());
        result.add(getSupplierTestData());

        return result;
    }

    private static Map<String,String> getBrandTestData(){
        Map<String, String> pendingBrand =  new HashMap();
        pendingBrand.put("entity", Brand.class.getSimpleName());
        pendingBrand.put("code", null);
        pendingBrand.put("name", "La campagnola");

        return pendingBrand;
    }

    private static Map<String,String> getCardTestData(){
        Map<String, String> pendingCard =  new HashMap();
        pendingCard.put("entity", Card.class.getSimpleName());
        pendingCard.put("code", "1010");
        pendingCard.put("customerCode", "1550");
        pendingCard.put("cvv", "");

        return pendingCard;
    }

    private static Map<String,String> getCustomerTestData(){
        Map<String, String> pendingCustomer =  new HashMap();
        pendingCustomer.put("entity", Customer.class.getSimpleName());
        pendingCustomer.put("code", "");
        pendingCustomer.put("name", "1550");
        pendingCustomer.put("lastName", "Pérez");
        pendingCustomer.put("registrationDate", "2020-05-10");

        return pendingCustomer;
    }

    private static Map<String,String> getProductTestData(){
        Map<String, String> pendingProduct =  new HashMap();
        pendingProduct.put("entity", Product.class.getSimpleName());
        pendingProduct.put("code", "12");
        pendingProduct.put("name", "Helado de agua La costa");
        pendingProduct.put("brandCode", "50");
        pendingProduct.put("supplierCode", null);

        return pendingProduct;
    }

    private static Map<String,String> getSupplierTestData(){
        Map<String, String> pendingSupplier =  new HashMap();
        pendingSupplier.put("entity", Supplier.class.getSimpleName());
        pendingSupplier.put("code", "20");
        pendingSupplier.put("name", "El campo hnos.");

        return pendingSupplier;
    }
}
