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
public class MukemmelSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number =16;
        int total = 0;

        for(int i=1;i<number;i++){
            if(number%i==0){
                total = total + i;
            }
        }

        if(total==number){
            System.out.println("mükemmel sayıdır");
        }else{
            System.out.println("mükemmel sayı değildir");
        }
    }
    
}
