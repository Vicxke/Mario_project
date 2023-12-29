/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.levels;

import java.util.ArrayList;
import javafx.scene.layout.AnchorPane;
import project_maswiv.PlaygroundFXMLController;
import project_maswiv.model.level.Blok;
import project_maswiv.model.level.BlokWoods;
import project_maswiv.model.elementen.Coin;
import project_maswiv.model.elementen.Coopa;
import project_maswiv.model.Element;
import project_maswiv.model.level.Finish;
import project_maswiv.model.elementen.Fireball;
import project_maswiv.model.Game;
import project_maswiv.model.elementen.Goomba;
import project_maswiv.model.level.GrondBlokWoods;
import project_maswiv.model.level.Lava;
import project_maswiv.model.Mario;
import project_maswiv.model.level.Spikes;
import project_maswiv.model.elementen.YoshiEgg;
import project_maswiv.view.MainView;

/**
 *
 * @author Vicxke
 */
public class Level1 extends Game{
    private Game game;
    
    public Level1() {
        super();
        
        ArrayList<Element> elementen = new ArrayList<>();
        
        //grond
        for (int i = -20;i<80;i++) {
            GrondBlokWoods grondblokkenView = new GrondBlokWoods(i*60, 360);
            elementen.add(grondblokkenView);
        }
        
        //level border
        elementen.add(new BlokWoods(-350, 332));
        elementen.add(new BlokWoods(-350, 302));
        elementen.add(new BlokWoods(-350, 272));
        elementen.add(new BlokWoods(-350, 242));
        
        //muurtje
        elementen.add(new BlokWoods(450,332));
        elementen.add(new BlokWoods(450,150));
        elementen.add(new BlokWoods(600,332));
        elementen.add(new BlokWoods(630,332));
        elementen.add(new BlokWoods(630,302));
        elementen.add(new BlokWoods(660,332));
        elementen.add(new BlokWoods(660,302));
        elementen.add(new BlokWoods(660,273));
        elementen.add(new BlokWoods(750,302));
        elementen.add(new BlokWoods(1000,332));
        elementen.add(new BlokWoods(1400,332));
        elementen.add(new BlokWoods(1430,302));
        elementen.add(new BlokWoods(1460,272));
        elementen.add(new BlokWoods(1490,242));
        elementen.add(new BlokWoods(1690,272));
        elementen.add(new BlokWoods(1720,272)); 
        elementen.add(new BlokWoods(1750,272));
        elementen.add(new BlokWoods(1960,332));
        elementen.add(new BlokWoods(2200,332));
        elementen.add(new BlokWoods(2230,332));
        elementen.add(new BlokWoods(2260,242));
        elementen.add(new BlokWoods(2290,242));
        elementen.add(new BlokWoods(2500,332));  
        elementen.add(new BlokWoods(2590,272));
        elementen.add(new BlokWoods(2620,272));
        elementen.add(new BlokWoods(2650,331));
        elementen.add(new BlokWoods(2770,302));
        elementen.add(new BlokWoods(2860,242));
        elementen.add(new BlokWoods(2920,302));
        elementen.add(new BlokWoods(2980,212));
        elementen.add(new BlokWoods(2980,182));
        elementen.add(new BlokWoods(2980,152));
        elementen.add(new BlokWoods(3010,332));
        elementen.add(new BlokWoods(3240,272));
        elementen.add(new BlokWoods(3270,272));
        elementen.add(new BlokWoods(3300,272));
        elementen.add(new BlokWoods(3330,272));
        elementen.add(new BlokWoods(3360,272));
        elementen.add(new BlokWoods(3390,272));
        elementen.add(new BlokWoods(3420,272));
        elementen.add(new BlokWoods(3330,187));
        elementen.add(new BlokWoods(3360,187));
        elementen.add(new BlokWoods(3390,187));
        elementen.add(new BlokWoods(3600,332));
        elementen.add(new BlokWoods(3690,272));
        elementen.add(new BlokWoods(3720,272));
        elementen.add(new BlokWoods(3810,331));
        elementen.add(new BlokWoods(3840,331));
        elementen.add(new BlokWoods(3870,331));
        elementen.add(new BlokWoods(3900,331));
        elementen.add(new BlokWoods(3960,271));
        elementen.add(new BlokWoods(4050,241));
        elementen.add(new BlokWoods(4140,211));
        elementen.add(new BlokWoods(4170,211));
        elementen.add(new BlokWoods(4200,211));
        elementen.add(new BlokWoods(4380,332));
        
        //enemy's
        elementen.add(new Coopa(550,333));
        elementen.add(new Coopa(700,333));
        elementen.add(new Coopa(900,333));
        elementen.add(new Coopa(1490,333));
        elementen.add(new Coopa(1610,333));
        elementen.add(new Coopa(2260,333));
        elementen.add(new Coopa(3200,333));
        elementen.add(new Coopa(3300,333));
        
        //coins
        elementen.add(new Coin(10, 336)); 
        elementen.add(new Coin(1600,182)); 
        elementen.add(new Coin(1720,242));
        elementen.add(new Coin(2355,212));
        elementen.add(new Coin(2415,212));
        elementen.add(new Coin(2655,306));
        elementen.add(new Coin(3365,107));
        elementen.add(new Coin(3275,245));
        elementen.add(new Coin(3395,245));
        elementen.add(new Coin(3875,306));
        elementen.add(new Coin(3785,220));
        elementen.add(new Coin(4145,186));
        elementen.add(new Coin(4175,186));
        elementen.add(new Coin(4205,186));
        elementen.add(new Coin(4145,156));
        elementen.add(new Coin(4175,156));
        elementen.add(new Coin(4205,156));
        
        //easter egg
        elementen.add(new YoshiEgg(-300,333));
       
        //Spikes
        elementen.add(new Spikes(-50,350));
        elementen.add(new Spikes(-21,350));
        for (int i = 0;i<16;i++) {
            Spikes SpikesView = new Spikes(2530 + i*30, 350);
            elementen.add(SpikesView);
        }
        for (int i = 0;i<25;i++) {
            Spikes SpikesView = new Spikes(3630 + i*30, 350);
            elementen.add(SpikesView);
        }
        
        //Finish
        elementen.add(new Finish(4800,160));
        
        super.addElementen(elementen);
        
        //super.setUpdateHartjes(true);
    }
    
}


