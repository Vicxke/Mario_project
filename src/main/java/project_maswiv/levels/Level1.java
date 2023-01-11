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
import project_maswiv.model.YoshiEgg;
import project_maswiv.view.MainView;

/**
 *
 * @author Vicxke
 */
public class Level1 extends Game{

    public Level1(Mario mario) {
        super(mario);
        
        ArrayList<Element> elementen = new ArrayList<>();
        //grond
        for (int i = -20;i<50;i++) {
            GrondBlok grondblokkenView = new GrondBlok(i*80, 360);
            elementen.add(grondblokkenView);
        }
        
        elementen.add(new Blok(-350, 332));
        elementen.add(new Blok(-350, 302));
        elementen.add(new Blok(-350, 272));
        elementen.add(new Blok(-350, 242));
        
        //muurtje
        elementen.add(new Blok(450, 332));
        elementen.add(new Blok(450, 150));
        elementen.add(new Blok(600, 332));
        elementen.add(new Blok(630, 332));
        elementen.add(new Blok(630, 302));
        elementen.add(new Blok(660, 332));
        elementen.add(new Blok(660, 302));
        elementen.add(new Blok(660, 273));
        elementen.add(new Blok(750, 302));
        elementen.add(new Blok(1000, 332));
        
        //enemy's
        elementen.add(new Goomba(550, 333));
        elementen.add(new Goomba(700, 333));
        elementen.add(new Goomba(900, 333));
        
        //lava
        elementen.add(new Lava(-50,350));
        
        //coins
        elementen.add(new Coin(10, 336));
        
        //easter egg
        elementen.add(new YoshiEgg(-300,333));
        
        //level1
        elementen.add(new Blok(1400, 332));
        elementen.add(new Blok(1430, 302));
        elementen.add(new Blok(1460, 272));
        elementen.add(new Blok(1490, 242));
        elementen.add(new Goomba(1490, 333));
        elementen.add(new Goomba(1610, 333));
        elementen.add(new Coin(1600, 182));
        elementen.add(new Blok(1690,272));
        elementen.add(new Blok(1720, 272));
        elementen.add(new Coin(1720, 242));
        elementen.add(new Blok(1750, 272));
        elementen.add(new Blok(1960, 332));
        elementen.add(new Blok(2200, 332));
        elementen.add(new Blok(2230, 332));
        elementen.add(new Blok(2260, 242));
        elementen.add(new Blok(2290, 242));
        elementen.add(new Coin(2355, 212));
        elementen.add(new Coin(2415, 212));
        elementen.add(new Goomba(2260, 333));
        elementen.add(new Blok(2500, 332));
        elementen.add(new Lava(2530, 350));
        elementen.add(new Lava(2590, 350));
        elementen.add(new Lava(2650, 350));
        elementen.add(new Lava(2710, 350));
        elementen.add(new Lava(2770, 350));
        elementen.add(new Lava(2830, 350));
        elementen.add(new Lava(2890, 350));
        elementen.add(new Lava(2950, 350));
        elementen.add(new Blok(2590, 272));
        elementen.add(new Blok(2620, 272));
        elementen.add(new Blok(2650, 332));
        elementen.add(new Coin(2655, 306));
        elementen.add(new Blok(2770, 302));
        elementen.add(new Blok(2860, 242));
        elementen.add(new Blok(2920, 302));
        elementen.add(new Blok(2980, 212));
        elementen.add(new Blok(2980, 182));
        elementen.add(new Blok(2980, 152));
        elementen.add(new Blok(3010, 332));
        
        super.setElementen(elementen);
        
        super.setUpdateHartjes(true);
    }
    
}


