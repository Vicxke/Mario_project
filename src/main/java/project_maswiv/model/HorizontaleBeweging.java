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
public class HorizontaleBeweging extends Grafity{
    
    private BeweegToestandH bewegingH;

    public HorizontaleBeweging(int xPos, int yPos, int width, int height) {
        super(xPos, yPos, width, height);
        bewegingH = BeweegToestandH.STILR;
    }
    
    public void beweegH(){
        if(bewegingH == BeweegToestandH.RECHTS) xPos+=1;
        else if(bewegingH == BeweegToestandH.LINKS) xPos-=1;
    }
    
    public void setMoveRight(boolean moveRight) {
        if(moveRight){ 
            bewegingH = BeweegToestandH.RECHTS;
        }
        else {
            bewegingH = BeweegToestandH.LINKS;
        }
    }
    
    public void dontMoveH(){
        if(bewegingH == BeweegToestandH.RECHTS) bewegingH = BeweegToestandH.STILR;
        else if(bewegingH == BeweegToestandH.LINKS) bewegingH = BeweegToestandH.STILL;
    }
    
    
    public boolean isMovingRight() {        
        return (bewegingH == BeweegToestandH.RECHTS);
    }
    
    public boolean isMovingLeft(){
        return bewegingH == BeweegToestandH.LINKS;
    }
    
    public boolean wasMovingRight() {        
        return (bewegingH == BeweegToestandH.STILR);
    }
    
    public boolean wasMovingLeft(){
        return bewegingH == BeweegToestandH.STILL;
    }
    
    public boolean isStilH(){
        return bewegingH == BeweegToestandH.STILL || bewegingH == BeweegToestandH.STILR;
    }
}
