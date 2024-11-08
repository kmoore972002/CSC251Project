/*
This is a class for project part 3, this time the class is modified
based on the instructions from project part 3. 
*/
public class PolicyHolder
{
//fields. 
private int Age;
private double Height;
private double Weight;
private String Last;
private String First;
private String Status;

//here is a no-arg constructor. 
public PolicyHolder()
{
  Last = "";
  First = "";
  Status = "";
  Age = 0;
  Height = 0.00;
  Weight = 0.00;

}

/*Constructor that accepts arguments for the, holder's age, holder's height
    holder's weight, first name, last name, and the smoke status. 
    @param Last - holder's last name. 
    @param First - holder's first name. 
    @param Height - holder's height
    @param Weight - holder's weight
    @param Status - holder's status
    @param Age - holder's age
  */
  public PolicyHolder(int Age, String Last, String First, double Height, double Weight, String Status)
  {
  this.Age = Age;
  this.Last = Last;
  this.First = First;
  this.Height = Height;
  this.Weight = Weight;
  this.Status = Status;
  
  }
  
   //here is a copy constuctor. 
    public PolicyHolder(PolicyHolder Holder) 
    {
        this.Age = Holder.Age;
        this.Last = Holder.Last;
        this.First = Holder.First;
        this.Height = Holder.Height;
        this.Weight = Holder.Weight;
        this.Status = Holder.Status;
    }

  
/**
The setAge method sets the age of the policy holder. 
@param mutateAge will set the age.
*/
 public void setAge(int mutateAge)
{
 Age = mutateAge;
}

/**
The getAge method returns the age of the policy holder. 
@return the age of the policy holder.
*/
public int getAge()
{
 return Age;
}

/**
The setHeight method sets the height of the policy holder. 
@param mutateHeight will set the height.
*/
 public void setHeight(double mutateHeight)
{
 Height = mutateHeight;
}

/**
The getHeight method returns the height of the policy holder. 
@return the height of the policy holder.
*/
public double getHeight()
{
 return Height;
}

/**
The setWeight method sets the weight of the policy holder. 
@param mutateWeight will set the weight.
*/
 public void setWeight(double mutateWeight)
{
 Weight = mutateWeight;
}

/**
The getWeight method returns the Weight of the policy holder. 
@return the Weight of the policy holder.
*/
public double getWeight()
{
 return Weight;
}

/**
The setLast method sets the last name of the policy holder. 
@param mutateLast will set the last name.
*/
 public void setLast(String mutateLast)
{
 Last = mutateLast;
}

/**
The getLast method returns the last name of the policy holder. 
@return the last name of the policy holder.
*/
public String getLast()
{
 return Last;
}

/**
The setFirst method sets the first name of the policy holder. 
@param mutateHeight will set the first name.
*/
 public void setFirst(String mutateFirst)
{
 First = mutateFirst;
}

/**
The getFirst method returns the first name of the policy holder. 
@return the first name of the policy holder.
*/
public String getFirst()
{
 return First;
}

/**
The setHeight method sets the height of the policy holder. 
@param mutateHeight will set the height.
*/
 public void setStatus(String mutateStatus)
{
 Status = mutateStatus;
}

/**
The getHeight method returns the height of the policy holder. 
@return the height of the policy holder.
*/
public String getStatus()
{
 return Status;
}

/**
The getHolderBMI method returns the holder's BMI. 
@return the holder's BMI.
*/
public double getHolderBMI()
{
 return ( Weight * 703 ) / (Height * Height); 
}


 /**
      toString method
      @return - A string containing the policy holder information. 
  */ 

   /*
     We make use of the String.format method to format the policy holder's info. 
   */
   
public String toString() 
{
    return String.format("Policyholder's First Name: %s\n" +
                         "Policyholder's Last Name: %s\n" +
                         "Policyholder's Age: %d\n" +
                         "Policyholder's Smoking Status (Y/N): %s\n" +
                         "Policyholder's Height: %.2f\n" +
                         "Policyholder's Weight: %.2f\n" +
                         "Policyholder's BMI: %.2f",
                         First, Last, Age, Status, Height, Weight, getHolderBMI());
}
  

}//end of class. 