/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectoop;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class geometricobject extends JFrame {

   public geometricobject(){
       
       this.setTitle("area and perimeter calculater");
       this.setSize(500,500);
       this.setVisible(true);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this. setLayout(new FlowLayout(FlowLayout.LEFT));
   
    //////////////////////////////////////////////////////////////////
           JLabel shapeLabel=new JLabel("select a shape");
            JComboBox shapeComboBox=new JComboBox<>(new String []{"Rectangle","Square","Circle"});
       JLabel widthLabel=new JLabel("width:");
       JTextField widthTextField= new JTextField(20);
       JLabel heigthLabel=new JLabel("heigth:");
       JTextField heigthTextField =new JTextField(20);
       JLabel radiusLabel =new JLabel("radius");
       JTextField radiusTextField =new JTextField(20);
       JButton calculateButton=new JButton("Calculate");
       JLabel areaLabel=new JLabel();
       JLabel perimeterLabel=new JLabel();
       JLabel sideLabel=new JLabel("side:");
        JTextField sideTextField=new JTextField(20);
       shapeLabel.setFont(new Font("MV.Bol",Font.PLAIN,20));
       shapeComboBox.setFont(new Font("MV.Bol",Font.PLAIN,20));
        ////////////////////////////////////////////////////////////
        
            radiusLabel.hide();
            radiusTextField.hide();
            widthTextField .hide();
            heigthTextField.hide();
            widthLabel .hide();
            heigthLabel.hide();
            sideLabel.hide();
            sideTextField .hide();
            calculateButton.hide();
        ////////////////////////////////////////////////////////////////////
       shapeComboBox.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e){
           String selectedshape=(String)shapeComboBox.getSelectedItem();
           
           if(selectedshape .equals("Circle")){
           radiusLabel.setVisible(true);
            radiusTextField.setVisible(true);
           widthTextField .setVisible(false);
           heigthTextField.setVisible(false);
           widthLabel .setVisible(false);
           heigthLabel.setVisible(false);
          sideLabel.setVisible(false);
          sideTextField .setVisible(false);
           calculateButton.setVisible(true);
           }else if(selectedshape .equals("Rectangle")){
            radiusLabel.setVisible(false);
            radiusTextField.setVisible(false);
           widthTextField .setVisible(true);
           heigthTextField.setVisible(true);
           widthLabel .setVisible(true);
           heigthLabel.setVisible(true);
          sideLabel.setVisible(false);
          sideTextField .setVisible(false);
           calculateButton.setVisible(true);
           } else{
           
            radiusLabel.setVisible(false);
            radiusTextField.setVisible(false);
           widthTextField .setVisible(false);
           heigthTextField.setVisible(false);
           widthLabel .setVisible(false);
           heigthLabel.setVisible(false);
          sideLabel.setVisible(true);
          sideTextField .setVisible(true);
           calculateButton.setVisible(true);
           
           }
       }
         
       });
       //////////////////////////////////////////////
        calculateButton.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e){
      String selectedshape=(String)shapeComboBox.getSelectedItem();
           if( selectedshape.equals("Rectangle") ){
           double width=Double.parseDouble(widthTextField.getText());
           double heigth=Double.parseDouble(heigthTextField.getText());
           rectangle rec=new rectangle(width,heigth);
           areaLabel.setText("Area: "+rec.getArea());
           perimeterLabel.setText("perimeter: "+rec.getPerimeter());
            }
           else if( selectedshape.equals("Square") ){
            double side=Double.parseDouble(sideTextField.getText());
           square squ=new square(side);
           areaLabel.setText("Area: "+squ.getArea());
           perimeterLabel.setText("perimeter: "+squ.getPerimeter());
          
         }
           else {
               double radius=Double.parseDouble(radiusTextField.getText());
               circle cir=new circle(radius);
                areaLabel.setText("Area: "+cir.getArea());
           perimeterLabel.setText("Circumference: "+cir.getPerimeter());
           }
           
           

       } });
//////////////////////////////////////////adding to the frame
       add(shapeLabel);
       add(shapeComboBox);
       add(widthLabel);
       add(widthTextField);
        add(heigthLabel);
       add(heigthTextField);
       add(radiusLabel);
       add(radiusTextField);
        add( sideLabel);
       add(sideTextField);
       add(calculateButton);
       add(areaLabel);
        add(perimeterLabel);
    
   }

}
