package com.a.����;

import java.util.ArrayList;
import java.util.Random;

public class E�������� {
	/*
	 * �������������һ��������Ϊ�м���
	 * �������飬С���м�����Ԫ�طŵ�����ߣ������м�����Ԫ�طŵ��ұ�
	 * Ȼ������������ֱַ�ݹ���ÿ������򣬾�ʹ������������
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
