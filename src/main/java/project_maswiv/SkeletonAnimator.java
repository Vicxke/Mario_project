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
public class SkeletonAnimator extends TimerTask {
    private Game game;

    public SkeletonAnimator(Game game) {
        this.game = game;
    }
    
    @Override
    public void run(){
        game.skeletonMovement();
    
        
        //Platform.runLater(game::update);

    }
    
}
