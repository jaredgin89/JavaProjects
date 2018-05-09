/*
 *  Creator: Jared Gingerich
 *  Chapter: 8
 *  Program: Programming challenge 6 - CashRegister class
 *  Date:    4/12/2018
*/     

import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;
import java.text.*;
      
/**
   This class simulates the sale of a retail item. RetailItem object
   will be passed to this class as an argument. It will also show the
   subtotal of the sale, the tax, and the total of the sale.
*/

public class CashRegister
{
   private int units;
   private RetailItem item;
   private final double tax = 0.06;
   
   /**
      Constructor sets the user entered item and units to
      each of the fields.
      @param item RetailItem object.
      @param units Number of units desired.
   */
   public CashRegister(RetailItem item, int units)
   {
      this.units = units;
      this.item = item;
   }
   
   /**
      getSub returns the subtotal of the purchase. This total
      does not include tax.
      @return Subtotal of purchase.
   */
   public double getSub()
   {
      return item.getPrice() * units;
   }
   
   /**
      getTax calculates the tax using the subtotal of the 
      purchase. The tax rate is a final int at 6%. 
      @return Tax owed on purchase.
   */
   public double getTax()
   {
      return getSub() * tax;
   }
   
   /**
      getTotal returns the total purchase which is made up
      of the subtotal plus the tax.
      @return Total due for purchase.
   */
   public double getTotal()
   {
      return getSub() + getTax();
   }
   
   /**
      toString returns a string of the subtotal, tax, and total.
      @return String describing the purchase.
   */
   public String toString()
   {
      DecimalFormat dollar = new DecimalFormat("#0.00");
      
      String str = "\nSubtotal: $" + dollar.format(getSub()) +
                   "\nTax:      $" + dollar.format(getTax()) +
                   "\nTotal:    $" + dollar.format(getTotal());
      return str;
   }
}