static void isPalindrome(int N)
	{
	   // Your code here
	   int r,sum=0,temp;    
	   temp=N;    
			while(N>0){    
			r=N%10;  //getting remainder  
			sum=(sum*10)+r;    
			N=N/10;    
			} 
			if(temp==sum)    
				System.out.println("True");    
				else    
				System.out.println("False");    
}