package com.calc;
import java.util.Scanner;
public class Driver {
   public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 CalciImplementation c=new CalciImplementation();
	 
	 System.out.println("Simple Calculator");
     System.out.print("Enter first number: ");
     int a = sc.nextInt();

     System.out.print("Enter second number: ");
     int  b = sc.nextInt();

     System.out.println("Choose operation (+, -, *, /): ");
     char operation = sc.next().charAt(0);
     
     switch(operation) {
     
     case '+':
         
               break;
     case '-':
         
               break;
     case '*':
        
               break;
     case '/':
         
               break;
     default:
         System.out.println("Invalid operation.");
     }

}
}
