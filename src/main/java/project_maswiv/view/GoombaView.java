/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;

import project_maswiv.model.Element;
import project_maswiv.model.Goomba;
import project_maswiv.model.GrondBlok;
import java.io.File;
import javafx.scene.image.Image;

/**
 *
 * @author Vicxke
 */
class GoombaView extends View{

    public GoombaView(Goomba en) {
        super(new Image(new File("src/main/resources/files/champion.gif").toURI().toString()), en);
    }
    
}
