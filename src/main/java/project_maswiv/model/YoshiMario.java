/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

import enummekes.BeweegToestandH;
import enummekes.BeweegToestandV;

/**
 *
 * @author wannes
 */
public class YoshiMario extends Grafity{
    private int speed;
    private BeweegToestandH bewegingH;
    //private BeweegToestandV bewegingV;
    private int standaardSpringHoogte;
    

    
    public YoshiMario(int xPos, int yPos, int speed) {
        super(xPos, yPos, 80, 120);
        this.speed = speed*(2);
        
        bewegingH = BeweegToestandH.STILR;
        //standaard op 70
        standaardSpringHoogte = 200;
    }
    
    public void reset(){
        xPos = 10;
        yPos = 300;
    }    
    
    public void beweegH(){
        if(bewegingH == BeweegToestandH.RECHTS) xPos+=1;
        else if(bewegingH == BeweegToestandH.LINKS) xPos-=1;
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

    //nagaan ofg het wel zo was
    public void jump(){
        super.addForce(standaardSpringHoogte);
    }
    
    
    public void setMoveRight(boolean moveRight) {
        if(moveRight){ 
            bewegingH = BeweegToestandH.RECHTS;
        }
        else {
            bewegingH = BeweegToestandH.LINKS;
        }
    }

    public double getSpeed() {
        return speed;
    }
    
    public void dontMoveH(){
        if(bewegingH == BeweegToestandH.RECHTS) bewegingH = BeweegToestandH.STILR;
        else if(bewegingH == BeweegToestandH.LINKS) bewegingH = BeweegToestandH.STILL;
    }
    
}
