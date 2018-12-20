public class Date 
{
    //Declaring private variables for day,month and year
    private int day;
    private int month;
    private int year;     
    
    //Constructor taking day,month and year as parameters
    public Date(int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /* Method to return the day */
    public int getDay() 
    {
        return day;
    }

    /* Method to set the day  */
    public void setDay(int day) 
    {
        this.day = day;
    }

    /* Method to return the month */
    public int getMonth() 
    {
        return month;
    }

    /* Method to set the month */
    public void setMonth(int month) 
    {
        this.month = month;
    }

    /* Method to return the year */
    public int getYear() 
    {
        return year;
    }

    /*Mathod to set the year */
    public void setYear(int year) 
    {
        this.year = year;
    }
    
    // Method that calculates the number of days and returns
    public int daysSinceJan1()
    {
        int numberOfDays = 0;
        int errorCode;
        
        if(getMonth() <= 12 && getMonth() > 0)
        {
            if( getDay() <= daysInMonth(getMonth()))
            {
                // Looping until i is less than the month entered by the user
                for(int i = 0; i< getMonth() ;i++)
                {
                    // adding the number of days in each month
                    numberOfDays += daysInMonth(i);
                }
   
                 numberOfDays += this.day;                
            }
            else
            {    
                errorCode = 10;                
                return errorCode;
            }
        }
        else
        {            
            errorCode = 20;
            return errorCode;                      
        }
                
        // Returning the numberOfDays
        return numberOfDays;
    }
    
    //Method that returns the number of days in a month
    public int daysInMonth( int month)
    {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                //Checking the condition if this is a leap year if true february has 29 else 28
                if(!isLeapYear())
                    return 28;
                else
                    return 29;
            default:
                break;
        }
       
      return 0;
    }
    
    // Method to check for leap year
    public boolean isLeapYear()
    {
        if( (this.year%4==0 && this.year%100!=0) || this.year%400==0 ) //To check whether the year is leap year or not and return true if it is leap year.
            return true;
 else 
            return false;
    }
    
    // Method to display the number of days since Jan 1
    public void display()
    {   
        if( daysSinceJan1() != 10 && daysSinceJan1() != 20)
        {
            System.out.println("The number of days : " + daysSinceJan1());
    
        }
    }
    
}