package Logics;

public class Logic2 {
	public static void main(String[] args) {
		int no=20;
		int fact=1;
		int sum=0;
		if(no%2==0)
		{
			for(int i=no;i>=1;i--)
			{
				fact=fact*i;
				
			}
			
		}
		else if(no%2==1)
		{
			sum=sum+no;
			
		}
		System.out.println(fact);
		System.out.println(sum);
	}

}
