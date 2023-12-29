/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.view.elementen;

import java.io.File;
import javafx.scene.image.Image;
import project_maswiv.model.elementen.Skeleton;
import project_maswiv.view.View;

/**
 *
 * @author Wannes
 */
public class SkeletonView extends View{

    public SkeletonView(Skeleton sk) {
        super(new Image(new File("src/main/resources/files/skeleton_cropped.gif").toURI().toString()), sk);
    }
    
}
