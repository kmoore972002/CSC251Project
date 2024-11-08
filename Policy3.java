/*
This is a class for project part 2, this time the class is modified
based on the instructions from project part 2. 
*/
public class Policy3
{
// declaring fields. 
private int pNumber, holderAge;
private double holderHeight, holderWeight;
private String providerName, firstName, lastName, smokeStatus;

//no-arg constructor here. 
 public Policy3()
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
 
  /*Constructor that accepts arguments for the policy number, holder's age, holder's height
    holder's weight, provider's name, first name, last name, and the smoke status. 
    @param pNum - policy number
    @param holderAge - holder's age
    @param holderHeight - holder's height
    @param holderWeight - holder's weight
    @param providerName - provider's name
    @param lastName - holder's last name
    @param firstName - holder's first name
    @param smokeStatus - holder's smoke status
    
  */
public Policy3 (int conPNumber, int conHolderAge, double conHolderHeight, double
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


/**
The setPNumber method sets the policy number value. 
@param mutatePNumber will set the policy number.
*/
 public void setPNumber(int mutatePNumber)
{
  pNumber = mutatePNumber;
}

/**
The getPNumber method returns the policy number value. 
@return the policy number.
*/
public int getPNumber()
{
 return pNumber;
}

/**
The setHolderAge method sets the holder's age. 
@param mutateHolderAge will set the holder's age.
*/ 
 public void setHolderAge(int mutateHolderAge)
{
  holderAge = mutateHolderAge;
}

/**
The getHolderAge method returns the holder's age. 
@return the holder's age.
*/
public int getHolderAge()
{
 return holderAge;
}

/**
The setHolderHeight method sets the holder's height. 
@param mutateHolderHeight will set the holder's height.
*/ 
 public void setHolderHeight(double mutateHolderHeight)
{
  holderHeight = mutateHolderHeight;
}

/**
The getHolderHeight method returns the holder's height. 
@return the holder's height.
*/
public double getHolderHeight()
{
 return holderHeight;
}

/**
The setHolderWeight method sets the holder's weight. 
@param mutateHolderWeight will set the holder's weight.
*/ 
 public void setHolderWeight(double mutateHolderWeight)
{
  holderWeight = mutateHolderWeight;
}

/**
The getHolderWeight method returns the holder's weight. 
@return the holder's weight.
*/
public double getHolderWeight()
{
 return holderWeight;
}

/**
The setProviderName method sets the provider's name. 
@param mutateProviderName will set the provider's name.
*/ 
 public void setProviderName(String mutateProviderName)
{
  providerName = mutateProviderName;
}

/**
The getProviderName method returns the provider's name. 
@return the provider's name.
*/
public String getProviderName()
{
 return providerName;
}

/**
The setFirstName method sets the holder's first name. 
@param mutateFirstName will set the holder's first name.
*/ 
 public void setFirstName(String mutateFirstName)
{
  firstName = mutateFirstName;
}

/**
The getFirstName method returns the holder's first name. 
@return the holder's first name.
*/
public String getFirstName()
{
 return firstName;
}

/**
The setLastName method sets the holder's last name. 
@param mutateLastName will set the holder's last name.
*/ 
 public void setLastName(String mutateLastName)
{
  lastName = mutateLastName;
}

/**
The getLastName method returns the holder's last name. 
@return the holder's last name.
*/
public String getLastName()
{
 return lastName;
}

/**
The setSmokeStatus method sets the holder's smoke status. 
@param mutateSmokeStatus will set the holder's smoke status.
*/ 
 public void setSmokeStatus(String mutateSmokeStatus)
{
  smokeStatus = mutateSmokeStatus;
}

/**
The getSmokeStatus method returns the holder's smoke status. 
@return the holder's smoke status.
*/
public String getSmokeStatus()
{
 return smokeStatus;
}

/**
The getBMI method returns the holder's BMI. 
@return the holder's BMI.
*/
public double getBMI()
{
 return ( holderWeight * 703 ) / (holderHeight * holderHeight); 
}

/**
The getPriceOfPolicy method returns the holder's policy price. 
@return the policy price.
*/
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