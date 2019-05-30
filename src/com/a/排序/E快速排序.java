package com.a.排序;

import java.util.ArrayList;
import java.util.Random;

public class E快速排序 {
	/*
	 * 从数组中随机找一个数，作为中间数
	 * 遍历数组，小于中间数的元素放到其左边，大于中间数的元素放到右边
	 * 然后对左右两部分分别递归调用快速排序，就使得数组有序了
	 */
	public int[] quickSort(int[] A, int n) {
		quick(A,0,n-1);
		return A;
	}

	private void quick(int[] A, int start, int end) {
		if(end > start){
			int middle=partition(A,start,end);
			quick(A, start, middle);
			quick(A, middle+1, end);
		}
		
	}

	private int partition(int[] A, int start, int end) {
		int j=start;
		for (int i = start; i <=end; i++) {
			if(A[i]<A[start]){
				swap(A,i,++j);
			}
		}
		swap(A,start,j);
		return j;
	}

	private void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

}
