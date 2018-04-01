//    Name: Jared Gingerich
//    Date: 3/31/2018
//    Chapter: 7
//    Program: Grader class demo
//
////////////////////////////////////////////////////////////////

import javax.swing.JOptionPane;    
import java.text.DecimalFormat;     
import java.util.Scanner;          
import java.io.*;                   
import java.util.Random;            

/**
   This program uses the Grader class to calculate the average test
   score after dropping the lowest grade.
*/

public class GraderDemo
{
   public static void main(String[]args)
   {
      String temp;
      double[] scores;
      int tests;
      
      
      //User enters number of tests to input
      temp = JOptionPane.showInputDialog("How many tests would you like to enter?");
      tests = Integer.parseInt(temp);
      scores = new double[tests];
      
      
      //Fill the scores array with entered test scores
      for(int i=0; i<tests; i++)
      {
         temp = JOptionPane.showInputDialog("Enter score #" + (i+1));
         scores[i] = Double.parseDouble(temp);
      }
      
       
      //Create Grader class with scores argument
      Grader grade = new Grader(scores);
      
      //Display the lowest test score and the average after dropping lowest score
      JOptionPane.showMessageDialog(null,"The lowest grade was " + grade.getLowest() + "%." +
                                    "\nYour average after dropping the lowest score was " +
                                    grade.getAverage() + "%.");
      
      
      
      
   }
}