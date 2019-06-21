package formulas;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String args[])
	{
		int units;
		double billpay=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of units");
		units=sc.nextInt();
		if(units<100)
		{
			billpay=units*1.00;
		}
		else if(units<200)
		{
			billpay=units*1.50;
		}
		System.out.println("bill to pay:"+billpay);
	}

}
