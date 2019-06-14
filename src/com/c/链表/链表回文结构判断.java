package com.c.链表;

import java.util.Stack;

public class 链表回文结构判断 {
	/*
	 * 给定一个链表 判断是否是回文结构 如｛1,2,3,2,1｝返回true
	 * 方案：设置一个慢指针和一个快指针，慢指针一次跳一个结点，快指针一次跳两个，用stack保存慢指针指向的结点
	 * 考虑链表节点的奇偶性
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
		while(flagTwo!=null && flagTwo.next!=null){//奇数：flagTwo.next==null  偶数:flagTwo==null
			stack.push(flagOne.val);
			flagOne=flagOne.next;
			flagTwo=flagTwo.next.next;
		}
		boolean flag=true;
		while(!stack.isEmpty()){
			int val=stack.pop();
			if(flagTwo==null){//说明是偶数
				if(val!=flagOne.val)
					flag=false;
			}else{//奇数
				if(val!=flagOne.next.val)
					flag=false;
			}
			flagOne=flagOne.next;
		}
		return flag;
	}

}
