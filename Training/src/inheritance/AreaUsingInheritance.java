package inheritance;

 class AreaUsingInheritance {
	
		  int radius,side;
		  public static void main(String args[])
			{
				
				Circle c=new Circle();
				c.circle();
				Square sq=new Square();
				sq.square();
				Sphere sp=new Sphere();
				sp.sphere();
			}
		 }   
		 class Circle extends AreaUsingInheritance
		{
			void circle()
			{
				double circlearea=Math.PI*radius*radius;
				System.out.println("area of the the circle:" +circlearea);
			}
		}
		 class Square extends AreaUsingInheritance
		{
			void square()
			{
				double squarearea=side*side;
				System.out.println("area of the square:" +squarearea);
			}
		}
		class Sphere extends AreaUsingInheritance
		 {
		 	void sphere()
		 	{
		 		double spherearea=4*Math.PI*radius*radius;
		 		System.out.println("area of the the sphere:" + spherearea);
		 	}
		 }
		
