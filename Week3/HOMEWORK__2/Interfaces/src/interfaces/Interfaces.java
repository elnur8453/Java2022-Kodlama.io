/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ASUS
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ICostumerDal costumerDal = new OracleCustomerDal();*/
        
        CustomerManager customerManager = new CustomerManager();
        customerManager.costumerDal = new OracleCustomerDal();
        customerManager.add();
    }
    
}
