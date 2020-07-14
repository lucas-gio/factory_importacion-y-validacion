package com.application.patrones.entities.catalogs;

import com.application.patrones.exceptions.ValidationException;

import java.util.Map;

/**
 * Representa un catálogo de elementos importables via archivo/rest.
 */
public interface Catalog {
    /**
     * Validaciones básicas.
     * @throws ValidationException Se libera si se detecta un fallo de validación.
     */
    void validate() throws ValidationException;

    /**
     * Asigna los valores del mapa al objeto.
     * @param values los valores en formato mapa.
     */
    void setValues(Map values);
}
