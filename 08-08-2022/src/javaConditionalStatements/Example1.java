package javaConditionalStatements;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		int number;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the any number");
		number =scanner.nextInt();
		scanner.close();
		if(number>0)
		{
			if (number %2==0)
			{
				System.out.println("Even number");
			}
			else 
			{
				System.out.println("odd number");
			}
		}
		else
			{
			System.out.println("Negetive number");
		}
		
			
	}}	
		
		
	
		
			
		
	

	

