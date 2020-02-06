package HousePainting;
import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//House dimensions
		System.out.print("Enter width of the house: ");
		int houseWidth = input.nextInt();
		System.out.print("Enter length of the house: ");
		int houseLength = input.nextInt();
		
		//Perform Computations
		int houseSqFT = houseLength * houseWidth;
		
		System.out.print("Enter height of the house: ");
		int houseHeight = input.nextInt();
		
		//Perform Computation
		double peakSqFT = houseSqFT + .5*(houseLength*(houseHeight - houseWidth));
		
		//Window dimensions
		System.out.print("Enter number of the house windows: ");
		int numberOfWindows = input.nextInt();
		
		System.out.print("Enter length of the house window: ");
		int lengthOfWindow = input.nextInt();
		
		System.out.print("Enter width of the house window: ");
		int widthOfWindow = input.nextInt();
		
		int windowSqFT = (lengthOfWindow * widthOfWindow) * numberOfWindows;
		
		//Door dimensions
		System.out.print("Enter number of the house doors: ");
		int numberOfDoor = input.nextInt();
		
		System.out.print("Enter length of the door: ");
		int lengthOfDoor = input.nextInt();
		
		System.out.print("Enter width of the house door: ");
		int widthOfDoor = input.nextInt();
		
		int doorSqFT = (lengthOfDoor * widthOfDoor) * numberOfDoor;
		
		//Sum
		double totalSqFT = ((2 * houseSqFT + 2 * peakSqFT) - (windowSqFT + doorSqFT));
		System.out.println("Total square feet: " + totalSqFT);
		
		
		System.out.print("Insert painter price: $");
		double setPrice = input.nextDouble();
		
		double totalCost = setPrice * totalSqFT;
		System.out.println("Total Cost is: $" + totalCost);
		
		

	}

}
