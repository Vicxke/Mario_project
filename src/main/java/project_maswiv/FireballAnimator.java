/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv;

import java.util.TimerTask;
import project_maswiv.levels.Level4;
import project_maswiv.model.Game;

/**
 *
 * @author Wannes
 */
public class FireballAnimator extends TimerTask {
    private Game game;

    public FireballAnimator(Game game) {
        this.game = game;
    }
    
    @Override
    public void run(){
        game.fireballMovement();
        if(game.getFireballTimer() > 500){
            if(game instanceof Level4){
                Level4 lvl = (Level4) game;
                System.out.println("spawned");
                lvl.spawnFireball();
            }
        }
    }
    
}
