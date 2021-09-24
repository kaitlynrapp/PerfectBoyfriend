
public class PerfectBoyfriend
	{
		public static void main(String[] args)
			{
				ideaPerfect myBf = new ideaPerfect("Max", 10, true);
				ideaPerfect sarasBf = new ideaPerfect("Jeremy", 4, false);
				
				System.out.println("My Boyfriends name is " + myBf.name + ".");
				System.out.println("Sara's first boyfriend name is " + sarasBf.name + ".");
				
				if (myBf.scaleHot > 9 || sarasBf.scaleHot >9)
					{
						
						System.out.println("Your boyfriend is hot.");
					}
				else 
					{
						System.out.println("Your boyfriend is not hot.");
					}
			}
	}
