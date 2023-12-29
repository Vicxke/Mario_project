/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

import enummekes.BeweegToestandV;

/**
 *
 * @author Vicxke
 */
public class Grafity extends Element{
    private BeweegToestandV bewegingV;
    private int springHoogte;
    
    public Grafity(int xPos, int yPos, int width, int height) {
        super(xPos, yPos, width, height);
        
        springHoogte = 0;
        this.grafity = grafity;
        bewegingV = BeweegToestandV.STIL;
    }
    
    //grafity
    
    public void dontMoveV(){
        bewegingV = BeweegToestandV.STIL;
    }

    public BeweegToestandV getBewegingV() {
        return bewegingV;
    }

    public void setBewegingV(BeweegToestandV bewegingV) {
        this.bewegingV = bewegingV;
    }
    
    public void beweegV(){
        if(getBewegingV() == BeweegToestandV.ONDER) yPos+=1;
        else if(getBewegingV() == BeweegToestandV.BOVEN) {
            yPos-=1.2;
            springHoogte-=1.2;
            if(springHoogte == 0){
                setBewegingV(BeweegToestandV.ONDER);
            }
        }
    }
    
    public void setMoveDown(){
        bewegingV = BeweegToestandV.ONDER;
    }
    
    public boolean isStilV(){
        return bewegingV == BeweegToestandV.STIL;
    }
    
    public boolean isGoingDown(){
        return bewegingV == BeweegToestandV.ONDER;
    }
    
    public boolean isGoingUp(){
        return bewegingV == BeweegToestandV.BOVEN;
    }
    
    public void addForce(int value){
        if(getBewegingV() == BeweegToestandV.STIL){
            springHoogte = value;
            setBewegingV(BeweegToestandV.BOVEN);
        }
    }
}
