/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv;

import java.util.TimerTask;
import project_maswiv.model.Game;

/**
 *
 * @author Wannes
 */
public class CoopaAnimator extends TimerTask {
    private Game game;

    public CoopaAnimator(Game game) {
        this.game = game;
    }
    
    @Override
    public void run(){
        game.coopaMovement();
    
        
        //Platform.runLater(game::update);

    }
    
}
