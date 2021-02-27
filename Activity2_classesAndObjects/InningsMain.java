package world;
import java.util.*;
import java.util.Scanner;

public class InningsMain {
	public static void main(String[] args) {
		Innings i1 = new Innings();
		Innings i2 = new Innings();
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter The Team Name");
			String Teamname1  = sc.nextLine();
			
			System.out.println("Enter the Innings name");
			String Inningsname1 = sc.nextLine();
			
			System.out.println("Enter the Run");
			int Runs1 = sc.nextInt();
			
			i1.setTeamname(Teamname1);
			i1.setInningsname(Inningsname1);
			i1.setRuns(Runs1);
		   int runs1= i1.getRuns();
		   Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter The Team Name");
			String Teamname2  = sc2.nextLine();
			
			System.out.println("Enter the Innings name");
			String Inningsname2 = sc2.nextLine();
			
			System.out.println("Enter the Run");
			int Runs2 = sc2.nextInt();
			
			i2.setTeamname(Teamname2);
			i2.setInningsname(Inningsname2);
			i2.setRuns(Runs2);
			int runs2= i2.getRuns();
			
			if(runs1>runs2) {
				  System.out.println(Teamname2+" "+"Need"+" "+ (runs1+1));
			}
			else if(runs2>runs1){
				System.out.println(Teamname1+" "+"Need"+" "+ (runs2+1));	
			}
			else 
			{
				System.out.println("Match has Ended");
			}
		   
		
	}

}
