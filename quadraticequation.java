//Q.2 WAJP to solve quadratic equatioN


import java.util.Scanner;
public class quadraticequation {    
	  public static void main(String[] Strings) {

	        Scanner input = new Scanner(System.in);

	            System.out.print("Input value of a: ");
	            double a = input.nextDouble();
	            System.out.print("Input value of b: ");
	            double b = input.nextDouble();
	            System.out.print("Input value of c: ");
	            double c = input.nextDouble();

	            double result = b * b - 4.0 * a * c;

	            if (result > 0.0) {
	                double root1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
	                double root2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
	                System.out.println("The roots are " + root1 + " and " + root2);
	            } else if (result == 0.0) {
	                double root1 = -b / (2.0 * a);
	                System.out.println("The root is " + root1);
	            } else {
	                System.out.println("The equation has No real roots.");
	            }

	    }
}
