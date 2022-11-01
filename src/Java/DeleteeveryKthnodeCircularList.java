/*

 class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static void printList(Node head)
{
    if (head == null)
        return;
    Node temp = head;
    do
    {
        System.out.print( temp.data + "->");
        temp = temp.next;
    }
    while (temp != head);
    System.out.println(head.data );
}
static Node deleteK(Node head, int k){
//Enter your code here
if (head == null)
        return null;
 
    // take two pointers - current and previous
    Node curr = head, prev=null;
    while (true)
    {
 
        // Check if Node is the only Node\
        // If yes, we reached the goal, therefore
        // return.
        if (curr.next == head && curr == head)
            break;
 
        // Print intermediate list.
        printList(head);
 
        // If more than one Node present in the list,
        // Make previous pointer point to current
        // Iterate current pointer k times,
        // i.e. current Node is to be deleted.
        for (int i = 0; i < k; i++)
        {
            prev = curr;
            curr = curr.next;
        }
 
        // If Node to be deleted is head
        if (curr == head)
        {
            prev = head;
            while (prev.next != head)
                prev = prev.next;
            head = curr.next;
            prev.next = head;
        }
 
        // If Node to be deleted is last Node.
        else if (curr.next == head)
        {
            prev.next = head;
        }
        else
        {
            prev.next = curr.next;
        }
    }
    return head;
}