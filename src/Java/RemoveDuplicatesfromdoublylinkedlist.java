/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
  public static Node deleteDuplicates(Node head) {
//complete this function
     if(head == null || head.next == null)
     return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
}