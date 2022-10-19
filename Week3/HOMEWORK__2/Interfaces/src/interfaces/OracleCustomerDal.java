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
public class OracleCustomerDal implements ICostumerDal{

    @Override
    public void add() {
        System.out.println("Oracle eklendi...");
    }
    
}
