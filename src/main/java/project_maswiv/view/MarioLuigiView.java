/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view;

import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.model.MarioLuigi;

/**
 *
 * @author Wannes
 */
public class MarioLuigiView extends View{
    
    public MarioLuigiView(MarioLuigi ml) {
        super(new Image(new File("src/main/resources/files/marioluigi_cropped.gif").toURI().toString()), ml);
    }
    
}