package NOAAHeatIndex;

import java.util.Scanner;
import java.text.DecimalFormat;

public class NOAAHeatIndex {
	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		df.setMaximumFractionDigits(2);
		
		boolean run;
		double results = 0;
		double thi = 0;
		
		System.out.println("                              NOOA'S National Weather Service");
		System.out.println("                                         Heat Index");
		System.out.println("");
		System.out.println("");
		System.out.println("                                     Temperature ˚F");
		
		System.out.printf("       ");
		for (double x = 80; x<=110;x = x + 2) 
		{
			System.out.printf("%5.0f",x);
		}
		System.out.println();
		System.out.println("_______________________________________________________________________________________");
		for (double RH = 40; RH <= 100; RH = RH+5)
		{
			System.out.printf("%4.0f | ",RH);
			for (double T = 80; T <= 110; T += 2) {
				results = -42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH - .00683783*T*T - .05481717*RH*RH + 
				.00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH;
				if (results < 137) {
					System.out.printf("%5.0f",results);
				}
				else {
					System.out.print(" ");
					}
				
			}
			System.out.println();
		
		}
		while(run = true) {
			System.out.print("Please enter temperature in fahrenheit or '0' to end: ");
			double T = input.nextDouble();
			if (T == 0) {
				System.out.println("User has enterd '0' program has ended");
				break;
			}
			System.out.print("Please enter relative humidity: ");
			double RH = input.nextDouble();
			
			thi =  -42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH - .00683783*T*T - .05481717*RH*RH + 
					.00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH;
			System.out.print("The THI for a temperature of " + T + "˚F and relative of " + RH + " is " + df.format(thi) +"°");
			
			if (thi <= 90)
				System.out.println(" Advisory: Caution");
			else if (thi < 105)
				System.out.println(" Adivsory: Extreme caution");
			else if (thi < 126)
				System.out.println(" Advisory: Danger");
			else
				System.out.println(" Advisory: Extreme danger");

			
		}
		
		
		

	}

}
