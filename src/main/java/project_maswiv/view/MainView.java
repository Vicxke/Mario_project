/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;

import project_maswiv.view.elementen.PeachView;
import project_maswiv.view.elementen.SkeletonView;
import project_maswiv.view.elementen.YoshiEggView;
import project_maswiv.view.elementen.FireballView;
import project_maswiv.view.elementen.GoombaView;
import project_maswiv.view.elementen.CoopaView;
import project_maswiv.view.elementen.CoinView;
import project_maswiv.view.elementen.BowserView;
import project_maswiv.view.level.SpikesView;
import project_maswiv.view.level.QuicksandView;
import project_maswiv.view.level.LavaView;
import project_maswiv.view.level.GrondBlokWoodsView;
import project_maswiv.view.level.GrondBlokStoneView;
import project_maswiv.view.level.GrondBlokRoodView;
import project_maswiv.view.level.GrondBlokDessertView;
import project_maswiv.view.level.GrondBlokCastleView;
import project_maswiv.view.level.FinishView;
import project_maswiv.view.level.BlokWoodsView;
import project_maswiv.view.level.BlokView;
import project_maswiv.view.level.BlokLavaView;
import project_maswiv.view.level.BlokDessertView;
import project_maswiv.view.level.BlokCastleView;
import project_maswiv.model.level.Blok;
import project_maswiv.model.elementen.Coin;
import project_maswiv.model.Element;
import project_maswiv.model.elementen.Goomba;
import project_maswiv.model.level.GrondBlokWoods;
import project_maswiv.model.level.Lava;
import project_maswiv.model.elementen.YoshiEgg;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import project_maswiv.levels.Level3;
import project_maswiv.model.level.BlokCastle;
import project_maswiv.model.level.BlokDessert;
import project_maswiv.model.level.BlokLava;
import project_maswiv.model.level.BlokWoods;
import project_maswiv.model.elementen.Bowser;
import project_maswiv.model.elementen.Coopa;
import project_maswiv.model.level.Finish;
import project_maswiv.model.elementen.Fireball;
import project_maswiv.model.Game;
import project_maswiv.model.level.GrondBlokCastle;
import project_maswiv.model.level.GrondBlokDessert;
import project_maswiv.model.MarioLuigi;
import project_maswiv.model.level.GrondBlokRood;
import project_maswiv.model.level.GrondBlokStone;
import project_maswiv.model.elementen.Peach;
import project_maswiv.model.level.Quicksand;
import project_maswiv.model.elementen.Skeleton;
import project_maswiv.model.level.Spikes;

/**
 *
 * @author Vicxke
 */
public class MainView extends Region{
    private Game model;
    
    private Label lblHighscore1;
    private Label lblHighscore2;
    private Label lblHighscore3;
    private Label lblHighscore4;
    
    private MarioView marioView;
    private ImageView achtergrond;
    private boolean achtergrondChange;
    
    private ArrayList<View> views;
    //private ArrayList<GoombaView> enemys;
    
    //private ArrayList<GrondBlokView> grond;
    private ArrayList<ImageView> hartjes;
    
    private Label lblCoins;
    private Label lblTimer;
    private ImageView coin;

