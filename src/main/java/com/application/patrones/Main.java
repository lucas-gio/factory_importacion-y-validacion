package com.application.patrones;

import com.application.patrones.entities.catalogs.*;
import com.application.patrones.exceptions.NotImplementedException;
import com.application.patrones.exceptions.ValidationException;
import com.application.patrones.helpers.factories.CatalogFactory;
import com.application.patrones.services.CatalogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        final Logger LOG = LoggerFactory.getLogger(Main.class);

        List<Catalog> receivedCatalogList = new ArrayList<>();

        CatalogFactory catalogFactory = new CatalogFactory();
        List<Map> parsedMessagesToProcess = CatalogService.getParsedMessageToProcess();

        Catalog receivedCatalog;

        for(Map catalogValues : parsedMessagesToProcess){
            try {
                receivedCatalog = catalogFactory.getCatalog((String) catalogValues.get("entity"));
                receivedCatalog.setValues(catalogValues);
                receivedCatalog.validate();
                receivedCatalogList.add(receivedCatalog);
                if(LOG.isInfoEnabled()){
                    LOG.info("El catálogo " + receivedCatalog.getClass().getSimpleName() + " fué recibido con éxito.");
                }
            }
            catch (ValidationException | NotImplementedException e){
                LOG.error(e.getMessage());
            }
        }
    }
}
