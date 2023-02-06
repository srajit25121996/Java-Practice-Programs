package com.sr.searching;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,3,5,8,9,14,44};
		int x=31;
		
		System.out.println("Index of "+x+" is :"+ binarySearch(arr, 0, arr.length-1, x));

	}
	
	public static int binarySearch(int arr[],int low,int high,int x) {
		
		
		if(low>high)
			return -1;
		int mid=(high+low)/2;
		
		if(arr[mid]==x) {
			return mid;
		}
		
		else if(arr[mid]>x) {
			 return binarySearch(arr,low,mid-1,x);
		}
		
		else  {
			return binarySearch(arr,mid+1,high,x);
		}
		
		
		
	}

}
