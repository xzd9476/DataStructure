package com.e.��������;

public class CԪ��������ֵ�λ�� {
	/*
	 * ����һ����������arr���ٸ���һ������num������arr���ҵ�num��������ֵ�����ߵ�λ�á�
	 * ����һ������arr�����Ĵ�Сn��ͬʱ����num���뷵������λ�á�����Ԫ����������δ���֣��뷵��-1��
	 */
	public int findPos(int[] arr, int n, int num) {
		if(n<=0)
			return -1;
		int res=-1;
		int start=0;
		int end=n-1;
		int mid=0;
		while(end>start){
			mid=start+(end-start)/2;
			if(arr[mid] == num){
				res=mid;
				end=mid-1;
			}else if(arr[mid] > num){
				end=mid-1;
			}else if(arr[mid]<num){
				start=mid+1;
			}
		}
		return res;
    }
	
}
