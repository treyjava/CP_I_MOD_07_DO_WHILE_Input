import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int favNum = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);
        boolean done = false;

        double itemPrice = 0;
        double totalPrice = 0;
        double averagePrice = 0;
        int numItems = 0;
        int grade = 0;
        int totalGrades = 0;
        int numGrades = 0;
        double averageGrades = 0;

        String anotherYN = "";

        final int SENTINEL = -1;


        do
        {
        // Favorite number 1 - 10
        System.out.print("Enter your fav num [1 - 10]: ");
        if(in.hasNextInt())
        {
            favNum = in.nextInt();
            in.nextLine();
            if (favNum >= 1 && favNum <= 10) {
                System.out.println("You said your fav num is " + favNum);
                done = true;
            }
            else
            {
                System.out.println("You said your fav num is " + favNum + " but that is out of range");
            }
        }
            else // don't have an int
            {
                trash = in.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        }while (!done);




        done = false;  // reset the done control variable to use again

        do
        {
            System.out.print("Enter the price of your item: ");
            if(in.hasNextDouble())
            {
                itemPrice = in.nextDouble();
                in.nextLine();

                totalPrice += itemPrice; // totalPrice = totalPrice + itemPrice;
                numItems++;

                // Do you have another...
                System.out.print("Do you have more items [Y/N]: ");
                anotherYN = in.nextLine();

                if(anotherYN.equalsIgnoreCase("N"))
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You  must enter a valid number not " + trash);
            }

        }while(!done);

        averagePrice = totalPrice / numItems;

        System.out.println("You have a total of " + numItems + " items. ");
        System.out.println("You have a total cost of " + totalPrice);
        System.out.printf("You have an average price of %8.2f", averagePrice);

        // Sentinel example

        done = false;
        do
        {
            System.out.print("Enter your grades [0 - 100] or -1 to quit ");
            if(in.hasNextInt())
            {
                grade = in.nextInt();
                in.nextLine();
                if(grade == -1)
                {
                    done = true;
                }
                else if(grade >= 0 && grade <= 100)
                {
                    totalGrades += grade; // totalGrades = totalGrades + grade
                    numGrades++;
                }
                else // an int that is out of range [0-100]
                {
                    System.out.println("Grade value is out of range must be [0-100] and you said " + grade);
                }
            }
            else // Not an int
            {
                trash = in.next();
                System.out.println("You must enter a valid int [0 - 100] or -1");
            }



        }while(!done);
        averageGrades = totalGrades / numGrades;

        System.out.println("You have a total of " + numGrades + " grades. ");
        System.out.println("You have a total grade of " + totalGrades);
        System.out.printf("You have an average grade of %8.2f\n", averageGrades);

        // For loop
        for(int x=0; x < 10; x++)
        {

        }


    }
}