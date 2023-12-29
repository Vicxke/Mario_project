/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.level;

import project_maswiv.model.level.Blok;
import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.view.View;

/**
 *
 * @author Stef
     */
public class BlokView extends View {

    public BlokView(Blok b) {
        super(new Image(new File("src/main/resources/files/wandelblok.png").toURI().toString()), b);
    }

}
