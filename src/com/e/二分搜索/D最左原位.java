package com.e.��������;

public class D����ԭλ {
	/*
	 * ��һ����������arr�����в������ظ�Ԫ�أ����ҵ�����arr[i]==i�����������λ�á��������λ���ϵ���������������������-1��
	 * ������������arr�����Ĵ�Сn���뷵������ֵ��
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
