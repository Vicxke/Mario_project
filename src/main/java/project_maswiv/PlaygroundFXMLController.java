package project_maswiv;

import java.io.File;
import project_maswiv.model.Game;
import project_maswiv.model.elementen.Goomba;
import project_maswiv.model.level.GrondBlokWoods;
import project_maswiv.model.Mario;
import project_maswiv.view.level.GrondBlokWoodsView;
import project_maswiv.view.MainView;
import project_maswiv.view.MarioView;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
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
import project_maswiv.levels.Level3;
import project_maswiv.levels.Level4;

public class PlaygroundFXMLController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    
    
    @FXML
    private AnchorPane speelveld;
    
    private MainView view;
    
     private int[] highscores;
    
    private int highscore1;
    private int highscore2;
    private int highscore3;
    private int highscore4;
    
    private Game game;
    
    private int currentlevel;
    
    private Timer tmrMarioMovement;
    private MarioAnimator marioAnimo;
    private Timer tmrCoopaMovement;
    private CoopaAnimator coopaAnimo;
    private Timer tmrGoombaMovement;
    private GoombaAnimator goombaAnimo;
    private Timer tmrSkeletonMovement;
    private SkeletonAnimator skeletonAnimo;
    private Timer tmrFireballMovement;
    private FireballAnimator fireballAnimo;
    private Timer tmrTimer;
    private TellerCounter tellerTimer;
    private Timer tmrSandstorm;
    private SandstormAnimator sandstormAnimo;
    
    private boolean sandstorm;
   
    @FXML
    void initialize() {
        currentlevel = 0;
        highscores = new int[5];
        highscores[0] = 0;
        highscores[1] = 0;
        highscores[2] = 0;
        highscores[3] = 0;
        highscores[4] = 0;
        loadLevel(currentlevel);
    }
    
    
    
    public void loadLevel(int level){
        currentlevel = level;
        speelveld.getChildren().clear();
        sandstorm = false;  
        
        ImageView afbeelding = null;
        if(level == 0){
            afbeelding = new  ImageView(new Image(new File("src/main/resources/files/backgroundLevel0.jpg").toURI().toString()));            
            game = new Level0();
        }else if(level == 1){
            afbeelding = new  ImageView(new Image(new File("src/main/resources/files/backgroundLevel1.jpg").toURI().toString()));
            game = new Level1();        
        }else if(level == 2){
            afbeelding = new  ImageView(new Image(new File("src/main/resources/files/backgroundLevel2.jpg").toURI().toString()));
            game = new Level2();
        }else if(level == 3){
            afbeelding = new  ImageView(new Image(new File("src/main/resources/files/backgroundLevel3.jpg").toURI().toString()));
            game = new Level3();
        }else if(level == 4){
            afbeelding = new  ImageView(new Image(new File("src/main/resources/files/backgroundLevel4.jpg").toURI().toString()));
            game = new Level4();
        }
        if(afbeelding != null){
            afbeelding.setFitWidth(speelveld.getWidth());
            afbeelding.setFitHeight(speelveld.getHeight());
            //speelveld.getChildren().add(afbeelding);
        }
        
        if(tmrCoopaMovement != null ||tmrGoombaMovement != null ||tmrSkeletonMovement != null ||tmrMarioMovement != null){
            stopTimer(tmrMarioMovement, coopaAnimo);
            stopTimer(tmrMarioMovement, goombaAnimo);
            stopTimer(tmrSkeletonMovement, skeletonAnimo);
            stopTimer(tmrMarioMovement, marioAnimo);
        }else if(tmrFireballMovement != null){
            stopTimer(tmrFireballMovement, fireballAnimo);
        }
        
        
        view = new MainView(game, afbeelding);
        view.addElementen(game.getElementen());
        
        speelveld.getChildren().addAll(view);
        view.setFocusTraversable(true);
        view.setOnKeyPressed(this::onKeyPress);
        view.setOnKeyReleased(this::onkeyRelease);
        

        //timer voor bewegingen.
        marioAnimo = new MarioAnimator(game, this);
        tmrMarioMovement = new Timer(true);
        tmrMarioMovement.scheduleAtFixedRate(marioAnimo, 0, (long) game.getMario().getSpeed());
        
        //enemy timer beweging
        coopaAnimo = new CoopaAnimator(game);
        tmrCoopaMovement = new Timer(true);
        tmrCoopaMovement.scheduleAtFixedRate(coopaAnimo, 0, (long) 10); 
        goombaAnimo = new GoombaAnimator(game);
        tmrGoombaMovement = new Timer(true);
        tmrGoombaMovement.scheduleAtFixedRate(goombaAnimo, 0, (long) 13); 
        skeletonAnimo = new SkeletonAnimator(game);
        tmrSkeletonMovement = new Timer(true);
        tmrSkeletonMovement.scheduleAtFixedRate(skeletonAnimo, 0, (long) 15); 
        
        if(level == 4){
            fireballAnimo = new FireballAnimator(game);
            tmrFireballMovement = new Timer(true);
            tmrFireballMovement.scheduleAtFixedRate(fireballAnimo, 0, (long) 10);
        }
        if(level == 3){
            sandstormAnimo = new SandstormAnimator(game,view);
            tmrSandstorm = new Timer(true);
            tmrSandstorm.scheduleAtFixedRate(sandstormAnimo, 0, (long) 1);
        }
        
        //timer tijd
        tellerTimer = new TellerCounter(game);
        tmrTimer = new Timer(true);
        tmrTimer.scheduleAtFixedRate(tellerTimer, 0, (long) 500);
        
        
        if(level == 0){
            ArrayList<ImageView> buttons = new ArrayList<>();
            for(int i = 1; i < 6; i++){
                ImageView btn = new ImageView(new Image(new File("src/main/resources/files/level"+ i +"T.png").toURI().toString()));
                int value = i;
                btn.setOnMousePressed(Event -> loadLevel(value));
                buttons.add(btn);
            }
            view.setLevel0(buttons, /*highscores*/ highscore1, highscore2, highscore3, highscore4 /*, highscores*/);
            
        }
    }
    
    
    public void onKeyPress(KeyEvent e){
        switch (e.getCode()) {
            case LEFT:
            case Q:
                if(!game.getMario().isMovingLeft()) {
                    game.getMario().setMoveRight(false);
                    game.getMario().setImageChanged(true);
                }
                break;
            case RIGHT:
            case D:
                if(!game.getMario().isMovingRight()) {
                    game.getMario().setMoveRight(true);
                    game.getMario().setImageChanged(true);
                }
                break;
            case SPACE:
            case Z:
            case UP:
                game.getMario().jump();
                game.getMario().setImageChanged(true);
                break;
            case ESCAPE:
                if(currentlevel != 0){
                    deadScreen();
                }
                
        }
    }
    
    public void deadScreen(){
        ImageView btn1 = new ImageView(new Image(new File("src/main/resources/files/play2.jpg").toURI().toString()));
        btn1.setOnMousePressed(Event -> resetLevel());
        ImageView btn2 = new ImageView(new Image(new File("src/main/resources/files/menu2.jpg").toURI().toString()));
        btn2.setOnMousePressed(Event -> loadLevel(0));

        view.setDeadScreen(btn1, btn2);

        stopTimer(tmrMarioMovement, marioAnimo);
        stopTimer(tmrCoopaMovement, coopaAnimo);
        stopTimer(tmrGoombaMovement, goombaAnimo);
        stopTimer(tmrSkeletonMovement, skeletonAnimo);
        if(tmrFireballMovement != null){
            stopTimer(tmrFireballMovement, fireballAnimo);
        }
    }
    
    public void update(){
        
        //miss nog anders doen
        if(game.getMario().isImageChanged()){
            restartMarioTimer();
        }
        
        view.update();

        if (game.isGameOver() && !game.isFinish()) {     
            deadScreen();
        }
        
        if(game.isFinish()){
            ImageView btn1 = new ImageView(new Image(new File("src/main/resources/files/play2.jpg").toURI().toString()));
            btn1.setOnMousePressed(Event -> nextLevel());
            ImageView btn2 = new ImageView(new Image(new File("src/main/resources/files/menu2.jpg").toURI().toString()));
            btn2.setOnMousePressed(Event -> loadLevel(0));
            
            view.setFinishScreen(btn1, btn2);

            stopTimer(tmrMarioMovement, marioAnimo);
            stopTimer(tmrCoopaMovement, coopaAnimo);
            stopTimer(tmrGoombaMovement, goombaAnimo);
            stopTimer(tmrSkeletonMovement, skeletonAnimo);
            if(tmrFireballMovement != null){
                stopTimer(tmrFireballMovement, fireballAnimo);
            }
            if(currentlevel!=0){
                /*if(highscore[currentlevel-1]<game.getTimer()){
                    highscore[currentlevel-1] = game.getTimer();
                    System.out.println(highscore[0]);
                    System.out.println("blq");
                    
                }*/
                if(highscores[currentlevel] < game.getTimer()){
                    highscores[currentlevel] = game.getTimer();
                }
                /*
                if(currentlevel == 1 && highscore1<game.getTimer()){
                    highscore1 = game.getTimer();
                }
                if(currentlevel == 2 && highscore2<game.getTimer()){
                    highscore2 = game.getTimer();
                }
                if(currentlevel == 3 && highscore3<game.getTimer()){
                    highscore3 = game.getTimer();
                }
                if(currentlevel == 4 && highscore4<game.getTimer()){
                    highscore4 = game.getTimer();
                }
                else{}
               */
            }
        }
        
    }
    
    public void nextLevel(){
        //max levels is 2 nu
        if(currentlevel == 4){
            currentlevel = 0;
        }
        else{
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
                if(!game.getMario().isMovingRight()) {
                    game.getMario().dontMoveH();
                }
                break;
            case RIGHT:
            case D:
                if(!game.getMario().isMovingLeft()) {
                    game.getMario().dontMoveH();
                }
                break;
        }
    }
    
    private void restartMarioTimer(){
        stopTimer(tmrMarioMovement, marioAnimo);
        
        //timer voor bewegingen.
        marioAnimo = new MarioAnimator(game, this);
        tmrMarioMovement = new Timer(true);
        tmrMarioMovement.scheduleAtFixedRate(marioAnimo, 0, (long) game.getMario().getSpeed());
    }
    
    private void stopTimer(Timer tmr, TimerTask task){
        tmr.cancel();
        tmr.purge();
        task.cancel();
    }
   
    
}
