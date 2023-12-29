/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.level;

import project_maswiv.model.Element;
import project_maswiv.model.level.GrondBlokWoods;
import project_maswiv.model.Mario;
import java.io.File;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import project_maswiv.view.View;

/**
 *
 * @author Stef
 */
public class GrondBlokWoodsView extends View {
    
    public GrondBlokWoodsView(GrondBlokWoods gbw) {
        super(new Image(new File("src/main/resources/files/grondblokwoods.png").toURI().toString()), gbw);
    }
}
