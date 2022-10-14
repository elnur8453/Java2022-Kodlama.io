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
public class Youtube_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();
        
        
        Customer customer = new Customer();
        customer.setId(1);
       
        
        
        
        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save(customer);
        customerManager.delete(customer);
        
        Company company = new Company();
        company.setTaxNumber("486585");
        company.setCompanyName("My Company");
        
        CustomerManager customerManager2 = new CustomerManager(new Customer());
        
        Person person = new Person();
        
        */
       
       CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
       customerManager.giveCredit();
       
       
       
       
        
    }
    
}
