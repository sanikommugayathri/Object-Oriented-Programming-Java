import java.util.Scanner;

public class USMoneyTest 
{
    public static void main(String[] args) 
    {
        // Initializing the Scanner object
        Scanner input = new Scanner(System.in);
        
        // Taking inputs from the user
        System.out.println("Enter xDollars :");
        int xDollars = input.nextInt();
        System.out.println("Enter xCents :");
        int xCents = input.nextInt();
        
        // Initializing the USMoney object by passing the xdollars and xcents
        USMoney X = new USMoney(xDollars,xCents);
        
        // Taking input from the user
        System.out.println("Enter yDollars :");
        int yDollars = input.nextInt();
        System.out.println("Enter yCents :");
        int yCents = input.nextInt();
        
        // Initializing the USMoney object by passing the ydollars and ycents
        USMoney Y = new USMoney(yDollars , yCents);
        
        // Calling the display method of the object returned from X.plus(Y)
        (X.plus(Y)).display();
               
    }
    
}