    public MainView(Game model, ImageView afbeelding) {
        this.model = model;
        marioView = new MarioView(model.getMario());
        views = new ArrayList<>();
        achtergrond = afbeelding;
        achtergrondChange = true;
        getChildren().add(achtergrond);
        //enemys = new ArrayList<>();
        if(model.isLoadOverlay()){

            hartjes = new ArrayList<>();
            setHearts(model.getLevens());

            
            lblTimer = new Label();
            lblTimer.setLayoutX(640);
            lblTimer.setLayoutY(10);
            lblTimer.setFont(new Font(24));
            lblTimer.setTextFill(Color.BLACK);
            
            
            //coins view
            lblCoins = new Label();
            lblCoins.setLayoutX(5);
            lblCoins.setLayoutY(10);
            lblCoins.setFont(new Font(24));
            lblCoins.setTextFill(Color.BLACK);
            
            coin = new  ImageView(new Image(new File("src/main/resources/files/coinS2T.png").toURI().toString()));
            coin.setLayoutX(30);
            coin.setLayoutY(12);
            coin.setFitHeight(30);
            coin.setFitWidth(40);
            
            /*
            if(level3.getSandstorm()== false){
            achtergrond = new  ImageView(new Image(new File("src/main/resources/files/backgroundLevel3.jpg").toURI().toString()));
            }
            if(level3.getSandstorm()== true){
            achtergrond = new  ImageView(new Image(new File("src/main/resources/files/sandstorm.gif").toURI().toString()));
            }
            */

            //toevoegen aan mainview
            
            getChildren().add(lblCoins);
            getChildren().add(coin);
            getChildren().add(lblTimer);
            //getChildren().addAll(hartjes);
        }
        
        getChildren().add(marioView);
        //
        
    }
    
    public void addElementen(Iterator<Element> elementen){
        while(elementen.hasNext()){
            Element el = elementen.next();
            addElement(el);
        }
        //getChildren().addAll(views);
        //getChildren().clear(); //clear childeren eerst
    }
    
    public void addElement(Element el){
        View view = null;
        if(el instanceof Blok){
            Blok b = (Blok) el;
            view = new BlokView(b);
        }else if(el instanceof BlokDessert){
            BlokDessert bd = (BlokDessert) el;
            view = new BlokDessertView(bd);
        }else if(el instanceof BlokLava){
            BlokLava bl = (BlokLava) el;
            view = new BlokLavaView(bl);
        }else if(el instanceof BlokWoods){
            BlokWoods bd = (BlokWoods) el;
            view = new BlokWoodsView(bd);
        }else if(el instanceof BlokCastle){
            BlokCastle bc = (BlokCastle) el;
            view = new BlokCastleView(bc);
        }else if(el instanceof Coopa){
            Coopa co = (Coopa) el;
            view = new CoopaView(co);
        }else if(el instanceof Goomba){
            Goomba go = (Goomba) el;
            view = new GoombaView(go);
        }else if(el instanceof Skeleton){
            Skeleton sk = (Skeleton) el;
            view = new SkeletonView(sk);
        }else if(el instanceof Coin){
            Coin c = (Coin) el;
            view = new CoinView(c);
        }else if(el instanceof YoshiEgg){
            YoshiEgg ye = (YoshiEgg) el;
            view = new YoshiEggView(ye);
        }else if(el instanceof Lava){
            Lava la = (Lava) el;
            view = new LavaView(la);
        }else if(el instanceof Quicksand){
            Quicksand qs = (Quicksand) el;
            view = new QuicksandView(qs);
        }else if(el instanceof MarioLuigi){
            MarioLuigi ml = (MarioLuigi) el;
            view = new MarioLuigiView(ml);
        }else if(el instanceof Spikes){
            Spikes sp = (Spikes) el;
            view = new SpikesView(sp);
        }else if(el instanceof Finish){
            Finish fi = (Finish) el;
            view = new FinishView(fi);
        }else if(el instanceof GrondBlokRood){
            GrondBlokRood gbr = (GrondBlokRood) el;
            view = new GrondBlokRoodView(gbr);
        }else if(el instanceof GrondBlokWoods){
            GrondBlokWoods gbl = (GrondBlokWoods) el;
            view = new GrondBlokWoodsView(gbl);
        }else if(el instanceof GrondBlokDessert){
            GrondBlokDessert gbd = (GrondBlokDessert) el;
            view = new GrondBlokDessertView(gbd);
        }else if(el instanceof GrondBlokStone){
            GrondBlokStone gbs = (GrondBlokStone) el;
            view = new GrondBlokStoneView(gbs);
        }else if(el instanceof GrondBlokCastle){
            GrondBlokCastle gbc = (GrondBlokCastle) el;
            view = new GrondBlokCastleView(gbc);
        }else if(el instanceof Fireball){
            Fireball fb = (Fireball) el;
            view = new FireballView(fb);
        }else if(el instanceof Bowser){
            Bowser bo = (Bowser) el;
            view = new BowserView(bo);
        }else if(el instanceof Peach){
            Peach pe = (Peach) el;
            view = new PeachView(pe);
        }
        views.add(view);
        getChildren().add(view);
        model.setElemtentSpawned(false);
    }
    
