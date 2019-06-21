package examples;


public class Sum {

   public static void main(String args[])
   {
       int i,even=0,odd=0,sum=0,j,c=0,m;
       for(i=1;i<=100;i++)
       {
         if(i%2==0)
         {
           System.out.println(i +"is an even number");
           even=i;
         }
         else
         {
	   
           System.out.println(i +"is an odd number");
	   odd=i;
         }
         sum=even+odd;
         System.out.println("The sum of even and odd are"+sum);
         c=0;
         for(m=1;m<=sum;m++)
         {
          
          
              if(sum%m==0)
		c++;
           }
           if(c==2)
		System.out.println("The prime numbres are"+m);
        
         }
       }
   }




