/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopwithnlayeredapp.business;

import java.util.List;
import oopwithnlayeredapp.core.logging.Logger;
import oopwithnlayeredapp.dataAccess.HibernateProductDao;
import oopwithnlayeredapp.entities.Product;
import oopwithnlayeredapp.dataAccess.JdbcProductDao;
import oopwithnlayeredapp.dataAccess.ProductDao;
/**
 *
 * @author ASUS
 */
public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    
    
    public void add(Product product) throws Exception{
        if(product.getUnitPrice()<10){
            throw new Exception("Urun fiyati 10-dan kucuk olmaz!");
        }
       
        productDao.add(product);
        
        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
