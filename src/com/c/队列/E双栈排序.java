package com.c.����;

import java.util.ArrayList;

public class E˫ջ���� {
	/*
	 * ����һ��ջ����ջ��������Ҫ��ֻ������һ������ջ
	 * ������ջΪ�ջ��߸���ջջ��Ԫ��С��ԭջջ��Ԫ�أ���ԭջԪ�ص���������ջ
	 * ������ջջ��Ԫ�ش���ԭջջ��Ԫ�أ��򽫸���ջԪ�ص�����ԭջ
	 */
	public static ArrayList<Integer> twoStacksSort(int[] numbers) {
        if(numbers.length<=0)
        	return null;
        int[] help=new int[numbers.length];
        int i=0;
        int j=numbers.length;
        int temp;
        while(i<numbers.length){
        	temp=numbers[i++];
        	if(j==numbers.length){
        		help[--j]=temp;
        	}else if(temp<=help[j]){
        		help[--j]=temp;
        	}else if( temp>help[j]){
        		while(j<numbers.length && temp>help[j]){
        			numbers[--i]=help[j++];
        		}
        		help[--j]=temp;
        	}
        }
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int k = 0; k < help.length; k++) {
			list.add(help[k]);
		}
        return list;
    }
	
	public static void main(String[] args) {
		int[] a={1,6,3,9,2,78,12,7,6,4,4};
		ArrayList<Integer> list=twoStacksSort(a);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
