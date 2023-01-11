/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;

import project_maswiv.model.Lava;
import java.io.File;
import javafx.scene.image.Image;

/**
 *
 * @author Wannes
 */
public class LavaView extends View {
    
    public LavaView(Lava la) {
        super(new Image(new File("src/main/resources/files/lavaT_cropped1.gif").toURI().toString()), la);
    }

}
