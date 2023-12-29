/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.level;

import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.model.level.BlokLava;
import project_maswiv.view.View;

/**
 *
 * @author Wannes
 */
public class BlokLavaView extends View {

    public BlokLavaView(BlokLava bl) {
        super(new Image(new File("src/main/resources/files/bloklava.jpg").toURI().toString()), bl);
    }

}
