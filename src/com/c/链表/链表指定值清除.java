package com.c.链表;

public class 链表指定值清除 {
	/*
	 * 给定一个单链表，和一个整数val，要求将链表中所有等于val的节点删掉
	 */
	
	public static class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val){
			this.val=val;
		}
	}
	
	public ListNode clear(ListNode head, int val) {
        ListNode node=new ListNode(-1);
        ListNode nodeHead=node;
        while(head!=null){
        	if(head.val!=val){
        		node.next=head;
        		node=node.next;
        	}
        	head=head.next;
        }
        return nodeHead.next;
    }

}
