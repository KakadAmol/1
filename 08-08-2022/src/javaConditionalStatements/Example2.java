package javaConditionalStatements;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		int maths,physics, chimistry, total=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the maths marks /100");
		
		maths=scanner.nextInt();
		System.out.println("enter the physics marks/100 ");
		physics = scanner.nextInt();
		System.out.println("Enter the chimistry /100 ");
		chimistry = scanner.nextInt();
		
		 scanner.close();
		 if(maths >=50 && physics >=50 && chimistry >=50)
		 {
			 int total1=(maths+physics+chimistry);
			 if (total1>=200)
				 System.out.println("able to get admission in IIT ");
			 else
				 System.out.println("not able to admission");
		 }
		 else 
			 System.out.println("better  luck next time");
			 
			 
	}

}
