package com.e.��������;

public class B�ֲ���Сֵ {
	/*
	 * ����ֲ���С�ĸ��arr����Ϊ1ʱ��arr[0]�Ǿֲ���С��arr�ĳ���ΪN(N>1)ʱ�����arr[0]<arr[1]����ôarr[0]
	 * �Ǿֲ���С�����arr[N-1]<arr[N-2]����ôarr[N-1]�Ǿֲ���С�����0<i<N-1������arr[i]<arr[i-1]
	 * ����arr[i]<arr[i+1]����ôarr[i]�Ǿֲ���С��
	 * ������������arr����֪arr�������������ڵ���������ȣ�дһ��������ֻ�践��arr������һ���ֲ���С���ֵ�λ�ü��ɡ�
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
