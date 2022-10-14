/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopwithnlayeredapp.dataAccess;

import oopwithnlayeredapp.entities.Product;

/**
 *
 * @author ASUS
 */
public class JdbcProductDao implements ProductDao{
    @Override
    public void add(Product product){
        System.out.println("JDBC ile veritabanina kayd edildi...");
    }
}
