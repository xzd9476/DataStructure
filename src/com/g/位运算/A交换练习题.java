package com.g.λ����;

public class A������ϰ�� {
	public int[] getSwap(int[] num) {
		/*
		 * ����һ������num�����а�������ֵ���벻���κζ����������������ֵ����������������鷵�ء�
		 */
        int a=num[0];
        int b=num[1];
        
        
        a=a^b;
        b=a^b;
        a=a^b;
        
        num[0]=a;
        num[1]=b;
        return num;
    }

}
