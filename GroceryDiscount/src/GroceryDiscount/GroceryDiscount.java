package GroceryDiscount;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class GroceryDiscount {
	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		df.setMaximumFractionDigits(2);
		boolean system = true;
		
		
		final double couponPercentage1 = .08;
		final double couponPercentage2 = .10;
		final double couponPercentage3 = .12;
		final double couponPercentage4 = .14;
		
		double groceryCost;
		double discount;
		
		
		
		
		while(system = true) {
			System.out.print("Please enter the cost of your groceries or '0' to quit: $");
			groceryCost = input.nextDouble();			
		if (groceryCost == 0) {
			system = false;
			break;
		}
			
		else if(groceryCost > 210.00)
		{	discount = (groceryCost * couponPercentage4);
			System.out.println("You win a discount coupon of $" + df.format(discount) + ". (" + df.format(couponPercentage4 * 100) +"% of your purchase)");
		
		}
		
		else if(groceryCost > 150.00 && groceryCost <= 210.00)
		{	discount = (groceryCost * couponPercentage3);
			System.out.println("You win a discount coupon of $" + df.format(discount) + ". (" + df.format(couponPercentage3 * 100) +"% of your purchase)");
		
		}
		
		else if(groceryCost > 60.00 && groceryCost <= 150.00)
		{	discount = (groceryCost * couponPercentage2);
			System.out.println("You win a discount coupon of $" + df.format(discount) + ". (" + df.format(couponPercentage2 * 100) +"% of your purchase)");
		
		}
		else if(groceryCost >= 10.00 && groceryCost <= 60.00)
		{	discount = (groceryCost * couponPercentage1);
			System.out.println("You win a discount coupon of $" + df.format(discount) + ". (" + df.format(couponPercentage1 * 100) +"% of your purchase)");
		}
		else
		{
			System.out.println("You are not eligable for a coupon this time.");
		}
		}
	}

}
