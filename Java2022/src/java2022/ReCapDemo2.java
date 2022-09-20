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
public class ReCapDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] mylist = {1.2,6.3,4.2,7.8};
        double total = 0;
        double max = mylist[0];
        for (double number:mylist) {
            if(max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Total = " + total);
        System.out.println("The largest = " + max);
    }
    
}
