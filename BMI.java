/*
  Chapter 3:     The Body Mass Index Calculator
  Programmer:    Brian Candido/Nick Fernandes Revison
  Date:          2/2/2023
  Filename:      BodyMass.java
  Purpose:       This project calculates the body mass index based
                 on  a person's height and weight.
*/

import javax.swing.*;

public class BMI {

   public static void main(String[] args) 
   {

     // declare and construct variables
     String sHeight, sWeight;
     int iInches =0, iPounds =0;
     double dKilograms =0.0, dMeters =0.0, dIndex =0.0;

     // print prompts and get input
    sHeight = JOptionPane.showInputDialog("Enter your height to the nearest inch: ");
    iInches = Integer.parseInt(sHeight);
    sWeight = JOptionPane.showInputDialog("Enter your weight to the nearest pound: ");
    iPounds = Integer.parseInt(sWeight);

     // Calculations
     dMeters = iInches / 39.36;
     dKilograms = iPounds / 2.2;
     dIndex = dKilograms / Math.pow(dMeters, 2);

     // Output
  JOptionPane.showMessageDialog(null, "YOUR BODY MASS INDEX IS: " +       Math.round(dIndex));



   } // end main method


} // end BodyMass class