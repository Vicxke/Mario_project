/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv;

import project_maswiv.model.Game;
import java.util.TimerTask;

/**
 *
 * @author Stef
 */
public class GoombaAnimator extends TimerTask {
    private Game game;

    public GoombaAnimator(Game game) {
        this.game = game;
    }
    
    @Override
    public void run(){
        game.goombaMovement();
    
        
        //Platform.runLater(game::update);

    }
    
}
