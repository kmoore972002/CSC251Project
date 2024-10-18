import java.util.Scanner;
import java.util.ArrayList;
/*
Here is a demonstration of the policy class that has been modified it is
an application that will keep track of insurance policies for Project 2.
*/

//import java.io to allow File methods to be accessed.
import java.io.*;//this also for the print writer method and the file writer method.
import java.util.*;
import javax.swing.*;

//here I import the print writer class. 
import java.io.PrintWriter;

public class Project2_kayla_moore //class name. 
{
public static void main(String[] args)throws IOException//throwing an exception here.
//this is the main method. 
{

//here I create a scanner class for keyboard input. 
  Scanner keyboard = new Scanner(System.in);
     
 //decclarations.
  int pNumber , holderAge, eachNonSmoker = 0, eachSmoker = 0;
  double holderHeight, holderWeight;
  String providerName, firstName, lastName, smokeStatus;
  
  //create a connection between the file and the program. 
     File myFile = new File("PolicyInformation.txt");
     
     //first we need to make sure the file exists. 
     if(!myFile.exists())
     {
      System.out.println("This file does not exist.");
      System.exit(0); //end the program immediately. 
     }
     
   //create a scanner object for the file. 
     Scanner inputFile = new Scanner(myFile);//opening the file here. 
 
 //here I create an array list to store the Policy 2 objects. 
  ArrayList<Policy2> policyTwo = new ArrayList<Policy2>();
  
  //use a loop to process all of the contents of the file. 
     while(inputFile.hasNext())
     {
      try {
        pNumber = inputFile.nextInt(); // Read policy number
        inputFile.nextLine(); // Consume the newline character
        providerName = inputFile.nextLine(); // Read provider name
        firstName = inputFile.nextLine(); // Read first name
        lastName = inputFile.nextLine(); // Read last name
        holderAge = inputFile.nextInt(); // Read holder age
        inputFile.nextLine(); // Consume the newline character
        smokeStatus = inputFile.nextLine(); // Read smoke status
        holderHeight = inputFile.nextDouble(); // Read holder height
        holderWeight = inputFile.nextDouble(); // Read holder weight
        inputFile.nextLine(); // Consume the newline character

 //here I fix the error. 
    // if(inputFile.hasNext())
      // { 
       // inputFile.nextLine();
   //    inputFile.nextLine();
     //  }
         
 //here I create an instance of the policy class within the loop. 
  Policy2 instancePolicy2 = new Policy2(pNumber, holderAge, holderHeight, holderWeight, providerName, firstName, lastName, smokeStatus);
  
  //here I add all of the Policy2 object to an array list. 
  policyTwo.add(instancePolicy2); 
  
  // Count smokers and non-smokers
  if (smokeStatus.equalsIgnoreCase("smoker"))
    {
    eachSmoker++;
    }
  else if (smokeStatus.equalsIgnoreCase("non-smoker"))
    {
    eachNonSmoker++;
    }
    
      } 
      
      catch (InputMismatchException e) 
     {
      System.out.println("Input mismatch error: " + e.getMessage());
      inputFile.nextLine(); // Clear the invalid input
     }
    
    }//end of the loop to read all of the contents of the file. 
    
   inputFile.close();//close the file. 
   
   //here I use a for loop display all of the information. 
   for(int index =0; index < policyTwo.size(); index++)
     { 
   System.out.println( "Policy Number: " + policyTwo.get(index).getPNumber()); 
  System.out.println( "Provider Name: " + policyTwo.get(index).getProviderName()); 
  System.out.println("Policyholder's First Name: " + policyTwo.get(index).getFirstName()); 
  System.out.println("Policyholder's Last Name: " + policyTwo.get(index).getLastName());
  System.out.println("Policyholder's Age: " + policyTwo.get(index).getHolderAge());
  System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policyTwo.get(index).getSmokeStatus());
  System.out.println("Policyholder's Height: " + policyTwo.get(index).getHolderHeight());
  System.out.println("Policyholder's Weight: " + policyTwo.get(index).getHolderWeight());
   System.out.printf("Policyholder's BMI: %.2f \n", policyTwo.get(index).getBMI());
  System.out.printf("Policy Price: $%.2f ", policyTwo.get(index).getPriceOfPolicy());
System.out.println("\n");
 
 }//end of this loop. 
 
 //here I display the number of smokers and non smokers. 
 System.out.println("The number of policies with a smoker is: " + eachSmoker );
 System.out.println("The number of policies with a non-smoker is: " + eachNonSmoker);
  
  }//end of the main. 
}//end of the program.