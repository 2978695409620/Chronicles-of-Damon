import java.io.*;

public class DamonLearning {
	public static void WeekOne() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Truth Tables");
			System.out.println("2. Statements");
			System.out.println("3. DeMorgan's Law");
			System.out.println("4. Sets");
			System.out.println("5. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 5, 1);
			
			if (choice == 1 && !DamonMath135.TruthTables && DamonStats.Knowledge >= DamonMath135.TruthTablesPt)
			{
				DamonStats.Knowledge -= DamonMath135.TruthTablesPt;
				DamonMath135.TruthTables = true;
			}
			
			else if (choice == 2 && !DamonMath135.Statements && DamonStats.Knowledge >= DamonMath135.StatementsPt)
			{
				DamonStats.Knowledge -= DamonMath135.StatementsPt;
				DamonMath135.Statements = true;
			}
			
			else if (choice == 3 && !DamonMath135.DML && DamonStats.Knowledge >= DamonMath135.DMLPt)
			{
				DamonStats.Knowledge -= DamonMath135.DMLPt;
				DamonMath135.DML = true;
			}
			
			else if (choice == 4 && !DamonMath135.Sets && DamonStats.Knowledge >= DamonMath135.SetsPt)
			{
				DamonStats.Knowledge -= DamonMath135.SetsPt;
				DamonMath135.Sets = true;
			}
			
			else if (choice == 5)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}	
		}
	}
	
	
	public static void WeekTwo() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Transitivity and Divisibility");
			System.out.println("2. Divison of Integer Combination");
			System.out.println("3. Bounds by Divisbility");
			System.out.println("4. Division Algorithm");
			System.out.println("5. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 5, 1);
			
			if (choice == 1 && !DamonMath135.TD && DamonStats.Knowledge >= DamonMath135.TDPt)
			{
				DamonStats.Knowledge -= DamonMath135.TDPt;
				DamonMath135.TD = true;
			}
			
			else if (choice == 2 && !DamonMath135.DIC && DamonStats.Knowledge >= DamonMath135.DICPt)
			{
				DamonStats.Knowledge -= DamonMath135.DICPt;
				DamonMath135.DIC = true;
			}
			
			else if (choice == 3 && !DamonMath135.BBD && DamonStats.Knowledge >= DamonMath135.BBDPt)
			{
				DamonStats.Knowledge -= DamonMath135.BBDPt;
				DamonMath135.BBD = true;
			}
			
			else if (choice == 4 && !DamonMath135.DA && DamonStats.Knowledge >= DamonMath135.DAPt)
			{
				DamonStats.Knowledge -= DamonMath135.DAPt;
				DamonMath135.DA = true;
			}
			
			else if (choice == 5)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}	
		}
	}
	
	public static void WeekThree() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Principles of Mathematical Induction");
			System.out.println("2. Principles of Strong Induction");
			System.out.println("3. Binomial Theorem");
			System.out.println("4. Negation");
			System.out.println("5. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 5, 1);
			
			if (choice == 1 && !DamonMath135.POMI && DamonStats.Knowledge >= DamonMath135.POMIPt)
			{
				DamonStats.Knowledge -= DamonMath135.POMIPt;
				DamonMath135.POMI = true;
			}
			
			else if (choice == 2 && !DamonMath135.POSI && DamonStats.Knowledge >= DamonMath135.POSIPt)
			{
				DamonStats.Knowledge -= DamonMath135.POSIPt;
				DamonMath135.POSI = true;
			}
			
			else if (choice == 3 && !DamonMath135.BT && DamonStats.Knowledge >= DamonMath135.BTPt)
			{
				DamonStats.Knowledge -= DamonMath135.BTPt;
				DamonMath135.BT = true;
			}
			
			else if (choice == 4 && !DamonMath135.Negation && DamonStats.Knowledge >= DamonMath135.NegationPt)
			{
				DamonStats.Knowledge -= DamonMath135.NegationPt;
				DamonMath135.Negation = true;
			}
			
			else if (choice == 5)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}
		}
	}
	
	public static void WeekFour() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Uniqueness");
			System.out.println("2. Elimination");
			System.out.println("3. GCD With Remainders");
			System.out.println("4. GCD Characterization Theorem");
			System.out.println("5. Extended Euclidean Algorithm");
			System.out.println("6. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 6, 1);
			
			if (choice == 1 && !DamonMath135.Uniqueness && DamonStats.Knowledge >= DamonMath135.UniquenessPt)
			{
				DamonStats.Knowledge -= DamonMath135.UniquenessPt;
				DamonMath135.Uniqueness = true;
			}
			
			else if (choice == 2 && !DamonMath135.Elimination && DamonStats.Knowledge >= DamonMath135.EliminationPt)
			{
				DamonStats.Knowledge -= DamonMath135.EliminationPt;
				DamonMath135.Elimination = true;
			}
			
			else if (choice == 3 && !DamonMath135.GCDWR && DamonStats.Knowledge >= DamonMath135.GCDWRPt)
			{
				DamonStats.Knowledge -= DamonMath135.GCDWRPt;
				DamonMath135.GCDWR = true;
			}
			
			else if (choice == 4 && !DamonMath135.GCDCT && DamonStats.Knowledge >= DamonMath135.GCDCTPt)
			{
				DamonStats.Knowledge -= DamonMath135.GCDCTPt;
				DamonMath135.GCDCT = true;
			}
			
			else if (choice == 5 && !DamonMath135.EEA && DamonStats.Knowledge >= DamonMath135.EEAPt)
			{
				DamonStats.Knowledge -= DamonMath135.EEAPt;
				DamonMath135.EEA = true;
			}
			
			else if (choice == 6)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}	
		}
	}
	
	public static void WeekFive() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Coprimeness and Divisibility");
			System.out.println("2. Primes and Divisibility");
			System.out.println("3. GCD of One");
			System.out.println("4. Divisino by GCD");
			System.out.println("5. Linear Diophantine Equation Theorem 1");
			System.out.println("6. Linear Diophantine Equation Theorem 2");
			System.out.println("7. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 7, 1);
			
			if (choice == 1 && !DamonMath135.CAD && DamonStats.Knowledge >= DamonMath135.CADPt)
			{
				DamonStats.Knowledge -= DamonMath135.CADPt;
				DamonMath135.CAD = true;
			}
			
			else if (choice == 2 && !DamonMath135.PAD && DamonStats.Knowledge >= DamonMath135.PADPt)
			{
				DamonStats.Knowledge -= DamonMath135.PADPt;
				DamonMath135.PAD = true;
			}
			
			else if (choice == 3 && !DamonMath135.GCDOO && DamonStats.Knowledge >= DamonMath135.GCDOOPt)
			{
				DamonStats.Knowledge -= DamonMath135.GCDOOPt;
				DamonMath135.GCDOO = true;
			}
			
			else if (choice == 4 && !DamonMath135.DBGCD && DamonStats.Knowledge >= DamonMath135.DBGCDPt)
			{
				DamonStats.Knowledge -= DamonMath135.DBGCDPt;
				DamonMath135.DBGCD = true;
			}
			
			else if (choice == 5 && !DamonMath135.LDET1 && DamonStats.Knowledge >= DamonMath135.LDET1Pt)
			{
				DamonStats.Knowledge -= DamonMath135.LDET1Pt;
				DamonMath135.LDET1 = true;
			}
			
			else if (choice == 6 && !DamonMath135.LDET2 && DamonStats.Knowledge >= DamonMath135.LDET2Pt)
			{
				DamonStats.Knowledge -= DamonMath135.LDET2Pt;
				DamonMath135.LDET2 = true;
			}
			
			else if (choice == 7)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}	
		}
	}
	
	public static void WeekSix() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Congruence is an Equivalence Relation");
			System.out.println("2. Properties of Congruence");
			System.out.println("3. Congruences and Division");
			System.out.println("4. Congruence if and only if Same Remainder");
			System.out.println("5. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 5, 1);
			
			if (choice == 1 && !DamonMath135.CER && DamonStats.Knowledge >= DamonMath135.CERPt)
			{
				DamonStats.Knowledge -= DamonMath135.CERPt;
				DamonMath135.CER = true;
			}
			
			else if (choice == 2 && !DamonMath135.PC && DamonStats.Knowledge >= DamonMath135.PCPt)
			{
				DamonStats.Knowledge -= DamonMath135.PCPt;
				DamonMath135.PC = true;
			}
			
			else if (choice == 3 && !DamonMath135.CD && DamonStats.Knowledge >= DamonMath135.CDPt)
			{
				DamonStats.Knowledge -= DamonMath135.CDPt;
				DamonMath135.CD = true;
			}
			
			else if (choice == 4 && !DamonMath135.CISR && DamonStats.Knowledge >= DamonMath135.CISRPt)
			{
				DamonStats.Knowledge -= DamonMath135.CISRPt;
				DamonMath135.CISR = true;
			}
			
			else if (choice == 5)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}	
		}
	}
	
	public static void WeekSeven() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Fermat's Little Theorem");
			System.out.println("2. Inverse in ZP");
			System.out.println("3. Linear Congruence Theorem 1");
			System.out.println("4. Linear Congruence Theorem 2");
			System.out.println("5. Chinese Remainder Theorem");
			System.out.println("6  General Chinese Remainder Theorem");
			System.out.println("7. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 7, 1);
			
			if (choice == 1 && !DamonMath135.FlT && DamonStats.Knowledge >= DamonMath135.FlTPt)
			{
				DamonStats.Knowledge -= DamonMath135.FlTPt;
				DamonMath135.FlT = true;
			}
			
			else if (choice == 2 && !DamonMath135.INVZp && DamonStats.Knowledge >= DamonMath135.INVZpPt)
			{
				DamonStats.Knowledge -= DamonMath135.INVZpPt;
				DamonMath135.INVZp = true;
			}
			
			else if (choice == 3 && !DamonMath135.LCT1 && DamonStats.Knowledge >= DamonMath135.LCT1Pt)
			{
				DamonStats.Knowledge -= DamonMath135.LCT1Pt;
				DamonMath135.LCT1 = true;
			}
			
			else if (choice == 4 && !DamonMath135.LCT2 && DamonStats.Knowledge >= DamonMath135.LCT2Pt)
			{
				DamonStats.Knowledge -= DamonMath135.LCT2Pt;
				DamonMath135.LCT2 = true;
			}
			
			else if (choice == 5 && !DamonMath135.CRT && DamonStats.Knowledge >= DamonMath135.CRTPt)
			{
				DamonStats.Knowledge -= DamonMath135.CRTPt;
				DamonMath135.CRT = true;	
			}
			
			else if (choice == 6 && !DamonMath135.GCRT && DamonStats.Knowledge >= DamonMath135.GCRTPt)
			{
				DamonStats.Knowledge -= DamonMath135.GCRTPt;
				DamonMath135.GCRT = true;	
			}
			
			else if (choice == 7)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}	
		}
	}

