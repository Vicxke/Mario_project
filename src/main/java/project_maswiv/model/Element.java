/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_maswiv.model;

import enummekes.BeweegToestandV;

/**
 *
 * @author Stef
 */
public class Element {
    int xPos, yPos, width, height;
    boolean grafity;
    private BeweegToestandV bewegingV;

    public Element(int xPos, int yPos, int width, int height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        
    }
    
    
    public boolean intersectWithBottom(Element e){
        if(e.yPos + e.height >= this.yPos && e.yPos + e.height <= this.yPos + this.height){
            for(int i = e.xPos; i < e.xPos + e.width; i++){
                if(i > xPos && i < xPos + width){ // geen = anders kon je wall hacken.
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean intersectWithTop(Element e){
        if(e.yPos >= this.yPos && e.yPos <= this.yPos + this.height){
            for(int i = e.xPos; i < e.xPos + e.width; i++){
                if(i > xPos && i < xPos + width){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public boolean intersectWithRight(Element e){
        if(e.xPos + e.width >= this.xPos && e.xPos + e.width <= this.xPos + this.width){
            for(int i = e.yPos; i < e.yPos + e.height; i++){
                if(i > yPos &&  i < yPos + height){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean intersectWithLeft(Element e){
        if(e.xPos >= this.xPos && e.xPos <= this.xPos + this.width){
            for(int i = e.yPos; i < e.yPos + e.height; i++){
                if(i > yPos &&  i < yPos + height){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean intersect(Element e){
        if(intersectWithLeft(e) || intersectWithRight(e) || intersectWithTop(e) || intersectWithBottom(e)) {
            return true;
        }else return false;
    }
    
    
    //getters
    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    

}
