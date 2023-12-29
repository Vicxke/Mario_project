/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.levels;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import project_maswiv.model.level.BlokDessert;
import project_maswiv.model.level.BlokLava;
import project_maswiv.model.elementen.Coin;
import project_maswiv.model.Element;
import project_maswiv.model.level.Finish;
import project_maswiv.model.Game;
import project_maswiv.model.level.GrondBlokDessert;
import project_maswiv.model.level.Quicksand;
import project_maswiv.model.elementen.Skeleton;
import project_maswiv.model.elementen.YoshiEgg;

/**
 *
 * @author Wannes
 */
public class Level3 extends Game{
    private boolean sandstorm;

    public Level3() {
        super();
        ArrayList<Element> elementen = new ArrayList<>();
        
        //grond
        for (int i = -20;i<80;i++) {
            GrondBlokDessert GrondBlokDessertView = new GrondBlokDessert(i*80, 360);
            elementen.add(GrondBlokDessertView);
        }
        
        //spawnSandstorm();
        
        //blokken
        elementen.add(new BlokDessert(-350,332));
        elementen.add(new BlokDessert(-350,302));
        elementen.add(new BlokDessert(-350,272));
        elementen.add(new BlokDessert(-350,242));  
        elementen.add(new BlokDessert(-20, 332));
        elementen.add(new BlokDessert(-20, 302));
        elementen.add(new BlokDessert(-20, 272));
        elementen.add(new BlokDessert(400, 332));
        elementen.add(new BlokDessert(430, 332));
        elementen.add(new BlokDessert(430, 302));
        elementen.add(new BlokDessert(580, 302));
        elementen.add(new BlokDessert(880, 332));
        elementen.add(new BlokDessert(1150, 332));
        elementen.add(new BlokDessert(1270, 272));
        elementen.add(new BlokDessert(1300, 272));
        elementen.add(new BlokDessert(1330, 272));
        elementen.add(new BlokDessert(1450, 242));
        elementen.add(new BlokDessert(1600, 332));
        elementen.add(new BlokDessert(1630, 332));
        elementen.add(new BlokDessert(1750, 302));
        elementen.add(new BlokDessert(1840, 242));
        elementen.add(new BlokDessert(1900, 342));
        elementen.add(new BlokDessert(1930, 342));
        elementen.add(new BlokDessert(2050, 302));
        elementen.add(new BlokDessert(2080, 332));
        elementen.add(new BlokDessert(2230, 332));
        elementen.add(new BlokDessert(2260,332));
        elementen.add(new BlokDessert(2260,302));
        elementen.add(new BlokDessert(2350,242));
        elementen.add(new BlokDessert(2380,242));
        elementen.add(new BlokDessert(2410,242));
        elementen.add(new BlokDessert(2440,242));
        elementen.add(new BlokDessert(2515,332));
        elementen.add(new BlokDessert(2590,272));
        elementen.add(new BlokDessert(2620,272));
        elementen.add(new BlokDessert(2620,242));
        elementen.add(new BlokDessert(2650,272));
        elementen.add(new BlokDessert(2680,272));
        elementen.add(new BlokDessert(2710,272));
        elementen.add(new BlokDessert(2740,272));
        elementen.add(new BlokDessert(2770,272));
        elementen.add(new BlokDessert(2770,242));
        elementen.add(new BlokDessert(2890,332));
        elementen.add(new BlokDessert(2920,332));
        elementen.add(new BlokDessert(2920,302));
        elementen.add(new BlokDessert(2950,332));
        elementen.add(new BlokDessert(3100,272));
        elementen.add(new BlokDessert(3130,272));
        elementen.add(new BlokDessert(3280,332));
        elementen.add(new BlokDessert(3460,302));
        elementen.add(new BlokDessert(3490,272));
        elementen.add(new BlokDessert(3520,272));
        elementen.add(new BlokDessert(3550,272));
        elementen.add(new BlokDessert(3730,332));
        elementen.add(new BlokDessert(3880,332));
        elementen.add(new BlokDessert(3910,332));
        elementen.add(new BlokDessert(3910,302));
        elementen.add(new BlokDessert(4060,242));
        elementen.add(new BlokDessert(4060,342));
        elementen.add(new BlokDessert(4090,342));
        elementen.add(new BlokDessert(4120,342));
        elementen.add(new BlokDessert(4210,302));
        elementen.add(new BlokDessert(4240,182));
        elementen.add(new BlokDessert(4270,302));
        elementen.add(new BlokDessert(4300,182));
        elementen.add(new BlokDessert(4330,302));
        elementen.add(new BlokDessert(4570,332));
        elementen.add(new BlokDessert(4660,272));
        elementen.add(new BlokDessert(4810,272));
        elementen.add(new BlokDessert(4960,332));
        elementen.add(new BlokDessert(4990,332));
        elementen.add(new BlokDessert(5020,302));
        
        //enemy's
        elementen.add(new Skeleton(520,333));
        elementen.add(new Skeleton(670,333));
        elementen.add(new Skeleton(760,333));
        elementen.add(new Skeleton(820,333));
        elementen.add(new Skeleton(1240,333));
        elementen.add(new Skeleton(1450,333));
        elementen.add(new Skeleton(2320,333));
        elementen.add(new Skeleton(2410,333));
        elementen.add(new Skeleton(2650,243));
        elementen.add(new Skeleton(3370,333));
        elementen.add(new Skeleton(3490,333));
        elementen.add(new Skeleton(4600,333));
        
        //coins
        elementen.add(new Coin(495,307));
        elementen.add(new Coin(735,247));
        elementen.add(new Coin(765, 227));
        elementen.add(new Coin(795, 247));
        elementen.add(new Coin(925, 277));
        elementen.add(new Coin(1275, 247));
        elementen.add(new Coin(1305, 247));
        elementen.add(new Coin(1305, 307));
        elementen.add(new Coin(1335, 247));
        elementen.add(new Coin(1635, 247));
        elementen.add(new Coin(1875, 307));
        elementen.add(new Coin(2325, 307));
        elementen.add(new Coin(2355,217));
        elementen.add(new Coin(2385,217));
        elementen.add(new Coin(2415,217));
        elementen.add(new Coin(2445,217));
        elementen.add(new Coin(2565,307));
        elementen.add(new Coin(2685,307));
        elementen.add(new Coin(2685,217));
        elementen.add(new Coin(2715,217));
        elementen.add(new Coin(2775,307));
        elementen.add(new Coin(3105,217));
        elementen.add(new Coin(3135,247));
        elementen.add(new Coin(3165,217));
        elementen.add(new Coin(3195,247));
        elementen.add(new Coin(3495,307));
        elementen.add(new Coin(3525,307));
        elementen.add(new Coin(4065,217));
        elementen.add(new Coin(4095,217));
        elementen.add(new Coin(4125,217));
        elementen.add(new Coin(4665,247));
        elementen.add(new Coin(4725,217));
        elementen.add(new Coin(4755,217));
        elementen.add(new Coin(4815,247));
        
        
        //easter egg
        elementen.add(new YoshiEgg(-300,333));
        
        //guicksand
        for (int i = 0;i<3;i++) {
            Quicksand QuicksandView = new Quicksand(970 + i*30,359);
            elementen.add(QuicksandView);
        }
        for (int i = 0;i<14;i++) {
            Quicksand QuicksandView = new Quicksand(1660 + i*30,355);
            elementen.add(QuicksandView);
        }
        for (int i = 0;i<20;i++) {
            Quicksand QuicksandView = new Quicksand(3940 + i*30,355);
            elementen.add(QuicksandView);
        }
        
        //Finish
        elementen.add(new Finish(5300,160));
        
        super.addElementen(elementen);
        //super.setUpdateHartjes(true);
    }
    
    
    public boolean isSandstormActive(){
        return sandstorm;
    }

    public void setSandstorm(boolean sandstorm) {
        if(sandstorm){
            super.getMario().speedDown();
        }else{
           super.getMario().speedUp(); 
        }
        this.sandstorm = sandstorm;
    }
   
}
