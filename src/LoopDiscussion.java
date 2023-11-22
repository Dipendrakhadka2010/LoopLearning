import java.util.Scanner;

public class LoopDiscussion {

	
	
	public void PrimeNumber()
	{
		Scanner scObj = new Scanner(System.in);
		System.out.println("Find prime number");
		Boolean ifPrimevalue = true;
		int StartNumber = 700;
		int EndNumber = 7000;
		for(int i=1; i<=EndNumber; i++) 
		{
			if(EndNumber % i == 0) 
			{
				ifPrimevalue = false;
				System.out.println("it is not a prime number");
			}
			if((i+1)==EndNumber) 
			{
				if (ifPrimevalue==true)
				{
					System.out.println("it is a prime number");
				}
				
			}
		}
		
	}
	
		
	}

