package stringbased;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length ofthe array:");
		int len=sc.nextInt();
		int arr[]=new int[len+1];
		System.out.println("enter" +len+ "elements");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element to insert");
		int element=sc.nextInt();
		arr[len]=element;
		System.out.println("Element after inserting:");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i] + ",");
		}
		System.out.println(arr[len]);
	}

}
