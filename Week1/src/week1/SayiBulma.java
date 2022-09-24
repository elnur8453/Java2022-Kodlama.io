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
public class SayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak =5;

        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("sayı mevcuttur");
        }else {
            System.out.println("sayı mevcut değildir");
        }
    }
    
}
