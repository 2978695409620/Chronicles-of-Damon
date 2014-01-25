import java.io.*;

public class Math135 {
	

	public static void Math135Semester() throws IOException
	{
		System.out.println("Damon decides to take Math 135, Algebra. Damn he is brave.");
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		//Week 1
		DamonWeek.Week();
		DamonLearning.WeekOne();
		
		//Week 2
		DamonWeek.Week();
		DamonLearning.WeekTwo();
		
		//Week 3
		DamonWeek.Week();
		DamonLearning.WeekThree();
		
		//Week 4
		DamonWeek.Week();
		DamonLearning.WeekFour();
		
		//Midterm
		System.out.println("It is time for the Midterm. What will Damon do?");
		System.out.println("1. Skip the Midterm. It's only worth 25% anyways.");
		System.out.println("2. Write the Midterm like a good boy.");
		System.out.println("Damon decides to: ");
		int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 2, 1);
		
		if (choice == 2)
		{
		DamonExams.Midterm();
		if (DamonStats.Midterm > 50)
			System.out.println("Damon Passed! Not Bad!");
		else if (DamonStats.Midterm > 70)
			System.out.println("Damon did quite well!");
		else if (DamonStats.Midterm > 90)
			System.out.println("Holy crap Damon aced this exam!");
		else
			System.out.println("Damon needs to study more. He did not pass.");
		}
		
		else
		{
			System.out.println("Damon received a 0 on the Midterm for skipping it.");
		}
		
		//Week 5
		DamonWeek.Week();
		DamonLearning.WeekFive();
		
		//Week 6
		DamonWeek.Week();
		DamonLearning.WeekSix();
		
		//Week 7
		DamonWeek.Week();
		DamonLearning.WeekSeven();
		
		//Week 8
		DamonWeek.Week();
		DamonLearning.WeekEight();
		
		//Week 9
		DamonWeek.Week();
		DamonLearning.WeekNine();
		
		//Week 10
		DamonWeek.Week();
		DamonLearning.WeekTen();
		
		//Week 11
		DamonWeek.Week();
		DamonLearning.WeekEleven();		
		
		//Final
		System.out.println("It is time for the Final. What will Damon do?");
		System.out.println("1. Skip the Final. It's only worth 25% anyways.");
		System.out.println("2. Write the Final like a good boy.");
		System.out.println("Damon decides to: ");
		choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 2, 1);
				
		if (choice == 2)
		{
			DamonExams.Final();
			if (DamonStats.Final > 50)
				System.out.println("Damon Passed! Not Bad!");
			else if (DamonStats.Final > 70)
				System.out.println("Damon did quite well!");
			else if (DamonStats.Final > 90)
				System.out.println("Holy crap Damon aced this exam!");
			else
				System.out.println("Damon needs to study more. He did not pass.");
		}
				
		else
		{
			System.out.println("Damon received a 0 on the Final for skipping it.");
		}
	}
}