public static void WeekEight() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. RSA");
			System.out.println("2. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 2, 1);
			
			if (choice == 1 && !DamonMath135.RSA && DamonStats.Knowledge >= DamonMath135.RSAPt)
			{
				DamonStats.Knowledge -= DamonMath135.RSAPt;
				DamonMath135.RSA = true;
			}
			
			else if (choice == 2)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}		
		}
	}
	
	public static void WeekNine() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Infinitely Many Primes");
			System.out.println("2. Primes Factorization");
			System.out.println("3. Division from Prime Factorization");
			System.out.println("4. Greatest Common Divisors of Prime Factorization");
			System.out.println("5. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 5, 1);
			
			if (choice == 1 && !DamonMath135.IMP && DamonStats.Knowledge >= DamonMath135.IMPPt)
			{
				DamonStats.Knowledge -= DamonMath135.IMPPt;
				DamonMath135.IMP = true;
			}
			
			else if (choice == 2 && !DamonMath135.PF && DamonStats.Knowledge >= DamonMath135.PFPt)
			{
				DamonStats.Knowledge -= DamonMath135.PFPt;
				DamonMath135.PF = true;
			}
			else if (choice == 3 && !DamonMath135.DFPF && DamonStats.Knowledge >= DamonMath135.DFPFPt)
			{
				DamonStats.Knowledge -= DamonMath135.DFPFPt;
				DamonMath135.DFPF = true;
			}
			else if (choice == 4 && !DamonMath135.GCDPF && DamonStats.Knowledge >= DamonMath135.GCDPFPt)
			{
				DamonStats.Knowledge -= DamonMath135.GCDPFPt;
				DamonMath135.GCDPF = true;
			}
			
			else if (choice == 5)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}	
		}
	}
	
	public static void WeekTen() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Properties of Conjugates");
			System.out.println("2. Properties of Modulus");
			System.out.println("3. Polar Multiplication of Complex Numbers");
			System.out.println("4. De Moivre's Theorem ");
			System.out.println("5. Complex Nth Roots Theorem");
			System.out.println("6. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 6, 1);
			
			if (choice == 1 && !DamonMath135.PConjugates && DamonStats.Knowledge >= DamonMath135.PConjugatesPt)
			{
				DamonStats.Knowledge -= DamonMath135.PConjugatesPt;
				DamonMath135.PConjugates = true;
			}
			
			else if (choice == 2 && !DamonMath135.PM && DamonStats.Knowledge >= DamonMath135.PMPt)
			{
				DamonStats.Knowledge -= DamonMath135.PMPt;
				DamonMath135.PM = true;
			}
			
			else if (choice == 3 && !DamonMath135.PMCN && DamonStats.Knowledge >= DamonMath135.PMCNPt)
			{
				DamonStats.Knowledge -= DamonMath135.PMCNPt;
				DamonMath135.PMCN = true;
			}
			
			else if (choice == 4 && !DamonMath135.DMT && DamonStats.Knowledge >= DamonMath135.DMTPt)
			{
				DamonStats.Knowledge -= DamonMath135.DMTPt;
				DamonMath135.DMT = true;
			}
			
			else if (choice == 5 && !DamonMath135.CNRT && DamonStats.Knowledge >= DamonMath135.CNRTPt)
			{
				DamonStats.Knowledge -= DamonMath135.CNRTPt;
				DamonMath135.CNRT = true;
			}
			
			else if (choice == 6)
			{
				next = true;
			}
			else {
			System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
			System.out.println("Please choose again. ");
			}	
		}
	}

public static void WeekEleven() throws IOException 
	{
		System.out.println("So what did Damon learn this week?");
		boolean next = false;
		
		BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		
		while (!next)
		{
			System.out.println("Knowledge: " + DamonStats.Knowledge);
			System.out.println("Damon learned:");
			System.out.println("1. Division Algorithm for Polynomial");
			System.out.println("2. Fundamental Theorem of Arithmetic");
			System.out.println("3. Proceed to next week");
			int choice = DamonTools.validInput(Integer.parseInt(r.readLine()), 3, 1);
			
			if (choice == 1 && !DamonMath135.DAP && DamonStats.Knowledge >= DamonMath135.DAPPt)
			{
				DamonStats.Knowledge -= DamonMath135.DAPPt;
				DamonMath135.DAP = true;
			}
			
			else if (choice == 2 && !DamonMath135.FTA && DamonStats.Knowledge >= DamonMath135.FTAPt)
			{
				DamonStats.Knowledge -= DamonMath135.FTAPt;
				DamonMath135.FTA = true;
			}
			
			else if (choice == 3)
			{
				next = true;
			}
			else {
				System.out.println("Damon has either already learned that, or he does not have enough knowledge.");
				System.out.println("Please choose again. ");
			}	
		}
	}
}
