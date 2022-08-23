//Q.1 WAJP to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class Check {
    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your number: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("Your Number is positive");
        }
        else if (input < 0)
        {
            System.out.println("Your Number is negative");
        }
        else
        {
            System.out.println("Your Number is zero");
        }
    }
	
	
}
