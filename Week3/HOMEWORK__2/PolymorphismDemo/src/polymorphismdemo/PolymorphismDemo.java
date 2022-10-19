/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismdemo;

/**
 *
 * @author ASUS
 */
public class PolymorphismDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* BaseLogger[] loggers = new BaseLogger[]{
            new DatabaseLogger(), new EmailLogger(), new FileLogger()
        };
        for(BaseLogger logger:loggers){
            logger.log("Log message");
        }
       */
       
       CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
       customerManager.add();
    }
    
}
