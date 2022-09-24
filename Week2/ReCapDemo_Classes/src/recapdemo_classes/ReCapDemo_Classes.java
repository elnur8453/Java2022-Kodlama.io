/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recapdemo_classes;

/**
 *
 * @author ASUS
 */
public class ReCapDemo_Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(3, 4);
        System.out.println(sonuc);
        int sonuc1 = dortIslem.cıkar(5, 4);
        System.out.println(sonuc1);
        int sonuc2 = dortIslem.carp(3, 4);
        System.out.println(sonuc2);
        int sonuc3 = dortIslem.bol(6, 3);
        System.out.println(sonuc3);
    }

}
