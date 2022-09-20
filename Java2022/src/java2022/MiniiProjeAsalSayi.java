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
public class MiniiProjeAsalSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 5;
        int remainder = number % 2;
        
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("sayı asal değildir");
            return;
        }

        if (number < 1) {
            System.out.println("geçersiz sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değildir");
        }
    }

}
