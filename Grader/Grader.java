//    Name: Jared Gingerich
//    Date: 3/31/2018
//    Chapter: 7
//    Program: Grader class
//
////////////////////////////////////////////////////////////////

import javax.swing.JOptionPane;    
import java.text.DecimalFormat;     
import java.util.Scanner;          
import java.io.*;                   
import java.util.Random;            

/**
   The grader class calculates the average score in a series of 
   tests with the lowest score dropped.
*/

public class Grader
{
   private double[] testScores;
   
   /**
      Grader constructor accepts the scores in an array and
      saves them to the testScores array
      @param scoreArray Test scores stored in an array
   */
   public Grader(double[] scoreArray)
   {
      testScores = scoreArray;
   }
   
   /**
      getLowest method finds the lowest test score in the array
      @return low Lowest score
   */
   public double getLowest()
   {
      double low = testScores[0];
      
      for(int i=0; i<testScores.length; i++)
      {
         if(testScores[i]<low)
            low = testScores[i];
      }
      return low;
   }
   
   /**
      getAverage finds the average test score. This method calls the
      getLowest method to allow the lowest score to be excluded from
      the total.
      @return average Average test score after dropping lowest grade
   */
   public double getAverage()
   {
      double total = 0, 
             average;
             
      for(int i=0; i<testScores.length; i++)
      {
         total += testScores[i];
      }
      average = (total-getLowest())/(testScores.length-1);
      return average;
   }
}