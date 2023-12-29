/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.levels;

import java.util.ArrayList;
import javafx.scene.layout.AnchorPane;
import project_maswiv.PlaygroundFXMLController;
import project_maswiv.model.level.Blok;
import project_maswiv.model.level.BlokLava;
import project_maswiv.model.elementen.Coin;
import project_maswiv.model.Element;
import project_maswiv.model.level.Finish;
import project_maswiv.model.Game;
import project_maswiv.model.elementen.Goomba;
import project_maswiv.model.level.GrondBlokWoods;
import project_maswiv.model.level.Lava;
import project_maswiv.model.Mario;
import project_maswiv.model.level.GrondBlokRood;
import project_maswiv.model.elementen.YoshiEgg;
import project_maswiv.view.MainView;


/**
 *
 * @author Stef
 */
public class Level2 extends Game{

    public Level2() {
        super();
        ArrayList<Element> elementen = new ArrayList<>();
        
        //grond
        for (int i = -20;i<80;i++) {
            GrondBlokRood RoodGrondBlokView = new GrondBlokRood(i*80, 360);
            elementen.add(RoodGrondBlokView);
        }
        
        //blokken
        elementen.add(new BlokLava(-350,332));
        elementen.add(new BlokLava(-350,302));
        elementen.add(new BlokLava(-350,272));
        elementen.add(new BlokLava(-350,242));  
        elementen.add(new BlokLava(-20, 332));
        elementen.add(new BlokLava(-20, 302));
        elementen.add(new BlokLava(-20, 272));
        elementen.add(new BlokLava(350, 272));
        elementen.add(new BlokLava(380, 272));
        elementen.add(new BlokLava(410, 272));
        elementen.add(new BlokLava(500, 332));
        elementen.add(new BlokLava(590, 272));
        elementen.add(new BlokLava(620, 272));
        elementen.add(new BlokLava(770, 342));
        elementen.add(new BlokLava(800, 342));
        elementen.add(new BlokLava(830, 342));
        elementen.add(new BlokLava(860, 342));
        elementen.add(new BlokLava(980, 312));
        elementen.add(new BlokLava(980, 132));
        elementen.add(new BlokLava(950, 132));
        elementen.add(new BlokLava(920, 132));
        elementen.add(new BlokLava(1070, 252));
        elementen.add(new BlokLava(1100, 252));
        elementen.add(new BlokLava(1130, 252));
        elementen.add(new BlokLava(1270, 282));
        elementen.add(new BlokLava(1300, 282));
        elementen.add(new BlokLava(1490,332));
        elementen.add(new BlokLava(1670,272));
        elementen.add(new BlokLava(1640,272));
        elementen.add(new BlokLava(1810,242));
        elementen.add(new BlokLava(1840,242));
        elementen.add(new BlokLava(1870,242));
        elementen.add(new BlokLava(2140,272));
        elementen.add(new BlokLava(2300,332));
        elementen.add(new BlokLava(2420,272));
        elementen.add(new BlokLava(2450,272));
        elementen.add(new BlokLava(2510,212));
        elementen.add(new BlokLava(2600,342));
        elementen.add(new BlokLava(2630,342));
        elementen.add(new BlokLava(2660,342));
        elementen.add(new BlokLava(2800,312));
        elementen.add(new BlokLava(2930,332));
        elementen.add(new BlokLava(3150,332));
        elementen.add(new BlokLava(3180,332));
        elementen.add(new BlokLava(3180,302));
        elementen.add(new BlokLava(3210,332));
        elementen.add(new BlokLava(3210,302));
        elementen.add(new BlokLava(3210,272));
        elementen.add(new BlokLava(3330,272));
        elementen.add(new BlokLava(3360,272));
        elementen.add(new BlokLava(3450,302));
        elementen.add(new BlokLava(3570,242));
        elementen.add(new BlokLava(3660,272));
        elementen.add(new BlokLava(3820,212));
        elementen.add(new BlokLava(3980,152));
        elementen.add(new BlokLava(4100,342));
        elementen.add(new BlokLava(4130,342));
        elementen.add(new BlokLava(4160,342));
        elementen.add(new BlokLava(4190,342));
        elementen.add(new BlokLava(4310,312));
        elementen.add(new BlokLava(4430,332));
        elementen.add(new BlokLava(4600,332));
        elementen.add(new BlokLava(4690,272));
        elementen.add(new BlokLava(4780,212));
        elementen.add(new BlokLava(4810,212));
        elementen.add(new BlokLava(4840,212));
        elementen.add(new BlokLava(4870,212));
        elementen.add(new BlokLava(4900,212));
        elementen.add(new BlokLava(4930,212));
        elementen.add(new BlokLava(4960,212));
        
        //enemy's
        elementen.add(new Goomba(1800,333));
        elementen.add(new Goomba(2100,333));
        elementen.add(new Goomba(3600,333));
        elementen.add(new Goomba(3400,333));
        
        //coins
        elementen.add(new Coin(385,247));
        elementen.add(new Coin(625,247));
        elementen.add(new Coin(725, 227));
        elementen.add(new Coin(835, 317));
        elementen.add(new Coin(1105, 227));
        elementen.add(new Coin(985, 107));
        elementen.add(new Coin(955, 107));
        elementen.add(new Coin(925, 107));
        elementen.add(new Coin(985, 77));
        elementen.add(new Coin(955, 77));
        elementen.add(new Coin(925, 77));
        elementen.add(new Coin(1845,217));
        elementen.add(new Coin(2455,247));
        elementen.add(new Coin(2515,187));
        elementen.add(new Coin(2635,317));
        elementen.add(new Coin(3365,247));
        elementen.add(new Coin(3575,217));
        elementen.add(new Coin(3985,127));
        elementen.add(new Coin(4165,317));
        elementen.add(new Coin(4785,187));
        elementen.add(new Coin(4815,187));
        elementen.add(new Coin(4845,187));
        elementen.add(new Coin(4875,187));
        elementen.add(new Coin(4905,187));
        elementen.add(new Coin(4935,187));
        elementen.add(new Coin(4965,187));
        elementen.add(new Coin(4785,157));
        elementen.add(new Coin(4815,157));
        elementen.add(new Coin(4845,157));
        elementen.add(new Coin(4875,157));
        elementen.add(new Coin(4905,157));
        elementen.add(new Coin(4935,157));
        elementen.add(new Coin(4965,157));
        
        
        //easter egg
        elementen.add(new YoshiEgg(-300,333));
        
        //lava
        for (int i = 0;i<16;i++) {
            Lava LavaView = new Lava(530 + i*60,350);
            elementen.add(LavaView);
        }
        for (int i = 0;i<10;i++) {
            Lava LavaView = new Lava(2330 + i*60,350);
            elementen.add(LavaView);
        }
        for (int i = 0;i<10;i++) {
            Lava LavaView = new Lava(3830 + i*60,350);
            elementen.add(LavaView);
        }
        
        //Finish
        elementen.add(new Finish(5300,160));
        
        super.addElementen(elementen);
        //super.setUpdateHartjes(true);
    }
}
