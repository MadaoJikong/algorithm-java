package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject21
 * @projectName algorithm-java
 * @description: 21. 合并两个有序链表
 * @date 2020/10/12 13:57
 */
public class Subject21 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode node = result;
        while (true) {
            if (l1 == null) {
                node.next = l2;
                node = node.next;
                break;
            }
            if (l2 == null) {
                node.next = l1;
                node = node.next;
                break;
            }
            if (l1.val < l2.val) {
                node.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            node = node.next;
        }
        return result.next;
    }


    /**
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     *
     * @param args
     */
    public static void main(String[] args) {
        Subject21 subject21 = new Subject21();
        Subject21.ListNode l13 = subject21.new ListNode(4, null);
        Subject21.ListNode l12 = subject21.new ListNode(2, l13);
        Subject21.ListNode l1 = subject21.new ListNode(1, l12);

        Subject21.ListNode l23 = subject21.new ListNode(4, null);
        Subject21.ListNode l22 = subject21.new ListNode(3, l23);
        Subject21.ListNode l2 = subject21.new ListNode(1, l22);

        subject21.mergeTwoLists(l1, l2);
    }
}