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
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] students = new String[4];
        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";
        students[3] = "Ahmet";

        for (int i = 0; i< students.length; i++) {
            System.out.println(students[i]);
        }
    }

}
