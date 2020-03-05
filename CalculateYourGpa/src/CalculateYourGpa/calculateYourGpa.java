package CalculateYourGpa;
import java.util.Scanner;
import java.text.DecimalFormat;
public class calculateYourGpa {
	private static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		df.setMaximumFractionDigits(2);
		
		System.out.print("How many classes do you have? ");
		
		String cls = input.nextLine();
		int classes = Integer.parseInt(cls);
		
		final double A = 4.00;
		final double Aminus = 3.70;
		final double Bplus = 3.33;
		final double B = 3.00;
		final double Bminus = 2.70;
		final double Cplus = 2.30;
		final double C = 2.00;
		final double Cminus = 1.70;
		final double Dplus = 1.30;
		final double D = 1;
		final double Dminus = 0.70;
		final double F = 0.00;
		double gradePoints;
		double tGP = 0;
		double tCredits = 0;
		
		for (int i = 1; i <= classes; i++)
		{
			System.out.print("Enter course information seprated by comas (title, credit hours, letter grade) or type Q to quit: ");
			String courseInfo = input.nextLine();
			if (courseInfo.equals ("Q"))
				break;
			
			String[]courseStuff = courseInfo.split(",");
			String courseName = courseStuff[0].trim();
			String creditString = courseStuff[1].trim();
			String grades = courseStuff[2].trim();
			int credits = Integer.parseInt(creditString);
			
			if (grades.equals("A") || grades.equals("a"))
			{
				 gradePoints = credits * A;
				 tGP += gradePoints;
				 tCredits += credits;
				 System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
				 		+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("A-") || grades.equals("a-"))
			{
				gradePoints = credits * Aminus;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("B+") || grades.equals("b+"))
			{
				gradePoints = credits * Bplus;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("B") || grades.equals("b"))
			{
				gradePoints = credits * B;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("B-") || grades.equals("b-"))
			{
				gradePoints = credits * Bminus;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("C+") || grades.equals("c-"))
			{
				gradePoints = credits * Cplus;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("C") || grades.equals("c"))
			{
				gradePoints = credits * C;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("C-") || grades.equals("c-"))
			{
				gradePoints = credits * Cminus;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}	
			else if (grades.equals("D+") || grades.equals("d+"))
			{
				gradePoints = credits * Dplus;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("D") || grades.equals("d"))
			{
				gradePoints = credits * D;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("D-") || grades.equals("d-"))
			{
				gradePoints = credits * Dminus;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			else if (grades.equals("F") || grades.equals("f"))
			{
				gradePoints = credits * F;
				tGP += gradePoints;
				tCredits += credits;
				System.out.println("| Course: " + courseName + " | CreditHours: " + credits + " | Grade:"
						+ " " + grades + " | grade point is " + gradePoints + " |");
			}
			
				
		}
		
		double GPA = tGP / tCredits;
		System.out.println("_______________________________________________________________");
		System.out.println("| " + tCredits + " Total Credit Hours Attempted | " + df.format(tGP) + " Total Grade Points |");
		System.out.println("_______________________________________________________________");
		System.out.println("| GPA = " + df.format(tGP) + "/" + tCredits + " = " + df.format(GPA) + "           |"
				+ "                          |");
		System.out.println("_______________________________________________________________");
			

	}

}
