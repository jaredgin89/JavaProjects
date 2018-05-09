/*
 *  Creator: Jared Gingerich
 *  Chapter: 8
 *  Program: Programming challenge 6 - CashRegister class Demo
 *  Date:    4/12/2018
*/     

import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;
      
/**
   This program simulates the sale of an item using the CashRegister class
   and the RetailItem class that was created in chapter 6. The program
   will ask for the quantity of items being purchased and will display
   the subtotal, tax, and total cost to the user.
*/

public class CashRegisterDemo
{
   public static void main(String[] args)
   {
      String desc;
      int units, unitsBuy;
      double price;
      
      Scanner in = new Scanner(System.in);
      
      //Collect all information from user about item.
      System.out.println("Enter a description of the item.");
      desc = in.nextLine();
      System.out.println("Enter the number of available units.");
      units = in.nextInt();
      System.out.println("Enter the price per unit.");
      price = in.nextDouble();
      
      //Create instance of RetailItem class passing the entered values
      //as arguments.
      RetailItem retailItem = new RetailItem(desc, units, price);
      System.out.println(retailItem);        //Display retailItem fields.
      
      //Store number of items desired.
      System.out.println("How many units would you like to buy?");
      unitsBuy = in.nextInt();
      
      //Find out if enough units are available.
      while(unitsBuy>retailItem.getUnits())
      {
         System.out.println("Only " + retailItem.getUnits() + " units are " +
                            "available. Enter a number less than or equal to this.");
         unitsBuy = in.nextInt();
      }
      
      //Create instance of CashRegister and display receipt to user.
      CashRegister cashReg = new CashRegister(retailItem, unitsBuy);
      System.out.println(retailItem.getUnits() + " " + retailItem.getDesc() +
                         ":" + cashReg);
   }
}