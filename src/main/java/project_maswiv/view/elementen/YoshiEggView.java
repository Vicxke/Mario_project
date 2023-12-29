/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.elementen;

import project_maswiv.model.elementen.YoshiEgg;
import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.view.View;

/**
 *
 * @author Wannes
 */
public class YoshiEggView extends View{
    
    public YoshiEggView(YoshiEgg ye) {
        super(new Image(new File("src/main/resources/files/yoshi_egg.gif").toURI().toString()), ye);
    }
    
}