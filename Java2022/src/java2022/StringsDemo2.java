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
public class StringsDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message = "The weather is very nice today.";
        System.out.println(message);
        
        String newMessage = message.replace(" ", "-");
        System.out.println(newMessage);
        System.out.println(message.substring(4, 11));

        for (String kelime : message.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
    
}
