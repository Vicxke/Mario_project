/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;

import project_maswiv.model.Element;
import java.io.File;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;

/**
 *
 * @author Vicxke
 */
public class View extends Region{

    private Element element;
    private ImageView afbeelding;
    
    public View(Image afbeelding, Element el) {
        element = el;
        this.afbeelding = new ImageView(afbeelding);
        getChildren().add(this.afbeelding);
        updateView();
    }
    
    public void updateView(){
        
        afbeelding.setFitHeight(element.getHeight());
        afbeelding.setFitWidth(element.getWidth());
        afbeelding.setX(element.getxPos());
        afbeelding.setY(element.getyPos());
    }
    
    public void setAfbeelding(Image afbeelding) {
        this.afbeelding.setImage(afbeelding);
        updateView();
    }

    public Element getElement() {
        return element;
    }
    
    

}
