/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

import enummekes.BeweegToestandH;
import enummekes.BeweegToestandV;

/**
 *
 * @author viche
 */
public class Mario extends Grafity{
    private int speed;
    private BeweegToestandH bewegingH;
    //private BeweegToestandV bewegingV;
    private int standaardSpringHoogte;
    private boolean yoshiegg;
    private boolean imageChanged;
    private boolean isDood;
    

    
    public Mario(int xPos, int yPos, int speed) {
        super(xPos, yPos, 45, 55);
        this.speed = speed;
        
        bewegingH = BeweegToestandH.STILR;
        //standaard op 70
        standaardSpringHoogte = 110;
        yoshiegg = false;
        imageChanged = false;
    }
    
    public void reset(){
        xPos = 0;
        yPos = 300;
    }

    public void leve11(){
        xPos = 1100;
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
    
    public boolean getyoshiegg(){
        return yoshiegg;
    }

    public void setYoshiegg(boolean yoshiegg) {
        if(this.yoshiegg != yoshiegg){
            if(yoshiegg){
                speed-=2;
                standaardSpringHoogte+=20; 
            }
            else {
                speed+=2;
                standaardSpringHoogte-=20;
            }
        }
        this.yoshiegg = yoshiegg;
    }

    public void setImageChanged(boolean imageChanged) {
        this.imageChanged = imageChanged;
    }
    
    public boolean isImageChanged(){
        return imageChanged;
    }

    public void setIsDood(boolean isDood) {
        this.isDood = isDood;
    }

    public boolean isYoshiegg() {
        return yoshiegg;
    }
    
    public boolean getIsDood(){
        return isDood;
    }
    
}
