/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridding;


public class Overridding {

    
    public static void main(String[] args) {
        /*OgretmenKrediMenager ogretmenKrediMenager = new OgretmenKrediMenager();
        double hesap = ogretmenKrediMenager.hesapla(89);
        System.out.println(hesap);*/
        
        BaseCreditManager[] creditManagers = new BaseCreditManager[]
                 {new TeacherCreditManager(),new AgricultureCreditManager(),new StudentCreditManager()};
            
        for (BaseCreditManager creditManager : creditManagers) {
            System.out.println("Credit: " + creditManager.calculate(23));
        }
           
    }
    
}
