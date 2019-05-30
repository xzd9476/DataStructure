package com.a.����;

public class D�鲢���� {
	/*
	 * ʱ�临�Ӷ�ΪO��nlogN��
	 * ���Ƚ�������Ϊn������Ϊ1����������
	 * Ȼ���������䰤���Ƚϴ�С�ϲ����õ�n/2������Ϊ2����������
	 * ���κϲ����ڵ����䣬ֱ��ֻʣ��1������Ϊn����������
	 */
	public static int[] mergeSort(int[] A, int n) {
		sort(A,0,n-1);
		return A;
	}

	private static void sort(int[] A, int start, int end) {
		if(end>start){
			int middle=(start+end)/2;
			sort(A,start,middle);
			sort(A, middle+1, end);
			merge(A,start,middle,end);
		}
	}

	private static void merge(int[] A, int start, int middle, int end) {
		int temp[]=new int[end-start+1];
		int leftIndex=start;
		int rightIndex=middle+1;
		int tempIndex=0;
		while(leftIndex<=middle && rightIndex <=end){
			if(A[leftIndex] < A[rightIndex]){
				temp[tempIndex++]=A[leftIndex++];
			}else{
				temp[tempIndex++]=A[rightIndex++];
			}
		}
		
		while(leftIndex<=middle){
			temp[tempIndex++]=A[leftIndex++];
		}
		while(rightIndex<=end){
			temp[tempIndex++]=A[rightIndex++];
		}
		
		for (int i = 0; i <temp.length; i++) {
			A[i+start]=temp[i];
		}
	}
	
	public static void main(String[] args) {
		int[] A={1,2,4,8,2,7,3,5};
		mergeSort(A, 8);
	}
}
