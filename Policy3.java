/*
This is a class for project part 3, this time the class is modified
based on the instructions from project part 3. 
*/
public class Policy3
{
// declaring fields. 
private int pNumber; 
private  String providerName;
private PolicyHolder Holder; //aggregation here. 
private static int policyCount = 0; 

//no-arg constructor here. 
 public Policy3()
 {
  pNumber = 0;
  providerName = "";
  Holder = new PolicyHolder();
 }
 
  /*Constructor that accepts arguments for the policy number, holder, provider's name. 
    @param pNum - policy number
    @param providerName - provider's name
    @param Holder - info on the policy holder. 
    
  */
public Policy3 (int pNumber, String providerName, PolicyHolder Holder )
{
this.Holder = Holder;
this.providerName = providerName;
this.pNumber = pNumber;

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
The setHolder method sets the holder's info. 
@param mutateHolder will set the holder's info.
*/
 public void setHolder(PolicyHolder mutateHolder)
{
  Holder = new PolicyHolder(mutateHolder);
}

/**
The getHolder method returns the holder's policy info. 
@return the holder's info.
*/
public PolicyHolder getHolder()
{
 return new PolicyHolder(Holder); 
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
if( Holder.getAge() > 50)
{
 priceOfPolicy = BASE_FEE + 75;
}

//price if holder is a smoker. 
if(Holder.getStatus().equalsIgnoreCase("smoker"))
{
 priceOfPolicy = BASE_FEE + 100;
}

//price if the holder's BMI is over 35
if(Holder.getHolderBMI() > 35)
{
 priceOfPolicy = ((Holder.getHolderBMI() - 35)) * 20 + BASE_FEE;
}

return priceOfPolicy; 
}


 /**
      toString method
      @return - A string containing information about the policy and policy holder. 
  */ 

   /*
     We make use of the String.format method to format the info of the policy info pertaining to the holder. 
   */
  public String toString() 
{
    return String.format("Policy Number: %d\nProvider Name: %s\n%sPolicy Price: $%.2f", 
                         pNumber, 
                         providerName, 
                         Holder.toString(), 
                         getPriceOfPolicy());
}


}//end of the class. 