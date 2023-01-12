package project_maswiv;

import java.io.File;
import project_maswiv.model.Game;
import project_maswiv.model.Goomba;
import project_maswiv.model.GrondBlok;
import project_maswiv.model.Mario;
import project_maswiv.view.GrondBlokView;
import project_maswiv.view.MainView;
import project_maswiv.view.MarioView;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.R;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import project_maswiv.levels.Level0;
import project_maswiv.levels.Level1;
import project_maswiv.levels.Level2;

public class PlaygroundFXMLController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    
    
    @FXML
    private AnchorPane speelveld;
    
    private Mario mario;
    private MainView view;
    
    private Game game;
    
    private int currentlevel;
    
    private Timer tmrMarioMovement;
    private MarioAnimator marioAnimo;
    private Timer tmrGoombaMovement;
    private GoombaAnimator goombaAnimo;
    
   
    @FXML
    void initialize() {
        currentlevel = 0;
        loadLevel(currentlevel);
    }
    
    
    
    public void loadLevel(int level){
        currentlevel = level;
        
        mario = new Mario(327, 300, 6);
        view = new MainView(mario);
        speelveld.getChildren().clear();
        
        speelveld.getChildren().addAll(view);
        view.setFocusTraversable(true);
        view.setOnKeyPressed(this::onKeyPress);
        view.setOnKeyReleased(this::onkeyRelease);
        
        if(level == 0){            
            game = new Level0(mario);
        }
        else if(level == 1){
            game = new Level1(mario);        
        }
        else if(level == 2){
            game = new Level2(mario);  
        }
        
        
        if(tmrGoombaMovement != null ||tmrMarioMovement != null){
            stopTimer(tmrMarioMovement, goombaAnimo);
            stopTimer(tmrMarioMovement, marioAnimo);
        }
          
        //timer voor bewegingen.
        marioAnimo = new MarioAnimator(game, this);
        tmrMarioMovement = new Timer(true);
        tmrMarioMovement.scheduleAtFixedRate(marioAnimo, 0, (long) mario.getSpeed());
        
        //Goomba timer beweging
        goombaAnimo = new GoombaAnimator(game);
        tmrGoombaMovement = new Timer(true);
        tmrGoombaMovement.scheduleAtFixedRate(goombaAnimo, 0, (long) 13);
        
        view.addElementen(game.getElementen());
        if(level == 0){
            ArrayList<Button> buttons = new ArrayList<>();
            for(int i = 1; i < 5; i++){
                Button btn = new Button("Level " + i);
                int value = i;
                btn.setOnMousePressed(Event -> loadLevel(value));
                buttons.add(btn);
            }
            
            ImageView selectlevel = new ImageView(new Image(new File("src/main/resources/files/selectlevel_cropped2.jpg").toURI().toString()));
                selectlevel.setFitHeight(200);
                selectlevel.setFitWidth(500);
                selectlevel.setLayoutX(100);
                selectlevel.setLayoutY(100);
            Button btn1 = new Button(new File("src/main/resources/files/level1T.png").toURI().toString());
                btn1.setOnMousePressed(Event -> resetLevel());
                selectlevel.setFitHeight(30);
                selectlevel.setFitWidth(30);
                btn1.setLayoutX(335);
                btn1.setLayoutY(330);
            buttons.add(btn1);
            
            view.setLevel0(buttons);
            
            
        }
    }
    
    
    public void onKeyPress(KeyEvent e){
        switch (e.getCode()) {
            case LEFT:
            case Q:
                if(!mario.isMovingLeft()) {
                    mario.setMoveRight(false);
                    mario.setImageChanged(true);
                }
                break;
            case RIGHT:
            case D:
                if(!mario.isMovingRight()) {
                    mario.setMoveRight(true);
                    mario.setImageChanged(true);
                }
                break;
            case SPACE:
            case Z:
            case UP:
                mario.jump();
                mario.setImageChanged(true);
                break;
            case ESCAPE:
                loadLevel(0);
        }
    }
    
    public void update(){
        
        //miss nog anders doen
        if(mario.isImageChanged()){
            restartMarioTimer();
        }
        
        view.update();
        view.setCoinLabel(game.getCoins());
        
        if (game.isGameOver()) {     
            Button btn1 = new Button("restart");
            btn1.setOnMousePressed(Event -> resetLevel());
            
            Button btn2 = new Button("menu");
            btn2.setOnMousePressed(Event -> loadLevel(0));
            
            view.setDeadScreen(btn1, btn2);


            stopTimer(tmrMarioMovement, marioAnimo);
            stopTimer(tmrGoombaMovement, goombaAnimo);
            
        }
        
        if(game.isUpdateHartjes()){
            view.setHearts(game.getLevens());
            game.setUpdateHartjes(false);
        }
        
    }
    
    public void nextLevel(){
        //max levels is 1 nu
        if(currentlevel++ < 1){
            currentlevel++;
        }
        loadLevel(currentlevel);
    }

    
    public void resetLevel(){
        loadLevel(currentlevel);
    }

    
    public void onkeyRelease(KeyEvent e){
        //checken zodat deze niet glitcht
        switch (e.getCode()) {
            case LEFT:
            case A:
                if(!mario.isMovingRight()) {
                    mario.dontMoveH();
                }
                break;
            case RIGHT:
            case D:
                if(!mario.isMovingLeft()) {
                    mario.dontMoveH();
                }
                break;
            case S:
                //game.setlevel1(false);
        }
    }
    
    private void restartMarioTimer(){
        
        stopTimer(tmrMarioMovement, marioAnimo);
        
        //timer voor bewegingen.
        marioAnimo = new MarioAnimator(game, this);
        tmrMarioMovement = new Timer(true);
        tmrMarioMovement.scheduleAtFixedRate(marioAnimo, 0, (long) mario.getSpeed());
    }
    
    private void stopTimer(Timer tmr, TimerTask task){
        tmr.cancel();
        tmr.purge();
        task.cancel();
        //System.out.println("timer stopped");
    }
    
}
