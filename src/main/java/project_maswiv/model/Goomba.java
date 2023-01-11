/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

import enummekes.BeweegToestandH;

/**
 *
 * @author Vicxke
 */
public class Goomba extends Grafity{

    private BeweegToestandH bewegingH;
    
    public Goomba(int xPos, int yPos) {
        super(xPos, yPos, 28, 28);
        bewegingH = BeweegToestandH.RECHTS;
    }
    
    public void reset(){
        xPos = 0;
        yPos = -100;
        bewegingH = BeweegToestandH.STILR;
    }    
    
    public void beweegH(){
        if(bewegingH == BeweegToestandH.RECHTS) xPos+=1;
        else if(bewegingH == BeweegToestandH.LINKS) xPos-=1;
        else;
    }
    
    public void setMoveRight(boolean moveRight) {
        if(moveRight){ 
            bewegingH = BeweegToestandH.RECHTS;
        }
        else {
            bewegingH = BeweegToestandH.LINKS;
        }
    }
    
}
