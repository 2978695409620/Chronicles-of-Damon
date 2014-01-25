import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DamonWeek {
	

	static String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	static boolean GoHome = true;
	
	public static void Week() throws IOException
	{
		int days = 0;
		while (days < 7)
		{
			boolean Edward = false;
			if (DamonTools.Edward())
			{
				Edward = true;
			}
				
			if ((days == 0 || days == 2 || days == 4) && !Edward)
			{
				System.out.println("Today is " + day[days]);
				days ++;
				MWF();
			}
			else if ((days == 1 || days == 3) && !Edward)
			{
				System.out.println("Today is " + day[days]);
				days++;
				TH();
			}
			else if ((days == 5 || days == 6) && !Edward)
			{
				System.out.println("Today is " + day[days]);
				days++;
				if (GoHome)
					SSHome();
				else
					SS();
			}
			else
			{
				System.out.println("Edward played games throughout the night, and Damon didn't get any sleep.");
				System.out.println("Damon was so tired he couldn't do anything today.");
				days++;
			}
		}
	}

	public static void MWF() throws IOException{
		int timeblock = 5;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (timeblock > 0){
			System.out.println("What would you like to do right now?");
			if (timeblock >= 3)
			{
				System.out.println("1. Go to class (not likely)");
				System.out.println("2. Go workout at the Gym");
				System.out.println("3. Play games at home");
				System.out.println("4. Sleep (what you always do anyways)");
				System.out.println("Damon would like to choose option: ");
				int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 4, 1);
				
				if (choice == 1){
					DamonStats.Knowledge ++;
					DamonActions.CLASS();
				}
				
				else if (choice == 2)
					DamonActions.Gym();
				
				else if (choice == 3)
				{
					DamonActions.GAMING();
				}
				
				else {
					System.out.println("Damon slept through the day. He did not get to do anything.");
					timeblock = 0;
				}
					
			}
			else
			{
				System.out.println("1. Go workout at the Gym");
				System.out.println("2. Play games at home");
				System.out.println("3. Sleep (what you always do anyways)");
				int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 3, 1);
				
				if (choice == 1)
				{
					DamonActions.Gym();
				}
				
				else if (choice == 2)
				{
					DamonActions.GAMING();
				}
				
				else {
					System.out.println("Damon slept through the day. He did not get to do anything.");
					timeblock = 0;
				}
			}
		}
			
	}
	
	public static void TH() throws IOException{
		int timeblock = 5;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (timeblock > 0){
			System.out.println("What would you like to do right now?");
			if (timeblock > 3)
			{
				System.out.println("1. Go to class (not likely)");
				System.out.println("2. Go workout at the Gym");
				System.out.println("3. Play games at home");
				System.out.println("4. Sleep (what you always do anyways)");
				System.out.println("Damon would like to choose option: ");
				int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 4, 1);
				
				if (choice == 1){
					DamonStats.Knowledge ++;
					DamonActions.CLASS();
				}
				
				else if (choice == 2)
					DamonActions.Gym();
				
				else if (choice == 3)
				{
					DamonActions.GAMING();
				}
				
				else {
					System.out.println("Damon slept through the day. He did not get to do anything.");
					timeblock = 0;
				}
					
			}
			else
			{
				System.out.println("1. Go workout at the Gym");
				System.out.println("2. Play games at home");
				System.out.println("3. Sleep (what you always do anyways)");
				int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 3, 1);
				
				if (choice == 1)
				{
					DamonActions.Gym();
				}
				
				else if (choice == 2)
				{
					DamonActions.GAMING();
				}
				
				else {
					System.out.println("Damon slept through the day. He did not get to do anything.");
					timeblock = 0;
				}
			}
			
		}
			
	}
	
	public static void SS() throws IOException{
		int timeblock = 5;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (timeblock > 0){
			System.out.println("What would you like to do right now?");
			if (timeblock >= 3)
			{
				System.out.println("1. Study");
				System.out.println("2. Go workout at the Gym");
				System.out.println("3. Play games at home");
				System.out.println("4. Sleep (what you always do anyways)");
				System.out.println("Damon would like to choose option: ");
				int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 4, 1);
				
				if (choice == 1){
					System.out.println("");
					DamonStats.Knowledge ++;
					DamonActions.CLASS();
				}
				
				else if (choice == 2)
					DamonActions.Gym();
				
				else if (choice == 3)
				{
					DamonActions.GAMING();
				}
				
				else {
					System.out.println("Damon slept through the day. He did not get to do anything.");
					timeblock = 0;
				}
					
			}
			else
			{
				System.out.println("1. Go workout at the Gym");
				System.out.println("2. Play games at home");
				System.out.println("3. Sleep (what you always do anyways)");
				int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 3, 1);
				
				if (choice == 1)
				{
					DamonActions.Gym();
				}
				
				else if (choice == 2)
				{
					DamonActions.GAMING();
				}
				
				else {
					System.out.println("Damon slept through the day. He did not get to do anything.");
					timeblock = 0;
				}
			}
		}	
	}
	
	public static void SSHome() throws IOException{
		int timeblock = 5;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (timeblock > 0){
			System.out.println("What would you like to do right now?");
			
			
			System.out.println("1. Go workout at the Gym");
			System.out.println("2. Play games at home");
			System.out.println("3. Sleep (what you always do anyways)");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 3, 1);
				
			if (choice == 1)
			{
				DamonActions.Gym();
			}
				
			else if (choice == 2)
			{
				DamonActions.GAMING();
			}
				
			else {
				System.out.println("Damon slept through the day. He did not get to do anything.");
				timeblock = 0;
			}	
		}
	}	
}
	

