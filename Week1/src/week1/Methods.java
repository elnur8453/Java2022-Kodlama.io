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
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sayiBulmaca();
    }

    public static void sayiBulmaca() {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("Sayi mevcuttur " + aranacak);
        } else {
            mesajVer("Sayi mevcut degildir " + aranacak);
        }

    }

    public static void mesajVer(String mesaj) {

        System.out.println(mesaj);
    }
}
