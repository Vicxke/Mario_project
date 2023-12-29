/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model.elementen;

import enummekes.BeweegToestandH;
import project_maswiv.model.HorizontaleBeweging;

/**
 *
 * @author Vicxke
 */
public class Goomba extends HorizontaleBeweging{
    
    public Goomba(int xPos, int yPos) {
        super(xPos, yPos, 28, 28);
        setMoveRight(true);
    }
    
}
