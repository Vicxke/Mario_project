/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

import project_maswiv.model.Element;

/**
 *
 * @author Wannes
 */
public class MarioLuigi extends Element{
    
    public MarioLuigi(int xPos, int yPos) {
        super(xPos, yPos, 53, 55);
    }

    void reset() {
        xPos = 323;
        yPos = 308;
    }
}