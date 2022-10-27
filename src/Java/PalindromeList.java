/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public static boolean IsPalindrome(Node head) {
//enter your code here
     if(head == null || head.next == null){
            return true;
        }

        // find middle point
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse 2nd half of linked list
        Node prev = null;
        Node curr = slow;
        while (curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // palindrome checking : first half and second half
        Node left = head;
        Node right = prev;
        while (right != null){
            if (left.val != right.val){
                return false;
            }else {
                left = left.next;
                right = right.next;
            }
        }

        return true;
}