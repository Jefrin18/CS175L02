package CarDecision;

import java.util.Scanner;

public class CarDecisionString {

	public static void main(String[] args) {
		//Code
		Scanner input = new Scanner(System.in);
		
		//Regular Car Information
		System.out.print("Enter Information for the regular car: ");
		String regCar = input.nextLine();
		
		String regCarName = regCar.substring(0, 14);
		String costrCar = regCar.substring(15, 20);
		String milesrGal = regCar.substring(21, 23);
		int costRegCar = Integer.parseInt(costrCar);
		int milesPerRegGal = Integer.parseInt(milesrGal);
	
		//Hybrid Car Information
		System.out.print("Enter information for the hybrid car: ");
		String hybridCar = input.nextLine();
		
		String hybridCarName = hybridCar.substring(0, 12);
		String costhCar = hybridCar.substring(13, 18);
		String mileshGal = hybridCar.substring(19, 21);
		int costHybridCar = Integer.parseInt(costhCar);
		int milesPerHybridGal = Integer.parseInt(mileshGal);
		
		//traveled in a year
		System.out.print("Enter miles traveled in a year: ");
		int milesYear = input.nextInt();
		
		//Cost of gallon
		System.out.print("Enter cost per gallon of gas: $");
		double costPerGal = input.nextDouble();
		
		//Calculations
		double costOfYear1Regular = costRegCar + 
				(milesYear / milesPerRegGal * costPerGal);
		
		double costOfHybridYear1 = costHybridCar + 
				(milesYear / milesPerHybridGal * costPerGal);
		
		System.out.println("Cost to own " + regCarName + " after year 1: $" + costOfYear1Regular + 
				" for " + hybridCarName + ": $" + costOfHybridYear1);

		double costOfYear2Regular = costRegCar + 
				((2 * milesYear) / milesPerRegGal * costPerGal);
		
		double costOfHybridYear2 = costHybridCar + 
				((2 * milesYear) / milesPerHybridGal * costPerGal);
		
		System.out.println("Cost to own " + regCarName +" after year 2: $" + costOfYear2Regular + 
				" for " + hybridCarName + ": $" + costOfHybridYear2);
				
		double costOfYear3Regular = costRegCar + 
				((3 * milesYear) / milesPerRegGal * costPerGal);
		
		double costOfHybridYear3 = costHybridCar + 
				((3 * milesYear) / milesPerHybridGal * costPerGal);
		
		System.out.println("Cost to own " + regCarName + " after year 3: $" + costOfYear3Regular + 
				" for " + hybridCarName + ": $" + costOfHybridYear3);
		
		double costOfYear4Regular = costRegCar + 
				((4 * milesYear) / milesPerRegGal * costPerGal);
		
		double costOfHybridYear4 = costHybridCar + 
				((4 * milesYear) / milesPerHybridGal * costPerGal);
		
		System.out.println("Cost to own " + regCarName + " after year 4: $" + costOfYear4Regular + 
				" for " + hybridCarName + ": $" + costOfHybridYear4);
		
		double costOfYear5Regular = costRegCar + 
				((5 * milesYear) / milesPerRegGal * costPerGal);
		
		double costOfHybridYear5 = costHybridCar + 
				((5 * milesYear) / milesPerHybridGal * costPerGal);
		
		System.out.println("Cost to own " + regCarName + " after year 5: $" + costOfYear5Regular + 
				" for " + hybridCarName + ": $" + costOfHybridYear5);
		
		//if else
		if (costOfHybridYear5 < costOfYear5Regular)
		{ System.out.println("The Toyota Prius pays back after 5 years");
		}
		else 
		{ System.out.println("The Toyota Prius is not able to pay back in 5 years");
		}
		
		
	
	}

}
