/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

import project_maswiv.GoombaAnimator;
import project_maswiv.MarioAnimator;
import project_maswiv.PlaygroundFXMLController;
import project_maswiv.view.MainView;
import project_maswiv.view.View;
import enummekes.BeweegToestandH;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
//import javax.swing.Timer;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Vicxke
 */
public class Game {
    //main vars
    private Mario mario;
    private int coins;
    private int levens;
    
    private boolean gameOver;
    private boolean updateHartjes;
    private boolean marioluigi;
    
    private int videeH;
  
    private ArrayList<Element> elementen;
    
    
    
    //ben er nog niet aan uit of dit wel echt nodig is of hoe het zou moeten.
    public Game(Mario mario){
        this.mario = mario;
        elementen = new ArrayList<>();
        coins = 0;
        levens = 1;
        videeH = 0;
        updateHartjes = false;
        marioluigi = false;
    }
    
    public void goombaMovement() {
        for(Element el : elementen){
            if(el instanceof Goomba) {
                Goomba en = (Goomba) el;
                en.beweegH();
                //en.beweegV(); 
            }
        }
    }
    
    //wannes  zijn idee probeersel
    //reset locatie
    public void reset(){
        for(Element el: elementen){
            el.setxPos(el.getxPos() - videeH);
        }
        videeH = 0;
    }
    
    public void marioMovement(){
        if(!mario.isStilH()){
            //border
            if(mario.getxPos() + mario.getWidth() > 373 && mario.isMovingRight()){
                for(Element el: elementen){
                    el.setxPos(el.getxPos()-1);                    
                }
                videeH--;
            } else if(mario.getxPos() < 327 && mario.isMovingLeft()){
                for(Element el: elementen){
                    el.setxPos(el.getxPos()+1);
                }
                 videeH++;
            }else{
                mario.beweegH();
            }
        }        
        if(!mario.isStilV()){
            mario.beweegV();
        }
          
    }
    
    
    public void Checkintersections(){
        boolean botsing = false;
        
        //ArrayList<Element> verwijderEl = new ArrayList<>();
        //Element werwijderEl = null;
        for(Element el: elementen){
            //botsingen met mario
            
            //remove coin
            if(el instanceof Coin){
                Coin c = (Coin) el;
                if(c.intersect(mario)) {
                    coins++;
                    c.reset();
                }
            }else if(el instanceof YoshiEgg){
                YoshiEgg ye = (YoshiEgg) el;
                if(ye.intersect(mario)) {
                    mario.setYoshiegg(true);
                    mario.setImageChanged(true);
                    //reset nog aanpassen
                    //vraag 2
                    //elementen.remove(ye);
                    ye.reset();
                }
            }else if(el instanceof MarioLuigi){
                MarioLuigi ml = (MarioLuigi) el;
                if(ml.intersect(mario)) {
                    if(marioluigi == false){
                        ml.reset();
                        marioluigi = true;
                    }
                }
            }else {
                if(el.IntersectWithBottom(mario)){
                    if(mario.isGoingDown()){
                        mario.dontMoveV();
                        mario.setImageChanged(true);
                    }
                    botsing = true;
                }
                if(el.IntersectWithTop(mario)){
                    if(mario.isGoingUp()){
                        mario.setMoveDown();
                    }
                }

                if(el.IntersectWithRight(mario)){
                    if(mario.isMovingRight()){
                        mario.dontMoveH();
                    }
                }
                if(el.IntersectWithLeft(mario)){
                    if(mario.isMovingLeft()){
                        mario.dontMoveH();
                    }
                }
            }
                
            
            
            
            if(el instanceof Goomba){
                Goomba en = (Goomba) el;
                for (Element element: elementen){
                    if(el != element){
                        if(element.IntersectWithRight(en)){
                            en.setMoveRight(false);
                        }
                        else if(element.IntersectWithLeft(en)){
                            en.setMoveRight(true);
                        }
                        
                        if(mario.IntersectWithRight(en) || mario.IntersectWithLeft(en)){
                            mario.setYoshiegg(false);
                            System.out.println("eaten alive!");
                            minLeven();
                            mario.setImageChanged(true);
                            
                        }
  
                        if(mario.IntersectWithTop(en)){
                            //aanpassen zodat deze uit de lijst word gehaald
                            System.out.println("die you shrooms!");
                            ((Goomba) el).reset(); //teleporteerd de goomba uit beeld
                        }
                    }
                }
            }
            
            if(el instanceof Lava){
                Lava la = (Lava) el;
                for (Element element: elementen){
                    if(el != element){
                        if(mario.IntersectWithTop(la)){
                            mario.setYoshiegg(false);
                            System.out.println("burnt to a crisp!");
                            minLeven();
                            mario.setImageChanged(true);
                        }  
                    }
                }
            }
            
            if(el instanceof Spikes){
                Spikes sp = (Spikes) el;
                for (Element element: elementen){
                    if(el != element){
                        if(mario.IntersectWithTop(sp)){
                            mario.setYoshiegg(false);
                            System.out.println("You might feel a little prick");
                            minLeven();
                            mario.setImageChanged(true);
                        }  
                    }
                }
            }
        }

        //grafity voor horizontale beweging
        if(!botsing && !mario.isGoingUp()){
            mario.setMoveDown();
        }
    }
    
    
    
    public void minLeven(){
        if(levens == 0) {
            gameOver = true;
        }
        else{
            levens--;
            updateHartjes = true;
            reset();
        }
    }

    public int getCoins() {
        return coins;
    }

    public ArrayList<Element> getElementen() {
        return elementen;
    }

    public void setElementen(ArrayList<Element> elementen) {
        this.elementen = elementen;
    }

    public boolean isGameOver(){
        return gameOver;
    }

    public boolean isUpdateHartjes() {
        return updateHartjes;
    }

    public void setUpdateHartjes(boolean updateHartjes) {
        this.updateHartjes = updateHartjes;
    }
    

    public int getLevens() {
        return levens;
    }
    
}
