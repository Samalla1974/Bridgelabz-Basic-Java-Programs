package basic_core_programs;

public class flip_coin
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int numofflips=10;
		int heads=0;
		int tails=0;
		for (int index=0;index <= numofflips;index++)
		{
			if (Math.random() < 0.5)
			{
				tails++;
			}
			 else
			 {
				heads++;		
			 }
		}
		double percentageoftails = (tails * 100)/numofflips;
		double percentageofheads = 100-percentageoftails;
		System.out.println("percentage of tails:" + percentageoftails);
		System.out.println("percentage of heads:" + percentageofheads);
	}

}
