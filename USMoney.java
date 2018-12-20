public class USMoney 
{   
    //Declaring private variables
    private int dollars;
    private int cents;

    //Constructor for USMoney with dollars and cents as parameters
    public USMoney(int dollars, int cents) 
    {
        this.dollars = dollars; 
        //Checking that cents should be between 0 and 99 otherwise transfering some of the cents to dollars to make it between 0 and 99 
        if(cents > 0 && cents < 99)
            this.cents = cents;
        else
        {
            //Adding extra cents to dollars to make it between 0 and 99
            this.dollars = this.dollars + cents/100; 
            this.cents = cents%100;
        }
    }  

    /* Method to return dollars */
    public int getDollars() 
    {
        return dollars;
    }

    /* Method to set dollars */
    public void setDollars(int dollars) 
    {
        this.dollars = dollars;
    }

    /* Method to return the cents */
    public int getCents() 
    {
        return cents;
    }

    /* Method to set cents */
    public void setCents(int cents) 
    {
        this.cents = cents;
    }
    
    // Method to add the total cents and dollars of the objects
    public USMoney plus( Object alpha)
    {
        USMoney Y = (USMoney)alpha;
        
        int sumOfDollars = getDollars() + Y.getDollars();
        int sumOfCents = getCents() + Y.getCents();
        
        USMoney usMoney = new USMoney(sumOfDollars, sumOfCents);
        return usMoney; 
    }  
     
    public void display()
    {
         System.out.println("The Money is " + getDollars() + " dollars and " + getCents() + " cents");
    }    
    
}