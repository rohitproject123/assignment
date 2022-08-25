//check Armstrong number


import java.util.Scanner;
public class Armstrong{
   public static void main(String[] args) {
      int input, temp, my_remainder, my_result;
      my_result = 0;
      Scanner my_scanner = new Scanner(System.in);
      System.out.print("Enter the number : ");
      input = my_scanner.nextInt();
      temp = input;
      while (temp != 0){
         my_remainder = temp % 10;
         my_result += Math.pow(my_remainder, 3);
         temp /= 10;
      }
      if(my_result == input)
         System.out.println(input + " is an Armstrong number");
      else
         System.out.println(input + " is not an Armstrong number");
   }
}