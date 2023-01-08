package assignment1.day1;

public class IsPrime {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int n=9;
		boolean result=false;

		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0) {
				result=true;
				break;
			}
		}
			if(!result)
		
			{
				System.out.println(n+" is a prime number");
				
			}
			else
			{
				System.out.println(n+ " is not a prime number");
			}
		}
		 

		 
	}

