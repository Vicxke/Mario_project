/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

import project_maswiv.model.elementen.Coin;
import project_maswiv.model.level.Lava;
import project_maswiv.model.level.Quicksand;
import project_maswiv.model.level.Spikes;
import project_maswiv.model.elementen.Peach;
import project_maswiv.model.level.Finish;
import project_maswiv.model.elementen.Fireball;
import project_maswiv.model.elementen.YoshiEgg;
import project_maswiv.model.elementen.Skeleton;
import project_maswiv.model.elementen.Goomba;
import project_maswiv.model.elementen.Coopa;
import project_maswiv.model.elementen.Bowser;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Vicxke
 */
public class Game {
    //main vars
    private Mario mario;
    private int coins;
    private int timer;
    private int fireballtimer;
    private int sandstormtimer;
    private int levens;
    
    private boolean gameOver;
    private boolean finish;
    private boolean marioluigi;
    private boolean loadOverlay;
    private boolean elemtentSpawned;
    
    private int videeH;
  
    //vragen hoe we deze lijst miss anders kunnen instellen.
    private ArrayList<Element> elementen;
    
    public Game(){
        this.mario = new Mario(327, 300, 6);
        elementen = new ArrayList<>();
        coins = 0;
        timer = 800;
        fireballtimer = 1;
        sandstormtimer = 1;
        levens = 3;
        videeH = 0;
        marioluigi = false;
        finish = false;
        loadOverlay = true;
        //zodat de view update
        elemtentSpawned = true;
    }
    
    public void coopaMovement() {
        for(Element el : elementen){
            if(el instanceof Coopa) {
                Coopa co = (Coopa) el;
                co.beweegH();
                //en.beweegV(); 
            }
        }
    }
    
    public void goombaMovement() {
        for(Element el : elementen){
            if(el instanceof Goomba) {
                Goomba go = (Goomba) el;
                go.beweegH();
                //en.beweegV(); 
            }
        }
    }
    
    public void skeletonMovement() {
        for(Element el : elementen){
            if(el instanceof Skeleton) {
                Skeleton sk = (Skeleton) el;
                sk.beweegH();
                //en.beweegV(); 
            }
        }
    }
    
    public void fireballMovement() {
        for(Element el : elementen){
            if(el instanceof Fireball) {
                Fireball fb = (Fireball) el;
                fb.beweegV();
            }
        }
        fireballtimer++;
    }
    public void sandstormIncreaseTimer(){
        sandstormtimer++;
    }
    
    public void tellerTimer(){
        timer--;
    }
    
