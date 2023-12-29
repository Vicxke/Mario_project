/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model.elementen;

import project_maswiv.model.Grafity;
/**
 *
 * @author Wannes
 */
public class Fireball extends Grafity{
    
    public Fireball(int xPos, int yPos) {
        super(xPos, yPos, 10, 10);
        setMoveDown();
    }
    
}