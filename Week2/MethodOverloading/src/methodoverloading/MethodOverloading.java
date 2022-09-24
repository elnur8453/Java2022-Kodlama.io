/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author ASUS
 */
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2, 3));
        System.out.println(dortIslem.topla(2, 3, 5));
    }
}
