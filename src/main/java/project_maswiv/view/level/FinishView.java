/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.level;

import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.model.Element;
import project_maswiv.model.level.Finish;
import project_maswiv.view.View;

/**
 *
 * @author Stef
 */
public class FinishView extends View{
    
    public FinishView(Finish fi) {
        super(new Image(new File("src/main/resources/files/finish.png").toURI().toString()), fi);
    }
    
}
