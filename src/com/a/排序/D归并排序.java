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
