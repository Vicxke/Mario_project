/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;

import project_maswiv.model.Blok;
import project_maswiv.model.Coin;
import project_maswiv.model.Element;
import project_maswiv.model.Goomba;
import project_maswiv.model.Grafity;
import project_maswiv.model.GrondBlok;
import project_maswiv.model.Lava;
import project_maswiv.model.Mario;
import project_maswiv.model.YoshiEgg;
import java.io.File;
import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import project_maswiv.model.Finish;
import project_maswiv.model.MarioLuigi;
import project_maswiv.model.RoodGrondBlok;
import project_maswiv.model.Spikes;

/**
 *
 * @author Vicxke
 */
public class MainView extends Region{
    private Mario model;
    
    private MarioView mario;
    
    private ArrayList<View> views;
    //private ArrayList<GoombaView> enemys;
    
    //private ArrayList<GrondBlokView> grond;
    private ArrayList<ImageView> hartjes;
    
    private Label lblCoins;
    private ImageView coin;

    public MainView(Mario model) {
        this.model = model;
        mario = new MarioView(model);
        views = new ArrayList<>();
        //enemys = new ArrayList<>();
        
        //coins view
        lblCoins = new Label();
        lblCoins.setLayoutX(5);
        lblCoins.setLayoutY(10);
        lblCoins.setFont(new Font(24));
        lblCoins.setTextFill(Color.BLACK);
        
        coin = new  ImageView(new Image(new File("src/main/resources/files/coinS2T.png").toURI().toString()));
        coin.setLayoutX(20);
        coin.setLayoutY(12);
        coin.setFitHeight(30);
        coin.setFitWidth(40);
        
        hartjes = new ArrayList<>();
        
        
        //toevoegen aan mainview
        getChildren().add(mario);
        getChildren().add(lblCoins);
        getChildren().add(coin);
        //getChildren().addAll(hartjes);
        
    }
    
    public void addElementen(ArrayList<Element> elementen){
        for(Element el : elementen){
            if(el instanceof Blok){
                Blok bl = (Blok) el;
                views.add(new BlokView(bl));
            }else if(el instanceof GrondBlok){
                GrondBlok gbl = (GrondBlok) el;
                views.add(new GrondBlokView(gbl));
            }else if(el instanceof Goomba){
                Goomba en = (Goomba) el;
                views.add(new GoombaView(en));
            }else if(el instanceof Coin){
                Coin c = (Coin) el;
                views.add(new CoinView(c));
            }else if(el instanceof YoshiEgg){
                YoshiEgg ye = (YoshiEgg) el;
                views.add(new YoshiEggView(ye));
            }
            else if(el instanceof Lava){
                Lava la = (Lava) el;
                views.add(new LavaView(la));
            }
            else if(el instanceof MarioLuigi){
                MarioLuigi ml = (MarioLuigi) el;
                views.add(new MarioLuigiView(ml));
            }
            else if(el instanceof Spikes){
                Spikes sp = (Spikes) el;
                views.add(new SpikesView(sp));
            }
            else if(el instanceof Finish){
                Finish fi = (Finish) el;
                views.add(new FinishView(fi));
            }
            else if(el instanceof RoodGrondBlok){
                RoodGrondBlok ro = (RoodGrondBlok) el;
                views.add(new RoodGrondBlokView(ro));
            }
        }
        
        //getChildren().clear(); //clear childeren eerst
        getChildren().addAll(views);
        //getChildren().add(mario);
        //getChildren().add(lblCoins);
        //getChildren().add(coin);
    }
    
    public void resetView(){
        //getChildren().clear();
        views.clear();
    }
    
    public void update(){
        mario.update();
        
        for (View view : views){
            if(view.getElement() == null){
                views.remove(view);
            }else{
                view.updateView();
            }
        }
    }
    
    public void setCoinLabel(int coins){
        lblCoins.setText("" + coins);
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
    public void setDeadScreen(Button btnRestart, Button btnmainMenu) {
        ImageView dood = new ImageView(new Image(new File("src/main/resources/files/fatality.png").toURI().toString()));
        dood.setFitHeight(200);
        dood.setFitWidth(500);
        dood.setLayoutX(100);
        dood.setLayoutY(100);
        
        btnRestart.setPrefSize(180, 30);
        btnRestart.setLayoutX(100);
        btnRestart.setLayoutY(300);
        
        btnmainMenu.setPrefSize(180, 30);
        btnmainMenu.setLayoutX(420);
        btnmainMenu.setLayoutY(300);
        
        
        getChildren().addAll(dood, btnRestart, btnmainMenu);
    }
    
    public void setLevel0(ArrayList<Button> btns) {
        int i = 0;
        for(Button btn: btns){
            btn.setPrefSize(180, 30);
            btn.setLayoutX(260);
            btn.setLayoutY(30 + i*40);
            i++;
        }
        getChildren().addAll(btns);
        
    }
    
    
    
    
    //miss dak me nog bedenk van wa ik hier eerst gezegd had
    //+ in view klasse checks weghalen en gewoon element opvragen en daarvan de functie gebruiken
    
}
