//Q.3 Take three numbers from the user and print the greatest number.

import java.util.Scanner;
public class largestnumber {
	    
	  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	   
	  System.out.print("Enter the 1st number: ");
	  int num1 = in.nextInt();
	   
	  System.out.print("Enter the 2nd number: ");
	  int num2 = in.nextInt();
	   
	  System.out.print("Enter the 3rd number: ");
	  int num3 = in.nextInt();
	   
	   
	  if (num1 > num2)
	   if (num1 > num3)
	    System.out.println("The greatest Number is " + num1);
	   
	  if (num2 > num1)
	   if (num2 > num3)
	    System.out.println("The greatest Number is " + num2);
	   
	  if (num3 > num1)
	   if (num3 > num2)
	    System.out.println("The greatest Number is " + num3);
	 }
	

}
