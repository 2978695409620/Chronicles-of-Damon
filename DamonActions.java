import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DamonActions {
	public static void Gym() throws IOException{
		int timeblock = 3;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (timeblock > 0){
			System.out.println("Damon is at the Gym. What exercise would Damon like to do?");
			{
				System.out.println("1. Bench");
				System.out.println("2. Deadlift");
				System.out.println("3. Squat");
				System.out.println("4. BicepCurls");
				System.out.println("5. Military");
				System.out.println("Damon would like to choose option: ");
				int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 5, 1);
				
				if (choice == 1)
				{
					System.out.println("Damon has benched 10 reps.");
					DamonStats.Chest += 2;
					DamonStats.Triceps += 1;
				}
				
				else if (choice == 2)
				{
					System.out.println("Damon has deadlifted 6 reps.");
					DamonStats.Back += 2;
					DamonStats.Legs += 1;
				}
				
				else if (choice == 3)
				{
					System.out.println("Damon performed squat for 8 reps.");
					DamonStats.Legs += 3;
				}
				
				else if (choice == 4)
				{
					System.out.println("Damon curled 12 reps.");
					DamonStats.Biceps += 1;
				}
				
				else
				{
					System.out.println("Damon did 7 reps of military.");
					DamonStats.Shoulders += 2;
				}
				
				timeblock -= 1;
			}
		}
	}
	
	public static void CLASS(){
		double i = Math.random();
		if (i < 0.33)
			System.out.println("Even though Damon slept through class, he obtained notes from his good friends Nan, Kevin, and David.");
		else if (i < 0.66)
			System.out.println("Damon slept through the class, but he somehow feels like he reached an epiphany, and thus learned the material anyways. (We don't know how either)");
		else
			System.out.println("Surprisingly Damon took notes today, and managed to learn the material covered in class (atleast that's what we think).");
	}
	
	public static void GAMING() throws IOException{
		int timeblock = 1;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (timeblock > 0){
			System.out.println("What would Damon like to play right now?");
			{
				System.out.println("1. League of Legends");
				System.out.println("2. Starcraft 1 or 2");
				System.out.println("3. Osu");
				System.out.println("4. CounterStrike");
				System.out.println("5. Some Random game with Edward");
				System.out.println("Damon would like to choose option: ");
				int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 5, 1);
				
				if (choice == 1)
				{
					System.out.println("Damon fed on team quite badly and ragequit. However, he did learn from his mistakes.");
					DamonStats.LeagueSkills += 1;
				}
				
				else if (choice == 2)
				{
					System.out.println("Damon played 1vs1 with Nan in Starcraft. Needless to say he lost badly.");
					DamonStats.StarCraftSkills += 1;
				}
				
				else if (choice == 3)
				{
					System.out.println("Damon played Osu for hours. However, his rank is still below Nan's.");
					DamonStats.OsuSkills += 1;
				}
				
				else if (choice == 4)
				{
					System.out.println("Damon played CounterStrike, the only game he is good at.");
					DamonStats.CounterStrikeSkills += 1;
				}
				
				else
				{
					System.out.println("Edward invited Damon to play a new game. Damon did not particularly like it, so Edward flipped him.");
					DamonStats.RandomGameSkills += 1;
				}
				
				timeblock -= 1;
			}
		}
	}
}
