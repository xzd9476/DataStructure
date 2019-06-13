package com.c.链表;

import java.util.Stack;

public class 链表的k逆序 {
	/*
	 * 给定一个链表，从0开始，每K个节点逆序，若最后不够k个节点，则不必调整
	 */
	
	public static class ListNode{
		int val;
		ListNode next=null;
		public ListNode(int val){
			this.val=val;
		}
	}
	
	 public ListNode inverse(ListNode head, int k) {
	        ListNode cur = head;
	        int count = 0;
	        while(cur!=null && count!=k) {
	            cur = cur.next;
	            count++;
	        }
	        //此时cur为第k+1个节点
	        if(count==k) {
	            cur = inverse(cur,k);
	            while(count-- >0) {
	                ListNode tmp = head.next;
	                head.next = cur;
	                cur = head;
	                head = tmp;
	            }
	            //cur为翻转后的第一个节点
	            head = cur;
	        }
	        return head;
	    }

}
