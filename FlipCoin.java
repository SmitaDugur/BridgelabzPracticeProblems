package BasicProgram;

public class FlipCoin {

	public static void main(String[] args) {
		int numOfFlips = 10;
		int heads = 0;
		int tails = 0;
		for (int s=0; s<numOfFlips; s++)
		{
			if (Math.random() <0.5)
		{
			heads++;
			double percentageOfHeads = (heads*100)/numOfFlips;
			double percentageOfTails = 100-percentageOfHeads ;
			System.out.println("percentage of heads : " + percentageOfHeads);
			System.out.println("percentage of tails : " + percentageOfTails);
		}
		}
	}

}