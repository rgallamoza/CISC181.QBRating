package pkgMain;

import java.util.Scanner;

public class cMain{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the total number of passing attempts.");
		double ATT = sc.nextDouble();
		
		System.out.println("Please enter the total number of completions.");
		double COMP = sc.nextDouble();
		
		System.out.println("Please enter the total number of passing yards.");
		double YDS = sc.nextDouble();
		
		System.out.println("Please enter the total number of touchdown passes.");
		double TD = sc.nextDouble();
		
		System.out.println("Please enter the total number of interceptions thrown.");
		double INT = sc.nextDouble();
		
		double a = (((COMP / ATT) - 0.3) * 5);
		double b = (((YDS / ATT) - 3) * 0.25);
		double c = ((TD / ATT) * 20);
		double d = (2.375 - ((INT / ATT) * 25));
		
		double Rating = (((a + b + c + d) / 6) * 100);
		
		System.out.println("Passer Rating: " + Rating);
	}
}