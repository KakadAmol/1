
package javaConditionalStatements;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		int personage;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the personage");
		personage= scanner.nextInt();
		scanner.close();
		if(personage>18)
		{
			System.out.println("personage is major");
			if (personage>21)
			{
				System.out.println("Able to Getting marriage");
			}
			else
			{
				System.out.println("Not Able to Getting marriage");
			}
		}
		else
		{
			System.out.println("personage minar");
		}
		
	}

}
