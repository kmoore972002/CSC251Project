/*
This is a class for project part 1. 
*/
public class Policy
{
// declaring fields. 
private int pNumber, holderAge;
private double holderHeight, holderWeight;
private String providerName, firstName, lastName, smokeStatus;

//no-arg constructor here. 
 public Policy()
 {
  pNumber = 0;
  holderAge = 0;
  holderHeight = 0.00;
  holderWeight = 0.00;
  providerName = "";
  firstName = "";
  lastName = "";
  smokeStatus = "";
 }
 
 //constructor that accepts arguments. 
public Policy (int conPNumber, int conHolderAge, double conHolderHeight, double
conHolderWeight, String conPName, String conFName, String conLName, String conStatus)
{
pNumber = conPNumber;
holderAge = conHolderAge;
holderHeight = conHolderHeight;
holderWeight = conHolderWeight;
providerName = conPName;
firstName = conFName;
lastName = conLName;
smokeStatus = conStatus;

}

//here are the getter and setter methods.

//policy number here. 
 public void setPNumber(int mutatePNumber)
{
  pNumber = mutatePNumber;
}

public int getPNumber()
{
 return pNumber;
}

//holder's age here. 
 public void setHolderAge(int mutateHolderAge)
{
  holderAge = mutateHolderAge;
}

public int getHolderAge()
{
 return holderAge;
}

//holder's height here. 
 public void setHolderHeight(double mutateHolderHeight)
{
  holderHeight = mutateHolderHeight;
}

public double getHolderHeight()
{
 return holderHeight;
}

//holder's weight here. 
 public void setHolderWeight(double mutateHolderWeight)
{
  holderWeight = mutateHolderWeight;
}

public double getHolderWeight()
{
 return holderWeight;
}

//provider's name here. 
 public void setProviderName(String mutateProviderName)
{
  providerName = mutateProviderName;
}

public String getProviderName()
{
 return providerName;
}

//holder's first name here.
 public void setFirstName(String mutateFirstName)
{
  firstName = mutateFirstName;
}

public String getFirstName()
{
 return firstName;
}

//holder's last name here. 
 public void setLastName(String mutateLastName)
{
  lastName = mutateLastName;
}

public String getLastName()
{
 return lastName;
}

//holder's smoke status here. 
 public void setSmokeStatus(String mutateSmokeStatus)
{
  smokeStatus = mutateSmokeStatus;
}

public String getSmokeStatus()
{
 return smokeStatus;
}

//method that calculates the BMI of the policy holder here. 
public double getBMI()
{
 return ( holderWeight * 703 ) / (holderHeight * holderHeight); 
}

//method that calculates and returns the price of the insurance policy.
public double getPriceOfPolicy()
{
//initialized policy price. 
double priceOfPolicy = 0.00;
final int BASE_FEE = 600;

priceOfPolicy = BASE_FEE;

//price if holder is over 50 years of age. 
if( holderAge > 50)
{
 priceOfPolicy = BASE_FEE + 75;
}

//price if holder is a smoker. 
if(smokeStatus.equalsIgnoreCase("smoker"))
{
 priceOfPolicy = BASE_FEE + 100;
}

//price if the holder's BMI is over 35
if(getBMI() > 35)
{
 priceOfPolicy = ((getBMI() - 35)) * 20 + BASE_FEE;
}

return priceOfPolicy; 
}

}//end of the class. 