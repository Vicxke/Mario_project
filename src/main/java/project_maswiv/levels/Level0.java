/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.levels;

import java.util.ArrayList;
import javafx.scene.control.Button;
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
import project_maswiv.model.MarioLuigi;
import project_maswiv.model.YoshiEgg;
import project_maswiv.view.MainView;

/**
 *
 * @author Wannes
 */
public class Level0 extends Game{

    public Level0(Mario mario) {
        super(mario);
        ArrayList<Element> elementen = new ArrayList<>();
        //grond
        for (int i = -5;i<20;i++) {
            GrondBlok grondblokkenView = new GrondBlok(i*80, 360);
            elementen.add(grondblokkenView);
        }
        
        
        //borders
        for (int i = 0;i<12;i++) {
            Blok blokView = new Blok(-30, 332 - i*30);
            elementen.add(blokView);
        }
        for (int i = 0;i<12;i++) {
            Blok blokView = new Blok(700, 332 - i*30);
            elementen.add(blokView);
        }
        
        //parkour
        elementen.add(new Blok(32, 272));
        elementen.add(new Blok(28, 182));
        elementen.add(new Blok(150, 122));        
        elementen.add(new Blok(271, 212));        
        elementen.add(new Blok(269, 32));        
        elementen.add(new Blok(269, 62));        
        elementen.add(new Blok(269, 92));
        elementen.add(new Blok(510, 212));
        elementen.add(new Blok(480, 212));
        elementen.add(new Blok(630, 152));
        elementen.add(new Blok(480, 92));
        
        //marioluigi
        elementen.add(new MarioLuigi(360,-70));
        
        //Button btn = new Button("Level");
        //btn.setOnMousePressed(Event -> controller.resetLevel());
       
        super.setElementen(elementen);
    }
    
}


