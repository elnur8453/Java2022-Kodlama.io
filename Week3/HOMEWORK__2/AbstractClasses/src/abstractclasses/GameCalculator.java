/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

/**
 *
 * @author ASUS
 */
public abstract class GameCalculator {
    public abstract void calculate();
    
    public void gameOver(){
        System.out.println("Game Over");
    }
}
