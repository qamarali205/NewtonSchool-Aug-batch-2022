static void push_back_pb(Deque<Integer> dq, int x)
{
         //Your code
         dq.addLast(x);
 }
 static void push_front_pf(Deque<Integer> dq, int x)
 {
         // Your code here
         dq.addFirst(x);
 }
 static void pop_back_ppb(Deque<Integer> dq)
 {
        // Your code here
         dq.pollLast();


 }
static int front_dq(Deque<Integer> dq)
{
         // Your code here
         if(dq.isEmpty()){
                return -1;
        }
         int z = dq.peek();
         return z;

}