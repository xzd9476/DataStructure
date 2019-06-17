package com.g.位运算;

public class A交换练习题 {
	public int[] getSwap(int[] num) {
		/*
		 * 给定一个数组num，其中包含两个值，请不用任何额外变量交换这两个值，并将交换后的数组返回。
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
