package formulas;

public class Discount {
	 public static void main(String args[])
       {
       double dis,amount,mprice,s;
         System.out.println("enter marked price:");
         System.out.println("enter discount:");
         mprice=Double.parseDouble(args[0]);
         dis=Double.parseDouble(args[1]);
         s=100-dis;
         amount=(s*mprice)/100;
         System.out.println("amount after dicount="+amount);
       }
      
}