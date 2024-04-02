package reversearr;
//212 check the number palindrome and sum the palindrome result and find the fibonaccii series with that sum as a range
public class Logic1 {
	public static void main(String[] args) {
		int sum=0;
		int no=212;
		int copy=no;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			
			
		}
		if(copy==rev)
		{
			System.out.println("Its a Palindrome number");
			
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
		
		while(rev!=0)
		{
			int rem2=rev%10;
			sum=sum+rem2;
			rev=rev/10;
			
		}
		System.out.println(sum);
		
		int fib1=0;
		int fib2=1;
		System.out.print(fib1 + "" + fib2);
		for(int i=1;i<=sum;i++)
		{
			int fib3=fib1+fib2;
			System.out.print("" + fib3);
			fib1=fib2;
			fib2=fib3;
			
			
		}
	}

}
