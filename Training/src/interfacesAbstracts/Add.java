package interfacesAbstracts;
 class Arithmatic
 {
	 int add(int a,int b)
	 {
		int sum=a+b;
		 return sum;
	 }
 }
 class Adder  extends Arithmatic
 {
	 void display()
	 {
		 System.out.println("My superclass is: Arithmetic");
	 }
}
  class Pqr
 {
	  public static void main(String args[])
	  {
		  Adder a=new Adder();
		  a.display();
		 int s=a.add(10,20);
		  System.out.print(s +" ");
		  int s1=a.add(10,30);
		  System.out.print(s1 +" ");
		  int s2=a.add(10,40);
		  System.out.print(s2 +" ");
	  }
	 
 }
