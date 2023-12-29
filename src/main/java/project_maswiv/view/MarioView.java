/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;


import project_maswiv.model.Element;
import project_maswiv.model.Game;
import project_maswiv.model.level.GrondBlokWoods;
import project_maswiv.model.Mario;
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
public class MarioView extends View{

    private Mario model;

    
    public MarioView(Mario model) {
        super(new Image(new File("src/main/resources/files/runningmarioright_cropped.gif").toURI().toString()), model);
        this.model = model;
    }

    

    public void changeLeft(){
        if(model.getyoshiegg()){  // hoe te fuck kun je dit fiksen of toch 
            changeYoshiLeft();
        }
        else{
            int value = model.getyPos() + model.getHeight();
            model.setyPos(value - 50);
            model.setWidth(40);
            model.setHeight(50);
            if(model.isGoingUp()){
                super.setAfbeelding(new Image(new File("src/main/resources/files/flyingmarioleft_cropped.gif").toURI().toString()));

            }
            else if(model.isGoingDown()){
                super.setAfbeelding(new Image(new File("src/main/resources/files/flyingmarioleft_cropped.gif").toURI().toString()));
            }
            else{
                super.setAfbeelding(new Image(new File("src/main/resources/files/runningmarioleft_cropped.gif").toURI().toString()));
            }
        }
    }
    
    public void changeRight(){
        if(model.getyoshiegg()){ // hoe te fuck kun je dit fiksen of toch laten werken;
            changeYoshiRight();
        }
        else{
            int value = model.getyPos() + model.getHeight();
            model.setyPos(value - 50);
            model.setWidth(40);
            model.setHeight(50);
            if(model.isGoingUp()){
                super.setAfbeelding(new Image(new File("src/main/resources/files/flyingmarioright_cropped.gif").toURI().toString()));
            }
            else if(model.isGoingDown()){
                super.setAfbeelding(new Image(new File("src/main/resources/files/flyingmarioright_cropped.gif").toURI().toString()));
            }
            else{
                super.setAfbeelding(new Image(new File("src/main/resources/files/runningmarioright_cropped.gif").toURI().toString()));
            }
        }
    }
    
    
    public void changeYoshiLeft(){
        int value = model.getyPos() + model.getHeight();
        model.setyPos(value - 55);
        model.setWidth(45);
        model.setHeight(55);
        super.setAfbeelding(new Image(new File("src/main/resources/files/yoshi_and_mario_cropped_left.gif").toURI().toString()));
    }
    public void changeYoshiRight(){
        int value = model.getyPos() + model.getHeight();
        model.setyPos(value - 55);
        model.setWidth(45);
        model.setHeight(55);
        super.setAfbeelding(new Image(new File("src/main/resources/files/yoshi_and_mario_cropped_right.gif").toURI().toString()));
    }
    
    
    public void update(){
        if(model.isImageChanged()){
            if(model.isMovingLeft() || model.wasMovingLeft()){
                changeLeft();
            }else if(model.isMovingRight() || model.wasMovingRight()){
                changeRight();
            }
            model.setImageChanged(false);
        }

        super.updateView();
    }
}
