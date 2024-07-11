package interview;

import algorithm.day2.LeetCode24;

import java.util.List;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 示例 1：
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 */
public class RemoveNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(0, head);
        int length = getLengthListNode(head);
        ListNode current = listNode;
        for (int i = 1; i < length - n + 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        ListNode newHead = head.next;
        return newHead;
    }


    private int getLengthListNode(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static void main(String[] args) {
        RemoveNode removeNode = new RemoveNode();
        ListNode listNode = new ListNode(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        listNode.add(5);
        removeNode.removeNthFromEnd(listNode, 2);
        System.out.println(listNode);
    }
}
