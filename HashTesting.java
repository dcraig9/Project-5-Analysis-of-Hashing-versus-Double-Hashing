/********************************************************************************************
* File: HashTesting.java
* CS103 Data Structures - Project # 5 Analysis of Hashing versus Double Hashing
*
* Authors: Donald Craig and Joe Eckstein
* Date: 05/08/2018
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
   
      File text = new File ("names.txt");
      
      if (text.exists()) {
         System.out.println("File exists already - we can read it");
      }else {
         text.createNewFile();   
      }

      Scanner read = new Scanner(text);
      
      Table SingleHash = new Table(capacity);
      
      while(read.hasNext())
      {
         firstName = read.Next();
         keyNumber = read.NextInt();
         
         //Next a couple things could be done
         // test for key in use SingleHash.containsKey(keyNumber) or
         // or use Put function, but I'm not sure how it works, why is there a return value of E? - Joe 5/8
         
         
         






   } //end main

} //end code