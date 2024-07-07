package algorithm.day2;

public class LeetCode24 {

    static class ListNode{
        int val;
        ListNode next;

        public ListNode head = null;
        public ListNode tail = null;

        ListNode(){

        }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public void add(int data){
            ListNode listNode = new ListNode(data);
            if(head == null){
               head = listNode;
            } else {
                ListNode current = head;
                while(current.next != null){
                    current = current.next;
                }
                current.next = listNode;
            }
        }

        public void printList(){
            ListNode current = head;
            while(current != null){
                System.out.print(current.val + "");
                current = current.next;
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.add(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        listNode.printList();
        LeetCode24 leetCode24 = new LeetCode24();
        leetCode24.swapPairs(listNode);

    }

    private ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        newHead.printList();
        return newHead;
    }
}
