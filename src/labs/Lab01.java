package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		
		System.out.println("3^5 = " + Math.pow(3, 5));
	
		
	}
	
	
	
	public static void problem2() {
		
		System.out.println("sqare root of 10 = " + Math.sqrt(10));	
		
	}
	
	
	
	public static void problem3() {
		
		int a = 25, b = 49;
		System.out.println("(a1 + a3) = " + (a + b) + "\n");
		
	}
	
	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in); 
		int entnum; 
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE; 
		
		System.out.print("Enter an Integer");
		entnum = inKey.nextInt();
		while (entnum > 0)
			{
			System.out.print("Enter an integer");
			entnum = inKey.nextInt(); 
			if (entnum < 0)
		{
			System.out.println("Enter an integer");	
			entnum = inKey.nextInt(); 
			max = Math.max(max, entnum); 
			
			System.out.println(max);
			System.out.println("max =" + max);
			min = Math.min(min, entnum); 
			
			System.out.println(min); 
			System.out.println("Min=" + min);
				
				
				
			}
	}
	
	
	
}
