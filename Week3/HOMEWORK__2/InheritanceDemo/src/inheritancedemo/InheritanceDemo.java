/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;

/**
 *
 * @author ASUS
 */
public class InheritanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgregretmenKrediManager());
    }
    
}
