package com.b.�ַ���;

import java.util.HashMap;
import java.util.Map;

public class H����ظ��ַ��Ӵ� {
	/*
	 * �ҵ��ַ���������ظ��ַ����ִ�����
	 */
	
	public static int longestSubstring(String A, int n) {
		if(n<=0 || A==null)
			return 0;
		
        Map<Character, Integer> map=new HashMap<Character, Integer>();
        int pre_index=-1;//�ַ�i��ǰһ���ַ�i-1���ϴγ��ֵ�λ��
        int temp=0;
        int max=0;
        map.put(A.charAt(0),0);
        for(int i=1;i<n;i++){
        	char ch=A.charAt(i);
        	int cur;
        	if(map.get(ch) !=null){
        		cur=map.get(ch);
        	}else{
        		cur=-1;
        	}
        	
        	if(pre_index > cur){
        		temp=i-pre_index;
        	}else{
        		temp=i-cur;
        		pre_index=cur;
        	}
        	
        	map.put(ch, i);
        	max=Math.max(max, temp);
        }
        return max;
        
    }
	
	public static void main(String[] args) {
		System.out.println(longestSubstring("abcdefg",7));
	}

}
