/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;

import project_maswiv.model.Element;
import project_maswiv.model.GrondBlok;
import project_maswiv.model.Mario;
import java.io.File;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;

/**
 *
 * @author Stef
 */
public class GrondBlokView extends View {
    
    public GrondBlokView(GrondBlok gbl) {
        super(new Image(new File("src/main/resources/files/grass.png").toURI().toString()), gbl);
    }
}
