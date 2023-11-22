
public class TableNumberseries
  {
	public void TableNumber() 
	{
		int StartTableNumber = 25;
		int EndTableNumber = 35;
		
		for(int i=StartTableNumber; i<=EndTableNumber; i++ ) 
		{
			for(int j=1; j<=10; j++)
			{
				
				int mulValue = i * j;
				System.out.println(i + " * " + j + " = " + mulValue);
			}
		}
	}
	






  }


