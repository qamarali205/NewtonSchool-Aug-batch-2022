static void circularRotate(Deque<Integer> deq, int d, int n)
{
        // Your code here 
        int r = d-n;
        int i = 0;
        while(i < d){
                int removeElement = deq.peekLast();
                deq.removeLast();
                deq.addFirst(removeElement);
                i++;
        }
        
 }