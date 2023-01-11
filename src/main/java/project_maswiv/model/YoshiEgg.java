/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

/**
 *
 * @author Wannes
 */
public class YoshiEgg extends Element{
    
    public YoshiEgg(int xPos, int yPos) {
        super(xPos, yPos, 28, 28);
    }
    
    public void reset(){
        xPos = 0;
        yPos = -100;
    }      
}
