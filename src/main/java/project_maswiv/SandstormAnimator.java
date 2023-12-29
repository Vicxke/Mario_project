/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv;
import java.util.Random;

import java.util.TimerTask;
import project_maswiv.levels.Level3;
import project_maswiv.model.Game;
import project_maswiv.view.MainView;

/**
 *
 * @author Wannes
 */
public class SandstormAnimator extends TimerTask {
    private Game game;
    private MainView view;
    private boolean sandstorm;

    public SandstormAnimator(Game game, MainView view) {
        this.game = game;
        this.view = view;
    }
    
    @Override
    public void run(){
        if(game instanceof Level3){
            Level3 lvl = (Level3) game;
            game.sandstormIncreaseTimer();
            if(sandstorm == true){
                Random rndgen = new Random(); 
                int tijd = rndgen.nextInt(3000) + 5000;
                if(game.getSandstormTimer() > tijd){
                //if(game.getSandstormTimer() > 5000){
                    lvl.setSandstorm(!lvl.isSandstormActive());//toggle
                    game.resetSandstormTimer();
                    view.setAchtergrondChange(true);
                    sandstorm = false;
                }
            }
            if(sandstorm == false){
                Random rndgen = new Random(); 
                int tijd = rndgen.nextInt(3000) + 10000;
                if(game.getSandstormTimer() > tijd){
                //if(game.getSandstormTimer() > 5000){
                    lvl.setSandstorm(!lvl.isSandstormActive());//toggle
                    game.resetSandstormTimer();
                    view.setAchtergrondChange(true);
                    sandstorm = true;
                }
            }
        }
        
    }
    
}