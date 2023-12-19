package com.company.linear_serach;
import java.util.*;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the siz eof an array: ");
		n=sc.nextInt();
		System.out.println();
		int[] arr=new int[n];
		System.out.print("Enter the inputs of array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Your array is: "+Arrays.toString(arr));
		System.out.println();
		
		int key;
		System.out.print("Enter the what you want to search in the array: ");
		key=sc.nextInt();
		
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		while(low<=high) {
			if(arr[mid]==key) {
				System.out.println("Your searching element is found at the "+mid+" position");
				break;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if(low>high) {
			System.out.println("Element is not found in the array");
		}
		

		

	}

}
