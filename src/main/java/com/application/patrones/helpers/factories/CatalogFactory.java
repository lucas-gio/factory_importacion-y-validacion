package com.application.patrones.helpers.factories;

import com.application.patrones.entities.catalogs.*;
import com.application.patrones.exceptions.NotImplementedException;

/**
 * Fábrica que contruye catálogos.
 */
public class CatalogFactory {

    public Catalog getCatalog(String name) throws NotImplementedException{
        if(name == null || name.isEmpty()){
            return null;
        }

        if(name.equals(Brand.class.getSimpleName())){
            return new Brand();
        }
        else if(name.equals(Card.class.getSimpleName())){
            return new Card();
        }
        else if(name.equals(Customer.class.getSimpleName())){
            return new Customer();
        }
        else if(name.equals(Product.class.getSimpleName())){
            return new Product();
        }
        else if(name.equals(Supplier.class.getSimpleName())){
            return new Supplier();
        }
        else{
            throw new NotImplementedException("La clase " + name + " no fué implementada en la fábrica CatalogFactory.");
        }
    }
}
