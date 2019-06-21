package formulas;

import java.util.Scanner;

public class Transpose {
	
	   public static void main(String args[])
	   {
	      int row, col,i,j,temp,n;
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows");
	      row = sc.nextInt();
	     
	      System.out.println("Enter the number  columns");
	      col  = sc.nextInt();
	    if(row >col)
	     n=row;
	    else
	     n= col;
	      int matrix1[][] = new int[n][n]; 
	 
	 
	      System.out.println("Enter the elements of matrix");
	 
	      for (  i= 0 ; i < row ; i++ )
	       {   
	    
	            for ( j= 0 ; j < col ;j++ )
	             matrix1[i][j] = sc.nextInt();
	            
	       }
	      
	      System.out.println("Original   matrix:-");
	 for (  i= 0 ; i < row ; i++ )
	       {  
	                for ( j= 0 ; j <col;j++ )
	                System.out.print(matrix1[i][j]+" ");
	 	
	         System.out.println();
	}
	 
	      for (  i= 0 ; i < n; i++ )
	         for ( j= i+1 ; j < n;j++ )
	             {
	                   temp=matrix1[i][j]  ;
	                   matrix1[i][j] =matrix1[j][i]  ;
			matrix1[j][i]  =temp;
	 
	            }
	 
	 
	      System.out.println("Transpose  of   matrix:-");
	      for (  i= 0 ; i < col ; i++ )
	       {  
	                for ( j= 0 ; j < row;j++ )
	                System.out.print(matrix1[i][j]+" ");
	 	
	         System.out.println();
	       }
	 
	   }
	 
	}


