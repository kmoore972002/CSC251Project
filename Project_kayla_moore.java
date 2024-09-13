import java.util.Scanner;
/*
Here is a demonstration of the policy class it is
an application that will keep track of insurance policies for Project 1.
*/
public class Project_kayla_moore //class name. 
{
public static void main(String[] args)//this is the main method. 
{

//here I create a scanner class for keyboard input. 
  Scanner keyboard = new Scanner(System.in);
     
  //decclarations.
  int pNumber, holderAge;
  double holderHeight, holderWeight;
  String providerName, firstName, lastName, smokeStatus;
  
  //here is an instantiation of the policy object.
  Policy instancePolicy = new Policy(); 
  
  //outputs.
  System.out.println("Please enter the Policy Number: ");
  pNumber = keyboard.nextInt(); 
  
  //fix error here.
   keyboard.nextLine();
  
  System.out.println("Please enter the Provider Name: ");
  providerName = keyboard.nextLine(); 
  System.out.println("Please enter the Policyholder's First Name: ");
  firstName = keyboard.nextLine(); 
  System.out.println("Please enter the Policyholder's Last Name:  ");
  lastName = keyboard.nextLine(); 
  System.out.println("Please enter the Policyholder's Age:");
  holderAge = keyboard.nextInt(); 
  
  //fix error here.
   keyboard.nextLine();
   
  System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
  smokeStatus = keyboard.nextLine(); 
  System.out.println("Please enter the Policyholder's Height (in inches):  ");
  holderHeight = keyboard.nextDouble(); 
  System.out.println("Please enter the Policyholder's Weight (in pounds): ");
  holderWeight = keyboard.nextDouble(); 
  
  //setter methods here. 
  instancePolicy.setPNumber(pNumber);
   instancePolicy.setHolderAge(holderAge);
   instancePolicy.setHolderHeight(holderHeight);
   instancePolicy.setHolderWeight(holderWeight);
   instancePolicy.setProviderName(providerName);
   instancePolicy.setFirstName(firstName);
   instancePolicy.setLastName(lastName);
   instancePolicy.setSmokeStatus(smokeStatus);
   
   //call method to display outputs.
   displayInfo(instancePolicy);
   
   }//end of the main method. 
   
   //method for outputs. 
 public static void displayInfo(Policy instancePolicy)
 {
 System.out.println("Policy Number: " + instancePolicy.getPNumber());
 System.out.println("Provider Name: " + instancePolicy.getProviderName());
 System.out.println("Policyholder's First Name: " + instancePolicy.getFirstName());
 System.out.println("Policyholder's Last Name: " + instancePolicy.getLastName());
 System.out.println("Policyholder's Age: " + instancePolicy.getHolderAge());
 System.out.println("Policyholder's Smoking Status: " + instancePolicy.getSmokeStatus());
 System.out.printf("Policyholder's Height: %.2f", instancePolicy.getHolderHeight());
 System.out.printf("\nPolicyholder's Weight: %.2f", instancePolicy.getHolderWeight());
 System.out.printf("\nPolicyholder's BMI: %.2f", instancePolicy.getBMI());
 System.out.printf("\nPolicy Price: $%.2f", instancePolicy.getPriceOfPolicy());
 }
  
  
}//end of the program.