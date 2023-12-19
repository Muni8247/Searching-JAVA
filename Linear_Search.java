package com.company.linear_serach;
import java.util.*;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the size of an array: ");
		n=sc.nextInt();
		System.out.println();
		int[] arr=new int[n];
		System.out.print("Enter the array inputs: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Your array is: "+Arrays.toString(arr));
		System.out.println();
		
		//Linear search Logic
		int item;
		int temp=0;
		System.out.print("Enter the item you want to search: ");
		item=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				System.out.println("Your searching element is found at: "+i+" position");
				temp++;
			}
		}
		if(temp==0) {
				System.out.println("Not found in the array");
		}

	}

}
