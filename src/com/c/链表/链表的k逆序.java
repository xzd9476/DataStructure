package com.c.����;

import java.util.Stack;

public class �����k���� {
	/*
	 * ����һ��������0��ʼ��ÿK���ڵ���������󲻹�k���ڵ㣬�򲻱ص���
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
	        //��ʱcurΪ��k+1���ڵ�
	        if(count==k) {
	            cur = inverse(cur,k);
	            while(count-- >0) {
	                ListNode tmp = head.next;
	                head.next = cur;
	                cur = head;
	                head = tmp;
	            }
	            //curΪ��ת��ĵ�һ���ڵ�
	            head = cur;
	        }
	        return head;
	    }

}
