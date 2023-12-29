/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model.elementen;

import enummekes.BeweegToestandH;
import project_maswiv.model.HorizontaleBeweging;

/**
 *
 * @author Wannes
 */
public class Skeleton extends HorizontaleBeweging{

    public Skeleton(int xPos, int yPos) {
        super(xPos, yPos, 22, 28);
        setMoveRight(true);
    }
}
