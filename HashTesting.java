/********************************************************************************************
* File: HashTesting.java
* CS103 Data Structures - Project # 5 Analysis of Hashing versus Double Hashing
*
* Authors: Donald Craig and Joe Eckstein
* Date: 05/12/2018
*
********************************************************************************************/


import java.util.*;
import java.io.*;

class HashTesting { 

   public static void main(String [] args) throws IOException 
   {
      int capacity = 241;
      String firstName;
      int keyNumber;  
      Table<Integer, String> hashTable = new Table<Integer, String>(capacity); 
		TableDoubleHash<Integer, String> doubleHashTable = new TableDoubleHash<Integer, String>(capacity);

      File text = new File ("names.txt");

      if (text.exists()) 
      {
         System.out.println("Input file exists. Reading...");
         System.out.println();
      }
      else 
      {
         text.createNewFile();   
      }

      Scanner read = new Scanner(text);

      while(read.hasNext())
      {
         firstName = read.next();
         keyNumber = read.nextInt();  
         hashTable.put(keyNumber, firstName);
			doubleHashTable.put(keyNumber, firstName);
         
      }//end while
         
      System.out.println("Total collisions for Single Hash table: " + hashTable.getCollisions() );
      System.out.println("With a file of 200 inputs, that equals");
      System.out.println("an average of " + ((double)(hashTable.getCollisions()) /200) + " collisions per attempt.");
      System.out.println();
      System.out.println("Total collisions for Double Hash table: " + doubleHashTable.getCollisions() );
      System.out.println("With a file of 200 inputs, that equals");
      System.out.println("an average of " + ((double)(doubleHashTable.getCollisions()) /200) + " collisions per attempt.");   



   } //end main



} //end code