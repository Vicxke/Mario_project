/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.elementen;

import project_maswiv.model.elementen.Goomba;
import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.view.View;

/**
 *
 * @author Vicxke
 */
public class GoombaView extends View{

    public GoombaView(Goomba go) {
        super(new Image(new File("src/main/resources/files/champion.gif").toURI().toString()), go);
    }
    
}
