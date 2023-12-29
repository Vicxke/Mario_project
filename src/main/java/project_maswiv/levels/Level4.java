/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.levels;

import java.util.ArrayList;
import java.util.Random;
import project_maswiv.model.level.BlokCastle;
import project_maswiv.model.level.BlokWoods;
import project_maswiv.model.elementen.Bowser;
import project_maswiv.model.elementen.Coin;
import project_maswiv.model.elementen.Coopa;
import project_maswiv.model.Element;
import project_maswiv.model.level.Finish;
import project_maswiv.model.elementen.Fireball;
import project_maswiv.model.Game;
import project_maswiv.model.level.GrondBlokCastle;
import project_maswiv.model.level.GrondBlokWoods;
import project_maswiv.model.elementen.Peach;
import project_maswiv.model.level.Spikes;
import project_maswiv.model.elementen.YoshiEgg;

/**
 *
 * @author Wannes
 */
public class Level4 extends Game{
    
    public Level4() {
        super();
        
        ArrayList<Element> elementen = new ArrayList<>();
        
        //grond
        for (int i = -20;i<80;i++) {
            GrondBlokCastle grondblokkenView = new GrondBlokCastle(i*80, 360);
            elementen.add(grondblokkenView);
        }
        
        //test
        /*
        if (super.getFireballTimer() > 5000){
            elementen.add(new Fireball(400,0));
            elementen.add(new Fireball(460,0));
        }*/
        
        spawnFireball();
        
        //level border
        elementen.add(new BlokCastle(-350, 332));
        elementen.add(new BlokCastle(-350, 302));
        elementen.add(new BlokCastle(-350, 272));
        elementen.add(new BlokCastle(-350, 242));
        
        elementen.add(new BlokCastle(1050, 332));
        elementen.add(new BlokCastle(1050, 302));
        elementen.add(new BlokCastle(1050, 272));
        elementen.add(new BlokCastle(1050, 242));
        
        //muurtje
        elementen.add(new BlokCastle(-140,332));
        elementen.add(new BlokCastle(-110,302));
        elementen.add(new BlokCastle(-110,332));
        elementen.add(new BlokCastle(-80,332));
        elementen.add(new BlokCastle(10,332));
        elementen.add(new BlokCastle(10,302));
        elementen.add(new BlokCastle(10,272));
        elementen.add(new BlokCastle(100,272));
        elementen.add(new BlokCastle(250,272));
        elementen.add(new BlokCastle(280,272));
        elementen.add(new BlokCastle(310,272));
        elementen.add(new BlokCastle(340,272));
        elementen.add(new BlokCastle(370,272));
        elementen.add(new BlokCastle(670,332));
        elementen.add(new BlokCastle(700,332));
        elementen.add(new BlokCastle(700,302));
        elementen.add(new BlokCastle(730,332)); 
        elementen.add(new BlokCastle(730,302));
        elementen.add(new BlokCastle(730,272));
        
        //enemy's
        elementen.add(new Bowser(900,277));
        
        //coins
        elementen.add(new Coin(-205, 337)); 
        elementen.add(new Coin(15,187)); 
        elementen.add(new Coin(255,157));
        elementen.add(new Coin(525,337));
        elementen.add(new Coin(765,217));
        
        //Peach
        elementen.add(new Peach(1000,309));
        
        super.addElementen(elementen);
    }
    
    public void spawnFireball(){
        Random rndgen = new Random();
        for(int i = 0; i < 8; i++){
            int plaats = rndgen.nextInt(1000)-150;
            int hoogte = -1*rndgen.nextInt(50);            
            super.addElement(new Fireball(plaats,hoogte));
        }
        super.resetFireballTimer();
    }
    
}

