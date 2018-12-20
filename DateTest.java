import java.util.Scanner;

public class DateTest
{
    public static void main(String[] args) 
    {
        // Initializing the Scanner object
        Scanner input = new Scanner(System.in);  
                   
            // Taking inputs of Day, Month and Year from the user
            System.out.println("Enter Day :");        
            int day = input.nextInt();                
            System.out.println("Enter Month :");
            int month = input.nextInt();
            System.out.println("Enter Year :");
            int year = input.nextInt();
        
            // Initializing an object for Date class
            Date date = new Date(day, month, year);
        
            // Printing error messages if the user enter incorrect day or month
            if(date.daysSinceJan1() == 10)
                 System.out.println("You entered incorrect days, Please try again");
            else if(date.daysSinceJan1() == 20)
                 System.out.println("You entered incorrect Month, Please try again"); 
            
            //Calling the display method from date class
            date.display();       
    }
}