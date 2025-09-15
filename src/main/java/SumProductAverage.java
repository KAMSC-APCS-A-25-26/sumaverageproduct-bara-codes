// NAME 					:	Bara Omaira
// GROUP					:	APCS-A
// LAST MODIFIED			:	11 September 2025
// PROBLEM ID 				:	Lewis Arithmetic 2.2-2.3
// PROBLEM DESCRIPTION		:	Prompts the user for 3 numbers, then calculates
//								the average, product, and sum.
// SOURCES I USED 			:	Java Textbook, Mr. Houtrouw, Mr. Afsal
// PEOPLE I HELPED 			:	N/A
// PEOPLE WHO HELPED ME 	:	Mr. Houtrouw, Mr. Afsal

//import a scanner
import java.util.Scanner;

public class SumProductAverage

{
    public static void main(String[] args)
    {
        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // declare variables
        double sum, product, average;

        // signature
        System.out.print("Bara Omaira\nAPCS-A\nLewisArithmetic2.2-2.3\n\n\n");

        // ask the user how many times they want to run the program
        System.out.print("How many times would you like to run the program?  ");
        int numRuns = sc.nextInt();

        for(int j=0; j<numRuns; j++)
        {
            // read in input
            System.out.print("\nEnter 3 numbers:  ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();

            // calculate sum
            sum = num1 + num2 + num3;

            // calculate product
            product = num1 * num2 * num3;

            // calculate average
            average = (num1 + num2 + num3)/3;

            // print the results
            System.lineSeparator();
            System.out.println("\nSum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Average: " + average);
            System.out.println("");
        }
    }
}

/*
How many times would you like to run the program?  3

Enter 3 numbers:  222.2 222.2 222.2

Sum: 666.5999999999999
Product: 1.0970645047999999E7
Average: 222.19999999999996


Enter 3 numbers:  3.14159 25.6 17

Sum: 45.74159
Product: 1367.219968
Average: 15.247196666666667


Enter 3 numbers:  100 0 55.5

Sum: 155.5
Product: 0.0
Average: 51.833333333333336

 */
