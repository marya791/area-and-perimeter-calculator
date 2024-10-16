/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectoop;

/**
 *
 * @author MARIAM
 */
public class rectangle extends shapes  {
    private double width;
    private double height;
     protected double area;
     protected double perimeter;
    private String color;
    private boolean filled;
        public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public rectangle() {
    }

    public rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

   
    

    @Override
    public double getArea(){
        return height*width;
       
    }
    @Override
    public double getPerimeter(){
        return(height+width)*2;
        
    }
    
}
