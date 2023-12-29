/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.elementen;

import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.model.elementen.Coopa;
import project_maswiv.view.View;

/**
 *
 * @author Wannes
 */
public class CoopaView extends View{

    public CoopaView(Coopa en) {
        super(new Image(new File("src/main/resources/files/coopaT.gif").toURI().toString()), en);
    }
    
}