    //wannes  zijn idee probeersel
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
    
    
    public void checkIntersections(){
        boolean botsing = false;
        ArrayList<Element> verwijderEl = new ArrayList<>();
        
        for(Element el: elementen){
        //botsingen met mario
            //remove coin
            if(el instanceof Coin){
                Coin c = (Coin) el;
                if(c.intersect(mario)) {
                    coins++;
                    timer = timer+10;
                    verwijderEl.add(c);
                }
            }else if(el instanceof YoshiEgg){
                YoshiEgg ye = (YoshiEgg) el;
                if(ye.intersect(mario)) {
                    mario.setYoshiegg(true);
                    mario.setImageChanged(true);
                    verwijderEl.add(ye);
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
                if(el.intersectWithBottom(mario)){
                    if(mario.isGoingDown()){
                        mario.dontMoveV();
                        mario.setImageChanged(true);
                    }
                    botsing = true;
                }
                if(el.intersectWithTop(mario)){
                    if(mario.isGoingUp()){
                        mario.setMoveDown();
                    }
                }

                if(el.intersectWithRight(mario)){
                    if(mario.isMovingRight()){
                        mario.dontMoveH();
                    }
                }
                if(el.intersectWithLeft(mario)){
                    if(mario.isMovingLeft()){
                        mario.dontMoveH();
                    }
                }
            }
            
            if(el instanceof Goomba || el instanceof Skeleton || el instanceof Coopa && el instanceof HorizontaleBeweging){
                HorizontaleBeweging beweging = (HorizontaleBeweging) el;
                for (Element element: elementen){
                    if(el != element){
                        if(element.intersectWithRight(beweging)){
                            beweging.setMoveRight(false);
                        }
                        else if(element.intersectWithLeft(beweging)){
                            beweging.setMoveRight(true);
                        }
                    }
                }
                if(mario.intersectWithRight(el) || mario.intersectWithLeft(el)){
                    mario.setYoshiegg(false);
                    System.out.println("dead!");
                    minLeven();
                    mario.setImageChanged(true);
                }
                if(mario.intersectWithTop(el)){
                    System.out.println("you killed him!");
                    timer = timer+10;
                    verwijderEl.add(el);
                }
                
            }
            if(el instanceof Fireball){
                Grafity beweging = (Grafity) el;
                for (Element element: elementen){
                    if(el != element){
                        if(element.intersectWithTop(beweging)){
                            verwijderEl.add(el);
                        }
                    }
                }
                if(el.intersect(mario)){
                    mario.setYoshiegg(false);
                    minLeven();
                    mario.setImageChanged(true);
                }
            }
            if(el instanceof Bowser){
                if(el.intersect(mario)){
                    if(coins != 5){
                        mario.setYoshiegg(false);
                        minLeven();
                        mario.setImageChanged(true);
                        System.out.println("try again!");
                    }
                    else if(coins == 5 && !el.intersectWithRight(mario)){
                        verwijderEl.add(el);
                        System.out.println("you did it!");
                    }
                    else if(coins == 5 && el.intersectWithRight(mario)){
                        mario.setYoshiegg(false);
                        minLeven();
                        mario.setImageChanged(true);
                        System.out.println("try again!");
                    }
                }
            }
            
            if(el instanceof Lava || el instanceof Spikes || el instanceof Quicksand){
                if(mario.intersectWithTop(el)){
                    mario.setYoshiegg(false);
                    minLeven();
                    mario.setImageChanged(true);
                }
            }
            
            if(el instanceof Finish || el instanceof Peach){
                if(el.intersect(mario)){
                    finish = true;
                }
            }
        }
        
        for (Element weg: verwijderEl) {
            elementen.remove(weg);
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
            timer = timer-50;
            reset();
        }
    }

    public int getCoins() {
        return coins;
    }
    
    public int getTimer(){
        return timer;
    }
    public int getFireballTimer(){
        return fireballtimer;
    }
    public int getSandstormTimer(){
        return sandstormtimer;
    }
    
    public void resetFireballTimer(){
        fireballtimer = 0;
    }
    public void resetSandstormTimer(){
        sandstormtimer = 0;
    }

    //vragen of da ongeveer goed is met deze iterator
    public Iterator<Element> getElementen() {
        return elementen.iterator();
    }
    
    public boolean hasElement(Element el){
        return elementen.indexOf(el) != -1;
    }

    public void addElementen(ArrayList<Element> elementen) {
        elemtentSpawned = true;
        this.elementen.addAll(elementen);
    }
    
    public void addElement(Element element){
        elemtentSpawned = true;
        elementen.add(element);
    }

    public void setElemtentSpawned(boolean elemtentSpawned) {
        this.elemtentSpawned = elemtentSpawned;
    }

    public boolean isElemtentSpawned() {
        return elemtentSpawned;
    }
    

    public boolean isGameOver(){
        return gameOver;
    }
    
    public boolean isFinish() {
        return finish;
    }

    public int getLevens() {
        return levens;
    }
    
    public boolean setFinish() {
        return finish == true;
    }

    public Mario getMario() {
        return mario;
    }

    public void setLoadOverlay(boolean loadOverlay) {
        this.loadOverlay = loadOverlay;
    }

    public boolean isLoadOverlay() {
        return loadOverlay;
    }
    
}
