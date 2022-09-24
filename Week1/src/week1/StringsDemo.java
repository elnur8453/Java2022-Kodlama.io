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
public class StringsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message = "  Bugün hava çok güzel.";
        System.out.println(message);

        System.out.println("Eleman sayısı : " + message.length());
        System.out.println("5. eleman : " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);
        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf("a"));

        String yeniMesaj = message.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(message.substring(2, 5));

        for (String words : message.split(" ")) {
            System.out.println(words);
        }
    }

}
