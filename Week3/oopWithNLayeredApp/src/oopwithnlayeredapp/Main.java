/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopwithnlayeredapp;

import oopwithnlayeredapp.business.ProductManager;
import oopwithnlayeredapp.core.logging.DatabaseLogger;
import oopwithnlayeredapp.core.logging.FileLogger;
import oopwithnlayeredapp.core.logging.Logger;
import oopwithnlayeredapp.dataAccess.HibernateProductDao;
import oopwithnlayeredapp.entities.Product;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Product product1 = new Product(1, "Iphone 11", 10000);
        
        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
        
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
    
}
