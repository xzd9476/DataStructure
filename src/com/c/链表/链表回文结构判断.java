package com.c.����;

import java.util.Stack;

public class ������Ľṹ�ж� {
	/*
	 * ����һ������ �ж��Ƿ��ǻ��Ľṹ ���1,2,3,2,1������true
	 * ����������һ����ָ���һ����ָ�룬��ָ��һ����һ����㣬��ָ��һ������������stack������ָ��ָ��Ľ��
	 * ��������ڵ����ż��
	 */
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static boolean isPalindrome(ListNode pHead) {
		if (pHead == null)
			return false;
		ListNode flagOne = pHead;
		ListNode flagTwo = pHead;
		Stack<Integer> stack = new Stack<Integer>();
		while(flagTwo!=null && flagTwo.next!=null){//������flagTwo.next==null  ż��:flagTwo==null
			stack.push(flagOne.val);
			flagOne=flagOne.next;
			flagTwo=flagTwo.next.next;
		}
		boolean flag=true;
		while(!stack.isEmpty()){
			int val=stack.pop();
			if(flagTwo==null){//˵����ż��
				if(val!=flagOne.val)
					flag=false;
			}else{//����
				if(val!=flagOne.next.val)
					flag=false;
			}
			flagOne=flagOne.next;
		}
		return flag;
	}

}
