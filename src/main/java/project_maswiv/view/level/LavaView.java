/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.level;

import project_maswiv.model.level.Lava;
import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.view.View;

/**
 *
 * @author Wannes
 */
public class LavaView extends View {
    
    public LavaView(Lava la) {
        super(new Image(new File("src/main/resources/files/lavaT_cropped2.gif").toURI().toString()), la);
    }

}
