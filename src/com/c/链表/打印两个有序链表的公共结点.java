package com.c.����;

import java.util.ArrayList;
import java.util.List;

public class ��ӡ������������Ĺ������ {
	/*
	 * ����������������������ṹ���ع�����㣬����֤��������
	 */

	public static class ListNode {
		int val;
		ListNode next = null;

		public ListNode(int val) {
			this.val = val;
		}
	}

	public int[] findCommonParts(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		List<Integer> list = new ArrayList<Integer>();
		while (headA != null && headB != null) {
			if (headA.val > headB.val) {
				headB = headB.next;
			}else if (headA.val < headB.val) {
				headA = headA.next;
			}else if (headA.val == headB.val) {
				list.add(headA.val);
				headA = headA.next;
				headB = headB.next;
			}
		}
		int[] a = new int[list.size()];
		int i = 0;
		for (Integer integer : list) {
			a[i++] = integer;
		}
		return a;
	}
}
