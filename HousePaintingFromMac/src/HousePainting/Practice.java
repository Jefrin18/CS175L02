package HousePainting;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int width = 20;
		System.out.println(width);
		
		System.out.print("Enter the length: ");
		
		int length = input.nextInt();
		System.out.println(length);
		
		int area = width*length;
		System.out.println("Area: " + area);
		
		System.out.print("Enter name: ");
	
		String name = input.next();
		System.out.println(name);

	}

}
