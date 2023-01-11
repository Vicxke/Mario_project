/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;


import project_maswiv.model.Element;
import project_maswiv.model.GrondBlok;
import project_maswiv.model.Mario;
import project_maswiv.model.YoshiMario;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;

/**
 *
 * @author Vicxke
 */
public class YoshiMarioView extends View{

    private YoshiMario model;
    private boolean imageChanged;

    
    public YoshiMarioView(YoshiMario model) {
        super(new Image(new File("src/main/resources/files/yoshi_and_mario.gif").toURI().toString()), model);
        this.model = model;
        imageChanged = false;
    }

    

    public void changeLeft(){
        if(model.isGoingUp()){
            super.setAfbeelding(new Image(new File("src/main/resources/files/yoshi_and_mario.gif").toURI().toString()));
            
        }
        else if(model.isGoingDown()){
            super.setAfbeelding(new Image(new File("src/main/resources/files/yoshi_and_mario.gif").toURI().toString()));
        }
        else{
            super.setAfbeelding(new Image(new File("src/main/resources/files/yoshi_and_mario.gif").toURI().toString()));
        }
    }
    
    public void changeRight(){
        //nog veranderen want je moet hier geen info over het model ophalen.
        if(model.isGoingUp()){
            super.setAfbeelding(new Image(new File("src/main/resources/files/yoshi_and_mario.gif").toURI().toString()));
        }
        else if(model.isGoingDown()){
            super.setAfbeelding(new Image(new File("src/main/resources/files/yoshi_and_mario.gif").toURI().toString()));
        }
        else{
            super.setAfbeelding(new Image(new File("src/main/resources/files/yoshi_and_mario.gif").toURI().toString()));
        }
        
    }
    
    public void update(){
        if(imageChanged){
            if(model.isMovingLeft()){
                changeLeft();
            }else if(model.isMovingRight()){
                changeRight();
            }
        }
        
        imageChanged = false;
        super.updateView();
    }
    
    public void setImageUnchanged(){
        imageChanged = true;
    }
}
