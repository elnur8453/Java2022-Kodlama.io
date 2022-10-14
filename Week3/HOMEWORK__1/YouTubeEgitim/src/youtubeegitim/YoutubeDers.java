/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubeegitim;

/**
 *
 * @author ASUS
 */
public class YoutubeDers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 10;
        int num2 = 20;
        num1 = num2;
        num2 = 100; 

        System.out.println("Sayi 1: " + num1); 

        int[] numbers1 = {1,2,3};
        int[] numbers2 = {10,20,30};
        numbers1 = numbers2;

        numbers2[0]=1000;

        System.out.println("sayilar 1 : " + numbers1[0]);

    }
    
}
