
public class DamonReport {
	
	public static void GenerateReport()
	{
		System.out.println("The term is finally done! Lets see how Damon did this term.");
		DamonMarksReport();
		DamonGamingReport();
		DamonSportsReport();
	}
	
	public static void DamonMarksReport()
	{
		System.out.println("Damon's final exam mark is: " + DamonStats.Final);
		System.out.println("Damon's midterm exam mark is: " + DamonStats.Midterm);
		System.out.println("Damon's final mark for the term is: " + (DamonStats.Final* 0.75 + DamonStats.Midterm * 0.25));
	}
	
	 public static void DamonGamingReport () 
	    {
	       int low = 60;
	       int mid = 210;
	       int max = 385;

	       if (DamonStats.LeagueSkills == 0)
	           System.out.println ("Damon sucks at League. Why does he even have the game on his computer?");
	       else if (DamonStats.LeagueSkills <= low)
	           System.out.println ("Despite his best efforts, Damon is still stuck in Bronze League.");
	       else if (DamonStats.LeagueSkills <= mid)
	           System.out.println ("Damon is a decent summoner. A well balance of study and play time.");
	       else if (DamonStats.LeagueSkills > mid)
	           System.out.println ("Damon's skill is above average. The same cannot be said for his grades");
	       else if (DamonStats.LeagueSkills == max)
	           System.out.println ("Why is Damon still in Waterloo? He should join an LCS team.");
	           
	       if (DamonStats.OsuSkills == 0)
	           System.out.println ("Damon sucks at Osu. Why does he even have the game on his computer?");
	       else if (DamonStats.OsuSkills <= low)
	           System.out.println ("Despite his best efforts, Damon cannot clear a three-star map.");
	       else if (DamonStats.OsuSkills <= mid)
	           System.out.println ("Damon is a decent player. A well balance of study and play time.");
	       else if (DamonStats.OsuSkills > mid)
	           System.out.println ("Damon's skill is above average. The same cannot be said for his grades");
	       else if (DamonStats.OsuSkills == max)
	           System.out.println ("Why is Damon still in Waterloo? He should be representing Canada in the Osu Worldcup.");
	       
	       if (DamonStats.StarCraftSkills == 0)
	           System.out.println ("Damon sucks at StarCraft. Why does he even have the game on his computer?");
	       else if (DamonStats.StarCraftSkills <= low)
	           System.out.println ("Despite his best efforts, Damon is unable to clear the Normal Campaign.");
	       else if (DamonStats.StarCraftSkills <= mid)
	           System.out.println ("Damon is a decent player. A well balance of study and play time.");
	       else if (DamonStats.StarCraftSkills > mid)
	           System.out.println ("Damon's micro/macro is above average. The same cannot be said for his grades");
	       else if (DamonStats.StarCraftSkills == max)
	           System.out.println ("Why is Damon still in Waterloo? Damon should be playing against the best Koreans.");
	       
	       if (DamonStats.CounterStrikeSkills == 0)
	           System.out.println ("Damon sucks at CounterStrike. Why does he even have the game on his computer?");
	       else if (DamonStats.CounterStrikeSkills <= low)
	           System.out.println ("Despite his best efforts, Damon is stuck in Silver III.");
	       else if (DamonStats.CounterStrikeSkills <= mid)
	           System.out.println ("Damon is a decent player. A well balance of study and play time.");
	       else if (DamonStats.CounterStrikeSkills > mid)
	           System.out.println ("Damon's accuracy and reaction is above average. The same cannot be said for his grades");
	       else if (DamonStats.CounterStrikeSkills == max)
	           System.out.println ("Why is Damon still in Waterloo? He should be playing competitively at the professional level.");
	       
	       if (DamonStats.RandomGameSkills == 0)
	           System.out.println ("Damon does not enjoy spending time with Edward.");
	       else if (DamonStats.RandomGameSkills <= low)
	           System.out.println ("Damon occasionally play random games with his friend, Edward.");
	       else if (DamonStats.RandomGameSkills <= mid)
	           System.out.println ("Damon really enjoys the company of Edward.");
	       else if (DamonStats.RandomGameSkills > mid)
	           System.out.println ("Damon spends a great deal of time with Edward. Onlookers may question his sexuality.");
	       else if (DamonStats.RandomGameSkills == max)
	           System.out.println ("Damon's sexuality is no longer a question. The answer is clear to all.");
	    }
	 

	     public static void DamonSportsReport()
	     {

	         int overPowered = 820;
	         int heavyWeight = 600;
	         int mediumWeight = 400;
	         int lightWeight = 200;

	         int maxChest = 840;
	         int bigChest = 300;
	         int smallChest = 50;

	         int maxBack = 820;

	         int maxLegs = 1150;
	         int bigLegs = 400;
	         int smallLegs = 50;

	         int maxBiceps = 400;
	         int bigBiceps = 90;
	         int smallBiceps = 20;

	         int maxShoulders = 820;
	         int bigShoulders = 300;
	         int smallShoulders = 60;

	         System.out.println ("Damon's Strenth Stats");
	         System.out.println ("Biceps: " + DamonStats.Biceps);
	         System.out.println ("Chest: " + DamonStats.Chest);
	         System.out.println ("Legs: " + DamonStats.Legs);
	         System.out.println ("Back: " + DamonStats.Back);
	         System.out.println ("Shoulders: " + DamonStats.Shoulders);

	         if ((DamonStats.Biceps + DamonStats.Chest + DamonStats.Back +
	                     DamonStats.Legs + DamonStats.Shoulders + DamonStats.Triceps) > overPowered)
	         {
	             System.out.println ("Damon has done nothing but go to the gym, his gigantic muscles scare all the ladies away");
	             if (DamonStats.Legs > maxLegs)
	             {
	                 System.out.println ("Damon has gigantic legs and often runs on the highway");
	             }
	             else if (DamonStats.Legs > bigLegs)
	             {
	                 System.out.println ("Damon has big legs and likes chasing squirrels");
	             }
	             else
	             {
	                 System.out.println ("Damon has broken his legs due to his upper body size.");
	             }
	             if (DamonStats.Biceps > maxBiceps)
	             {
	                 System.out.println ("Damon has over trained his biceps, he is no longer able to wear t-shirts");
	             }
	             else if (DamonStats.Biceps < smallBiceps)
	             {
	                 System.out.println ("Damon's biceps are extremely small, he now goes by the nickname peanut arms");
	             }
	         }

	         else if ((DamonStats.Biceps + DamonStats.Chest + DamonStats.Back +
	                     DamonStats.Legs + DamonStats.Shoulders + DamonStats.Triceps) > heavyWeight)
	         {
	             System.out.println ("Damon has trained hard throughout the semester, he failed his semester but has big muscles.");
	         }

	         else if ((DamonStats.Biceps + DamonStats.Chest + DamonStats.Back +
	                     DamonStats.Legs + DamonStats.Shoulders + DamonStats.Triceps) > mediumWeight)
	         {
	             System.out.println ("Damon has trained consistently throughout the semester, he has achieved medium weight status.");
	         }

	         else if ((DamonStats.Biceps + DamonStats.Chest + DamonStats.Back +
	                     DamonStats.Legs + DamonStats.Shoulders + DamonStats.Triceps) > lightWeight)
	         {
	             System.out.println ("Damon has somewhat trained throughout the semester, he has achieved lightweight status");
	         }
	         else
	         {
	             System.out.println ("Damon has not train during his semester, and is weak like poop");
	         }
	     }
	 
}
