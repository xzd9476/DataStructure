package com.a.排序;

public class D归并排序 {
	/*
	 * 时间复杂度为O（nlogN）
	 * 首先将数组拆分为n个长度为1的有序区间
	 * 然后将相邻区间挨个比较大小合并，得到n/2个长度为2的有序区间
	 * 依次合并相邻的区间，直到只剩下1个长度为n的有序区间
	 */
	public static int[] mergeSort(int[] A, int n) {
		sort(A,0,n-1);
		return A;
	}

	private static void sort(int[] A,int start,int end){
        if(end>start){
            int middle=(start+end)/2;
            sort(A,start,middle);
            sort(A,middle+1,end);
            merge(A,start,middle,end);
        }
    }
    
    private static void merge(int[] A,int start,int middle,int end){
        int leftindex=start;
        int rightindex=middle+1;
        int tempindex=0;
        int[] temp=new int[end-start+1];
        while(leftindex<=middle && rightindex<=end){
            if(A[leftindex]<A[rightindex]){
                temp[tempindex++]=A[leftindex++];
            }else{
                temp[tempindex++]=A[rightindex++];
            }
        }
        while(leftindex<=middle){
            temp[tempindex++]=A[leftindex++];
        }
        while(rightindex<=end){
            temp[tempindex++]=A[rightindex++];
        }
        for(int i=0;i<temp.length;i++){
            A[i+start]=temp[i];
        }
    }
	
	public static void main(String[] args) {
		int[] A={1,2,4,8,2,7,3,5};
		for (int i : A) {
			System.out.println(i);
		}
		mergeSort(A, 8);
	}
}
