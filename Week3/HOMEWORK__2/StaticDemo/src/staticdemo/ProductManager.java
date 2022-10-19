/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;

/**
 *
 * @author ASUS
 */
public class ProductManager {
    public void add(Product product){
        ProductValidator validator = new ProductValidator();
        if(validator.isValid(product)){
            System.out.println("Eklendi");
        }else{
            System.out.println("Ürün bilgileri geçersiz.");
        }
    }
}
