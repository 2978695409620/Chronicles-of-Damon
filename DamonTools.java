
import java.io.*;

public class DamonTools {
	public static int validInput(int choice, int max, int min) throws IOException
	{
		int newChoice = choice;
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        
		boolean valid = false;
		
		while (!valid)
		{
			if (newChoice >= min && newChoice <= max)
			{
				valid = true;
			}
			else
			{
				System.out.println("Please enter a valid intput: ");
				newChoice = Integer.parseInt(r.readLine());
			}
		}
		return newChoice;
	}
	
	public static boolean Edward()
	{
		double proc = Math.random();
		if (proc < 0.2)
			return true;
		else
			return false;
	}
}
