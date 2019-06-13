package com.c.链表;

import com.c.链表.环形链表插入.ListNode;

public class 单链表中某个结点的删除 {
	/*
	 * 删除单链表中某个结点，但是只给出当前结点，不给出头结点
	 */
	public static class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val){
			this.val=val;
		}
	}
	
	//给定待删除的头节点和要删除的数字，请执行删除操作，返回删除后的头结点。链表中没有重复数字
	public ListNode removeNode(ListNode pNode, int delVal) {
		if(pNode == null)
			return null;
		if(pNode.val==delVal)
			return pNode.next;
		
		ListNode preNode=pNode;
		ListNode nxtNode=preNode.next;
		
		while(nxtNode.val!=delVal){
			preNode=nxtNode;
			nxtNode=nxtNode.next;
		}
		
		if(nxtNode!=null){
			preNode.next=nxtNode.next;
		}
		return pNode;
    }

}
