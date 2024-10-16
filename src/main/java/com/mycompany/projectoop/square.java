/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectoop;

/**
 *
 * @author MARIAM
 */
public class square extends rectangle {
private double side;

    public square(double side) {
        super(side, side);
        
    }

    public square(double side,String color,boolean filled) {
        super(side,side,color,filled);
    }
    
    
    
}
