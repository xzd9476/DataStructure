package com.e.二分搜索;

public class B局部最小值 {
	/*
	 * 定义局部最小的概念。arr长度为1时，arr[0]是局部最小。arr的长度为N(N>1)时，如果arr[0]<arr[1]，那么arr[0]
	 * 是局部最小；如果arr[N-1]<arr[N-2]，那么arr[N-1]是局部最小；如果0<i<N-1，既有arr[i]<arr[i-1]
	 * 又有arr[i]<arr[i+1]，那么arr[i]是局部最小。
	 * 给定无序数组arr，已知arr中任意两个相邻的数都不相等，写一个函数，只需返回arr中任意一个局部最小出现的位置即可。
	 */
	public int getLessIndex(int[] arr) {
		if(arr.length<=0)
			return -1;
		if(arr.length==1)
			return 1;
		if(arr[0]<arr[1])
			return 0;
		if(arr[arr.length-1]<arr[arr.length-2])
			return arr.length-1;
		
		int start=1;
		int end=arr.length-2;
		int mid=start+(end-start)/2;
		while(end>start){
			if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
				return mid;
			}else if(arr[mid]>=arr[mid-1]){
				end=mid-1;
				mid=start+(end-start)/2;
			}else if(arr[mid]>=arr[mid+1]){
				start=mid+1;
				mid=start+(end-start)/2;
			}
		}
		return mid;
    }

}
