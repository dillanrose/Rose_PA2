package rose_p2;

import java.util.Scanner;

public class bmiCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Calculate BMI in Metric or Imperial? Please enter either m or i");
		String measurmentType = in.next();
		
		if(measurmentType.equals("m")) {
			
			System.out.println ("Please enter weight in kilograms.");
			int kilo = in.nextInt();
			System.out.println("You entered " +kilo+ " kilograms");
			System.out.println("Please enter height in Meters.");
			int meters =in.nextInt();
			System.out.println("You entered " +meters+ " meters");
			
			int bmiM= kilo/(meters*meters);
			
			System.out.println("Your BMI is " +bmiM);
			System.out.println("");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
		}
		if(measurmentType.equals("i")) {
			
			
			System.out.println ("Please enter weight in pounds.");
			int pounds = in.nextInt();
			System.out.println("You entered " +pounds+ " pounds");
			System.out.println("Please enter height in inches.");
			int inch =in.nextInt();
			System.out.println("You entered " +inch+ " inches");
			
			int bmiM= (pounds*703)/(inch*inch);
			
			System.out.println("Your BMI is " +bmiM);
			System.out.println("");
			
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
		}
	
		
	
	}
}