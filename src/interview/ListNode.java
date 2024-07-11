package interview;

import algorithm.day2.LeetCode24;

public class ListNode {
    public ListNode head;
    public ListNode next;
    private int i;


    public ListNode(int i) {
        this.i = i;
    }

    public ListNode(int i, ListNode head) {
        this.i = i;
        this.head = head;
    }

    public void add(int data) {
        ListNode listNode = new ListNode(data);
        if (head == null) {
            head = listNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = listNode;
        }
    }
}
