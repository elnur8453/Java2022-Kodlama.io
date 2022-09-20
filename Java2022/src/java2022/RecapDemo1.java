/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2022;

/**
 *
 * @author ASUS
 */
public class RecapDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                int num1= 26;
		int num2 = 30;
		int num3 = 9;
		int largest = num1;
		
		if(largest < num2) {
			largest = num2;
		}
                else if(largest < num3){
			largest = num3;
		}
                else{
                        
                }
		System.out.println("The largest = " + largest);
    }
    
}
