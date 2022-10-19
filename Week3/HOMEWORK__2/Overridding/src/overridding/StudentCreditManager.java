/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridding;

/**
 *
 * @author ASUS
 */
public class StudentCreditManager extends BaseCreditManager{

    @Override
    public double calculate(double total){   
        return total * 1.10;
    }
}
