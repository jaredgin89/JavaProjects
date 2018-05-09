/*
 *  Creator: Jared Gingerich
 *  Chapter: 8
 *  Program: Programming challenge 6 - CashRegister Class - Retail item.
 *  Date:    4/12/2018
*/     

import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;
import java.text.*;
      
/**
   This class was created in chapter 6 for programming challenge 4. This 
   class will now be used for PC 6 - CashRegister class. An instance
   of this class will be passed to the CashRegister class as an 
   argument.
*/

public class RetailItem
{
   
   private String desc;
   private int units;
   private double price;
   
   /**
      Contructor sets all fields to zero and empty strings.
   */
   public RetailItem()
   {
      desc = " ";
      units = 0;
      price = 0;
   }
   
   /**
      This constructor accepts the three fields as arguments.
      @param desc Description of the item.
      @param units Number of units bought.
      @param price Price per unit.
   */
   public RetailItem(String desc, int units, double price)
   {
      this.desc = desc;
      this.units = units;
      this.price = price;
   }
   
   /**
      Sets the description of the item.
      @param desc Description of the item.
   */
   public void setDesc(String desc)
   {
      this.desc = desc;
   }
   
   /**
      Sets the number of units available for sale.
      @param units Number of units available.
   */
   public void setUnits(int units)
   {
      this.units = units;
   }
   
   /**
      Sets the price of the item.
      @param price Price of the item.
   */
   public void setPrice(double price)
   {
      this.price = price;
   }
   
   /**
      Gets the description of the item.
      @return Description of the item.
   */
   public String getDesc()
   {
      return desc;
   }
   
   /**
      Gets the units available.
      @return Number of units available.
   */
   public int getUnits()
   {  
      return units;
   }
   
   /**
      Gets the price of each unit.
      @return Price of the item.
   */
   public double getPrice()
   {
      return price;
   }
   
   /**
      toString returns a string to the user showing all of
      the fields of the retailItem class.
      @return String showing retailItem object fields.
   */
   public String toString()
   {
      DecimalFormat dollar = new DecimalFormat("#0.00");
      
      String str = "\nDescription:      " + getDesc() +
                   "\nUnits available:  " + getUnits() +
                   "\nPrice per unit:  $" + dollar.format(getPrice());
      return str;
   }
}