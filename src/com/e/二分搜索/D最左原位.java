package com.e.二分搜索;

public class D最左原位 {
	/*
	 * 有一个有序数组arr，其中不含有重复元素，请找到满足arr[i]==i条件的最左的位置。如果所有位置上的数都不满足条件，返回-1。
	 * 给定有序数组arr及它的大小n，请返回所求值。
	 */
	public int findPos(int[] arr, int n) {
		int res=-1;
		if(n<=0 || arr[n-1]<n-1 || arr[0]>n-1)
			return res;
		
		int start=0;
		int end=n-1;
		int mid=-1;
		while(end>=start){
			mid=start+(end-start)/2;
			if(arr[mid]==mid){
				res=mid;
				end=mid-1;
			}else if(arr[mid] < mid){
				start=mid+1;
			}else if(arr[mid] > mid){
				end=mid-1;
			}
		}
		return res;
    }

}
