package com.e.��������;

public class A����������ʵ�� {
	/*
	 * ������������ͨʵ��
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
				mid=(start+mid)/2;
			}else if(A[mid]<key){
				start=mid+1;
				mid=(mid+end)/2;
			}else if(A[mid]==key){
				return mid;
			}
		}
		return -1;
	}
	
	
	/*
	 * ���������ĵݹ�ʵ��
	 */
	public static int binSearch(int[] A,int start ,int end, int key){
		int mid=(end+start)/2;
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
			System.out.println(binSearch(A,0,A.length-1, i));
		}
	}
}
