/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;

import project_maswiv.model.Blok;
import project_maswiv.model.Element;
import project_maswiv.model.GrondBlok;
import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;

/**
 *
 * @author Stef
     */
public class BlokView extends View {

    public BlokView(Blok bl) {
        super(new Image(new File("src/main/resources/files/wandelblok.png").toURI().toString()), bl);
    }

}
