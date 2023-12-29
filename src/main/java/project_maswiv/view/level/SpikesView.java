/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.level;

import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.model.level.Spikes;
import project_maswiv.view.View;

/**
 *
 * @author Stef
 */
public class SpikesView extends View {
    
    public SpikesView(Spikes sp) {
        super(new Image(new File("src/main/resources/files/Spikes_cropped.png").toURI().toString()), sp);
    }

}
