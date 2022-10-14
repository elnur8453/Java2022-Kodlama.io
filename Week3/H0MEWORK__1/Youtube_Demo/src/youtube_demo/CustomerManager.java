/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube_demo;

/**
 *
 * @author ASUS
 */
public class CustomerManager {
    private Customer customer;
    private ICreditManager creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }
    
    public void save(){
        System.out.println("Customer is saved: ");
    }
    
    public void delete(){
        System.out.println("Customer deleted: ");
    }
    
    public void giveCredit(){
        creditManager.calculate();
        System.out.println("Credit is given...");
    }
}