    public void resetView(){
        //getChildren().clear();
        views.clear();
    }
    
    public void update(){
        marioView.update();
        
        if(model.isLoadOverlay()){
            setHearts(model.getLevens());
            setCoinLabel(model.getCoins());
            setTimerLabel(model.getTimer());
        }
        
        ArrayList<View> verwijderViews = new ArrayList<>();
        Iterator<Element> elems = model.getElementen();
        for (View view : views){
            //if(elems.indexOf(view.getElement())==-1){
            if(!model.hasElement(view.getElement())){
                verwijderViews.add(view);
            }else{
                view.updateView();
            }
        }
        
        for(View weg: verwijderViews){
            getChildren().remove(weg);
            views.remove(weg);
        }
        
        //alles bekijken en alle nieuwe elementen toevoegen
        if(model.isElemtentSpawned()){
            while(elems.hasNext()){
                Element el = elems.next();
                boolean found = false;
                for (View view : views){
                    if(view.getElement() == el){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    addElement(el);
                }
            }
        }
        if(model instanceof Level3){
            Level3 lvl = (Level3) model;
            if(achtergrondChange){
                if(lvl.isSandstormActive()){
                    achtergrond.setImage(new Image(new File("src/main/resources/files/sandstorm.gif").toURI().toString()));
                }else{
                    achtergrond.setImage(new Image(new File("src/main/resources/files/backgroundLevel3.jpg").toURI().toString()));
                }
                achtergrondChange = false;
            }
        }
    }

    public void setAchtergrondChange(boolean achtergrondChange) {
        this.achtergrondChange = achtergrondChange;
    }
    
    
    public void setCoinLabel(int coins){
        lblCoins.setText("" + coins);
    }
    
    public void setTimerLabel(int timer){
        lblTimer.setText("" + timer);

    }
    
    public void setHearts(int value){
        if(hartjes.size() != 0){
            for(int i = hartjes.size()-1; i >= value ; i--){
                hartjes.get(i).setImage(new Image(new File("src/main/resources/files/heart4TL.png").toURI().toString()));
            }
        }else{
            for(int i = 0; i <value; i++){
                ImageView hartje = new ImageView(new Image(new File("src/main/resources/files/heart4TV.png").toURI().toString()));
                //loc instellen
                hartje.setFitHeight(29);
                hartje.setFitWidth(26);
                hartje.setLayoutX(i*26);
                hartje.setLayoutY(50);
                hartjes.add(hartje);
            }
            getChildren().addAll(hartjes);
        }
    }
    public void setDeadScreen(ImageView btnRestart, ImageView btnmainMenu) {
        ImageView dood = new ImageView(new Image(new File("src/main/resources/files/fatality.png").toURI().toString()));
        dood.setFitHeight(200);
        dood.setFitWidth(500);
        dood.setLayoutX(100);
        dood.setLayoutY(100);
        
        btnRestart.setFitWidth(180);
        btnRestart.setFitHeight(30);
        //btnRestart.setPrefSize(180, 30);
        btnRestart.setLayoutX(100);
        btnRestart.setLayoutY(300);
        
        //btnmainMenu.setPrefSize(180, 30);
        btnmainMenu.setFitWidth(180);
        btnmainMenu.setFitHeight(30);
        btnmainMenu.setLayoutX(420);
        btnmainMenu.setLayoutY(300);
        
        
        getChildren().addAll(dood, btnRestart, btnmainMenu);
    }
    public void setFinishScreen(ImageView btnRestart, ImageView btnmainMenu) {
        // =hier moet de eindscore van het behaalde level worden weergegeven
        ImageView finish = new ImageView(new Image(new File("src/main/resources/files/finish_1.png").toURI().toString()));
        finish.setFitHeight(200);
        finish.setFitWidth(500);
        finish.setLayoutX(100);
        finish.setLayoutY(20);
        
        
        btnRestart.setFitWidth(180);
        btnRestart.setFitHeight(30);
        //btnRestart.setPrefSize(180, 30);
        btnRestart.setLayoutX(100);
        btnRestart.setLayoutY(300);
        
        //btnmainMenu.setPrefSize(180, 30);
        btnmainMenu.setFitWidth(180);
        btnmainMenu.setFitHeight(30);
        btnmainMenu.setLayoutX(420);
        btnmainMenu.setLayoutY(300);
        
        
        getChildren().addAll(finish, btnRestart, btnmainMenu);
    }
    
    public void setLevel0(ArrayList<ImageView> btns, /*int[] highscores */ int highscore1, int highscore2, int highscore3, int highscore4/*,ArrayList<int> highscores*/) {
        ImageView selectlevel = new ImageView(new Image(new File("src/main/resources/files/selectlevel_cropped2.jpg").toURI().toString()));
        selectlevel.setFitHeight(50);
        selectlevel.setFitWidth(400);
        selectlevel.setLayoutX(150);
        selectlevel.setLayoutY(10);
        
        int i = 0;
        for(ImageView btn: btns){
            btn.setFitHeight(40);
            btn.setFitWidth(40);
            btn.setLayoutX(255+i*50);
            btn.setLayoutY(80);  
            i++;
        }
        /*for(String highscore: highscores){
            Label lbl = new Label();
            lbl.setLayoutX(260);
            lbl.setLayoutY(125);
            lbl.setFont(new Font(16));
            lbl.setTextFill(Color.BLACK);
            lbl.setText(""+highscore);
            i++;
            getChildren().addAll(lbl);
        }*/
        
        lblHighscore1 = new Label();
                lblHighscore1.setLayoutX(260);
                lblHighscore1.setLayoutY(125);
                lblHighscore1.setFont(new Font(16));
                lblHighscore1.setTextFill(Color.BLACK);
                lblHighscore1.setText("" + highscore1);
        lblHighscore2 = new Label();
                lblHighscore2.setLayoutX(260+50);
                lblHighscore2.setLayoutY(125);
                lblHighscore2.setFont(new Font(16));
                lblHighscore2.setTextFill(Color.BLACK);
                lblHighscore2.setText("" + highscore2);
        lblHighscore3 = new Label();
                lblHighscore3.setLayoutX(260+100);
                lblHighscore3.setLayoutY(125);
                lblHighscore3.setFont(new Font(16));
                lblHighscore3.setTextFill(Color.BLACK);
                lblHighscore3.setText("" + highscore3);
        lblHighscore4 = new Label();
                lblHighscore4.setLayoutX(260+150);
                lblHighscore4.setLayoutY(125);
                lblHighscore4.setFont(new Font(16));
                lblHighscore4.setTextFill(Color.BLACK);
                lblHighscore4.setText("" + highscore4);
        
        /*
        for(int j = 1; j < highscores.length; j++) {
            System.out.println(j);
            Label lblHighscore = new Label();
            lblHighscore.setLayoutX(260+i*50);
            lblHighscore.setLayoutY(125);
            lblHighscore.setFont(new Font(16));
            lblHighscore.setTextFill(Color.BLACK);
            lblHighscore.setText("" + highscores[i]);
            getChildren().add(lblHighscore);
        }
        */
        
        getChildren().addAll(selectlevel);
        getChildren().addAll(btns);
        //getChildren().addAll(lblHighscore1, lblHighscore2, lblHighscore3, lblHighscore4);
    }
    
}
