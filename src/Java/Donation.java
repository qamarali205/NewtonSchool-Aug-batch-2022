import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Donation {
	public static void main (String[] args) {
                      // Your code here
					  Scanner s=new Scanner(System.in);
					  int n=s.nextInt();

					  int donation[]=new int[n];
					  for(int i=0; i<n; i++)
					 donation[i]=s.nextInt();

					  long max=0, sum=0;
					  for(int i=0; i<n; ++i){
						  if(donation[i]>max){
							  max=donation[i];
							  System.out.print(0+" ");
						  }else{
							  System.out.print(max-donation[i]+" ");
						  }
						  sum+=max;
					  }
					  System.out.println("\n"+sum);
	}
}