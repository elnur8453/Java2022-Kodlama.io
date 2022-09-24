/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeswithattributes;

/**
 *
 * @author ASUS
 */
public class ClassesWithAttributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product product = new Product(1, "Laptop", "Asus Laptop", 3000,
                2, "Siyah");
        /*product.setName("Laptop");
		product.setId(1);
		product.setDescription(" Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		System.out.println(product.getName());*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }

}
