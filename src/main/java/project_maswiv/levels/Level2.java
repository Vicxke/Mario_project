/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.levels;

import java.util.ArrayList;
import javafx.scene.layout.AnchorPane;
import project_maswiv.PlaygroundFXMLController;
import project_maswiv.model.Blok;
import project_maswiv.model.Coin;
import project_maswiv.model.Element;
import project_maswiv.model.Game;
import project_maswiv.model.Goomba;
import project_maswiv.model.GrondBlok;
import project_maswiv.model.Lava;
import project_maswiv.model.Mario;
import project_maswiv.model.RoodGrondBlok;
import project_maswiv.model.YoshiEgg;
import project_maswiv.view.MainView;


/**
 *
 * @author Stef
 */
public class Level2 extends Game{

    public Level2(Mario model) {
        super(model);
        ArrayList<Element> elementen = new ArrayList<>();
        
        //grond
        for (int i = -20;i<80;i++) {
            RoodGrondBlok RoodGrondBlokView = new RoodGrondBlok(i*80, 360);
            elementen.add(RoodGrondBlokView);
        }
        
        //blokken
        elementen.add(new Blok(-350,332));
        elementen.add(new Blok(-350,302));
        elementen.add(new Blok(-350,272));
        elementen.add(new Blok(-350,242));  
        elementen.add(new Blok(-20, 332));
        elementen.add(new Blok(-20, 302));
        elementen.add(new Blok(-20, 272));
        elementen.add(new Blok(350, 272));
        elementen.add(new Blok(380, 272));
        elementen.add(new Blok(410, 272));
        elementen.add(new Blok(500, 332));
        elementen.add(new Blok(590, 272));
        elementen.add(new Blok(620, 272));
        elementen.add(new Blok(770, 342));
        elementen.add(new Blok(800, 342));
        elementen.add(new Blok(830, 342));
        elementen.add(new Blok(860, 342));
        elementen.add(new Blok(980, 312));
        elementen.add(new Blok(980, 132));
        elementen.add(new Blok(950, 132));
        elementen.add(new Blok(920, 132));
        elementen.add(new Blok(1070, 252));
        elementen.add(new Blok(1100, 252));
        elementen.add(new Blok(1130, 252));
        elementen.add(new Blok(1270, 282));
        elementen.add(new Blok(1300, 282));
        elementen.add(new Blok(1490,332));
        elementen.add(new Blok(1670,272));
        elementen.add(new Blok(1640,272));
        elementen.add(new Blok(1810,242));
        elementen.add(new Blok(1840,242));
        elementen.add(new Blok(1870,242));
        elementen.add(new Blok(2020,272)); 
        elementen.add(new Blok(2050,272));
        elementen.add(new Blok(2300,332));
        elementen.add(new Blok(2420,272));
        elementen.add(new Blok(2450,272));
        elementen.add(new Blok(2510,212));
        elementen.add(new Blok(2600,342));
        elementen.add(new Blok(2630,342));
        elementen.add(new Blok(2660,342));
        
        
        elementen.add(new Blok(2930,332));
        
        //enemy's
        elementen.add(new Goomba(1800,333));
        elementen.add(new Goomba(2100,333));
        
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
        
        super.setElementen(elementen);
        super.setUpdateHartjes(true);
    }
}
