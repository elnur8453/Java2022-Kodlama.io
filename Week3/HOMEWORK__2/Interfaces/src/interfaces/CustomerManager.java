/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ASUS
 */
public class CustomerManager {
    
    ICostumerDal costumerDal;
    public void add(){
        // is kodlari yazilir......
        costumerDal.add();
    }
}
