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
public class MultiDimensionalArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Bilecik";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Şanlıurfa";
        cities[2][2] = "Gaziantep";

        for (int i = 0; i <= 2; i++) {
            System.out.println("---------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }

}
