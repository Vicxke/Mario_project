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
public class Mario extends HorizontaleBeweging{
    private int speed;
    private int standaardSpringHoogte;
    private boolean yoshiegg;
    private boolean imageChanged;
    private boolean isDood;
    

    
    public Mario(int xPos, int yPos, int speed) {
        super(xPos, yPos, 45, 55);
        this.speed = speed;
        
        standaardSpringHoogte = 110;
        yoshiegg = false;
        imageChanged = false;
    }

    //nagaan ofg het wel zo was
    public void jump(){
        super.addForce(standaardSpringHoogte);
    }
    

    public double getSpeed() {
        return speed;
    }

    
    public boolean getyoshiegg(){
        return yoshiegg;
    }

    public void setYoshiegg(boolean yoshiegg) {
        if(this.yoshiegg != yoshiegg){
            if(yoshiegg){
                speedUp();
                standaardSpringHoogte+=20; 
            }
            else {
                speedDown();
                standaardSpringHoogte-=20;
            }
        }
        this.yoshiegg = yoshiegg;
    }
    
    public void speedUp(){
        speed-=2;
    }
    
    public void speedDown(){
        speed+=2;
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
