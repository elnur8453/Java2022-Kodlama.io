/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author ASUS
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char grade = 'A';

		switch (grade = 'A') {
		case 'A':
			System.out.println("Perfect : You passed");
			break;

		case 'B':
			System.out.println("Very good : You passed");
			break;

		case 'C':
			System.out.println("Very good : You passed");
			break;

		case 'D':
			System.out.println("Very good : You passed");
			break;

		case 'F':
			System.out.println("Sorry : You stayed");
			break;

		default:
			System.out.println("You have entered an invalid note");
		}
    }
    
}
