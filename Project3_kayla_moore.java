import java.util.Scanner;
import java.util.ArrayList;
/*
Here is a demonstration of the policy class that has been modified it is
an application that will keep track of insurance policies for Project 3.
*/

//import java.io to allow File methods to be accessed.
import java.io.*;//this also for the print writer method and the file writer method.
import java.util.*;
import javax.swing.*;

//here I import the print writer class. 
import java.io.PrintWriter;

public class Project3_kayla_moore //class name. 
{
public static void main(String[] args)throws IOException//throwing an exception here.
//this is the main method. 
{
//decclarations.
  int pNumber , holderAge, eachNonSmoker = 0, eachSmoker = 0, policyCount;
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
  ArrayList<Policy3> policyThree = new ArrayList<Policy3>();
  
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
        
  //now I create a policy holder object gathering all of the info from a file. 
 PolicyHolder holdPolicy = new PolicyHolder(holderAge, lastName, firstName, holderHeight, holderWeight, smokeStatus);
 
  //next, I create the Policy3 object passing all of info and the policy holder object into it as well.
  Policy3 instancePolicy3 = new Policy3(pNumber, providerName, holdPolicy);
  
   //here I add all info of the Policy3 object to an array list. 
  policyThree.add(instancePolicy3); 
  
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
  
  //here is a for loop that displays each policy holder's info.  
    for(int index = 0; index < policyThree.size(); index++)
      {
         System.out.println(policyThree.get(index));//here I implicity call the toString method within the Policy3 Class.
         System.out.println();//print a blank line between Courses for easier readability
      }//end of this loop.
      
    //here I display how many policies there are. 
   System.out.printf("There were %d Policy objects created. \n", Policy3.getPolicyCount()); 
      
     //here I display the number of smokers and non smokers. 
 System.out.println("The number of policies with a smoker is: " + eachSmoker );
 System.out.println("The number of policies with a non-smoker is: " + eachNonSmoker);
  
 }//end of main. 
}//end of program.