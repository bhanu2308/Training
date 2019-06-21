package formulas;

import java.util.Scanner;

public class CommissionPercentage {
	public static void main(String arg[])	
	{
		double amount,commissionPercentage,commission;
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter amount:");
      amount=sc.nextDouble();
	  System.out.print("Enter commissionPercentage:");
      commissionPercentage=sc.nextDouble();
	   commission=(commissionPercentage/100)*amount;  	   
      System.out.println("Commission amount="+commission);
 
	}
}
