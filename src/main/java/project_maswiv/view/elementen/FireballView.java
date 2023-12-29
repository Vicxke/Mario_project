/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.elementen;

import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.model.elementen.Fireball;
import project_maswiv.view.View;

/**
 *
 * @author Wannes
 */
public class FireballView extends View{

    public FireballView(Fireball fb) {
        super(new Image(new File("src/main/resources/files/fireball.gif").toURI().toString()), fb);
    }
    
}
