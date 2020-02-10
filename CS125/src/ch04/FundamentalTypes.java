package ch04;

public class FundamentalTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A note
		System.out.println("God is good");
		//

		int age = 60;

		System.out.println("My age is: " + age);

		int n = 1000000000;

		int n2 = n * n;

		System.out.println(n2);

		double radius = 44.23;

		double perimeter = 2 * Math.PI * radius;

		double area = Math.PI * radius * radius;

		double area2 = Math.PI * Math.pow(radius, 2);

		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
		System.out.println("Area2 = " + area2);

		int p = 34;
		p = p + 1;
		p++;
		p = p - 1;
		p--;

		int d = 7;
		int s = 4;
		int r = d % s;
		double res = d / s;
		System.out.println("remainder = " + r);
		System.out.println("result = " + res);

		double d1 = 7;
		int s1 = 4;
		double res1 = d1 / s1;
		System.out.println("result1 " + res1);

	}

}
