/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.elementen;

import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.model.elementen.Bowser;
import project_maswiv.view.View;

/**
 *
 * @author Wannes
 */
public class BowserView extends View{

    public BowserView(Bowser bo) {
        super(new Image(new File("src/main/resources/files/bowser_cropped.gif").toURI().toString()), bo);
    }
    
}

