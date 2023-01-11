/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

/**
 *
 * @author Vicxke
 */
public class Coin extends Element{
    
    public Coin(int xPos, int yPos) {
        super(xPos, yPos, 20, 20);
    }
    
    public void reset(){
        xPos = 0;
        yPos = -100;
    }  
    
}
