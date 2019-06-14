package com.e.二分搜索;

public class A二分搜索的实现 {
	/*
	 * 二分搜索的普通实现
	 */
	public static int binSearch(int[] A,int key){
		if(A.length==0)
			return -1;
		
		int mid=A.length/2;
		if(A[mid]==key)
			return mid;
		
		int end=A.length-1;
		int start=0;
		while(end>start){
			if(A[mid]>key){
				end=mid;
				mid=(mid-start)/2+start;
			}else if(A[mid]<key){
				start=mid+1;
				mid=(end-mid)/2+mid;
			}else if(A[mid]==key){
				return mid;
			}
		}
		return -1;
	}
	
	
	/*
	 * 二分搜索的递归实现
	 */
	public static int binSearch(int[] A,int start ,int end, int key){
		int mid=(end-start)/2+start;
		if(A[mid]==key)
			return mid;
		if(start>=end)
			return -1;
		if(A[mid]<key){
			return binSearch(A, mid+1, end, key);
		}
		if(A[mid]>key){
			return binSearch(A, start, mid-1, key);
		}
		return -1;
	}

	
	public static void main(String[] args) {
		int[] A={1,2,3,4,5,6,7,8,9};
		for(int i=0;i<A.length;i++){
			System.out.println(binSearch(A, i));
		}
	}
}
