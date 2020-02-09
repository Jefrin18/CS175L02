package CarDecision;
import java.util.Scanner;

public class CarDecision {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Buyer input
		System.out.print("Enter cost of regular car: ");
		double carCost = input.nextDouble();
		
		System.out.print("Enter  miles per gallon of regular car: ");
		double gallonCar = input.nextDouble();
		
		System.out.print("Enetr cost of hybrid car: ");
		double hybridCost = input.nextDouble();
		
		System.out.print("Enter miles per gallon of hybrid car: ");
		double gallonHybrid = input.nextDouble();
		
		System.out.print("Eneter miles traveled in a year: ");
		double milesYear = input.nextDouble();
		
		System.out.print("Cost per gallon of gas: $");
		double costGallon = input.nextDouble();
		
		//Calculation
		double costOfYear1Regular = carCost + 
				(milesYear / gallonCar * costGallon);
		
		double costOfHybridYear1 = hybridCost + 
				(milesYear / gallonHybrid * costGallon);
		
		System.out.println("Cost to own after year 1 for regular car: " + costOfYear1Regular + 
				" for hybrid car: " + costOfHybridYear1);

		double costOfYear2Regular = carCost + 
				((2 * milesYear) / gallonCar * costGallon);
		
		double costOfHybridYear2 = hybridCost + 
				((2 * milesYear) / gallonHybrid * costGallon);
		
		System.out.println("Cost to own after year 2 for regular car: " + costOfYear2Regular + 
				" for hybrid car: " + costOfHybridYear2);
				
		double costOfYear3Regular = carCost + 
				((3 * milesYear) / gallonCar * costGallon);
		
		double costOfHybridYear3 = hybridCost + 
				((3 * milesYear) / gallonHybrid * costGallon);
		
		System.out.println("Cost to own after year 3 for regular car: " + costOfYear3Regular + 
				" for hybrid car: " + costOfHybridYear3);
		
		double costOfYear4Regular = carCost + 
				((4 * milesYear) / gallonCar * costGallon);
		
		double costOfHybridYear4 = hybridCost + 
				((4 * milesYear) / gallonHybrid * costGallon);
		
		System.out.println("Cost to own after year 4 for regular car: " + costOfYear4Regular + 
				" for hybrid car: " + costOfHybridYear4);
		
		double costOfYear5Regular = carCost + 
				((5 * milesYear) / gallonCar * costGallon);
		
		double costOfHybridYear5 = hybridCost + 
				((5 * milesYear) / gallonHybrid * costGallon);
		
		System.out.println("Cost to own after year 5 for regular car: " + costOfYear5Regular + 
				" for hybrid car: " + costOfHybridYear5);
		
		//if else
		if (costOfHybridYear5 < costOfYear5Regular)
		{ System.out.println("The hybrid car pays back after 5 years");
		}
		else 
		{ System.out.println("The hybrid does not pays back after 5 years");
		}
		
	}

}
