/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

/**
 *
 * @author ASUS
 */
public class AbstractClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();*/
        
        GameCalculator gameCalculator = new ManGameCalculator(); 
        gameCalculator.calculate();
        
    }
    
}
