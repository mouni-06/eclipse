package com.stech.sec2;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five numbers");
		int i,j=0,temp=0;
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
					
		}
		
		for (i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if (a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("after sorting");
		for(j=0;j<a.length;j++)
		{
			System.out.println(a[j]+" ");
		}
			
		sc.close();	
				
	}
}
