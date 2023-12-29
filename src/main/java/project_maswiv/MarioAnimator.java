/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv;

import project_maswiv.model.Game;
import project_maswiv.model.Mario;
import project_maswiv.view.MarioView;
import java.util.TimerTask;
import javafx.application.Platform;

/**
 *
 * @author viche
 */
public class MarioAnimator extends TimerTask {
    private PlaygroundFXMLController controller;
    private Game game;

    public MarioAnimator(Game game, PlaygroundFXMLController controller) {
        this.controller = controller;
        this.game = game;
    }
    
    @Override
    public void run(){
        game.checkIntersections();
        game.marioMovement();

        
        Platform.runLater(controller::update);

    }
    
}
