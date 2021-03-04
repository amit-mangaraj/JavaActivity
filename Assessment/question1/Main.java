import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
public void equal() {
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				Player p1 = new Player();
				Player p2 = new Player();
				
				System.out.println("Enter Player 1 Details");
		String Detail1 = sc.next();
		String[] player1 = Detail1.split(",");
		p1.setName(player1[0]);
		p1.setDateofbirth(player1[1]);
		p1.setSkill(player1[2]);
		p1.setNumberOfMatches(Integer.parseInt(player1[3]));
		p1.setRuns(Integer.parseInt(player1[4]));
		p1.setWickets(Integer.parseInt(player1[5]));
		p1.setNationality(player1[6]);
		p1.setPowerRating(Double.parseDouble(player1[7]));
		
		System.out.println("Enter Player 2 Details");
		String Detail2 = sc.next();
		String[] player2 = Detail2.split(",");
		
		p2.setName(player2[0]);
		p2.setDateofbirth(player2[1]);
		p2.setSkill(player2[2]);
		p2.setNumberOfMatches(Integer.parseInt(player2[3]));
		p2.setRuns(Integer.parseInt(player2[4]));
		p2.setWickets(Integer.parseInt(player2[5]));
		p2.setNationality(player2[6]);
		p2.setPowerRating(Double.parseDouble(player2[7]));
	
		
		System.out.println("Player 1 Details are");
		System.out.println("Name:"+" "+ p1.getName());
		System.out.println("Date Of Birth"+" "+p1.getDateofbirth());
		System.out.println("Skills"+" " +p1.getSkill());
		System.out.println("Number Of mtches"+""+ p1.getNumberOfMatches());
		System.out.println("Runs"+" "+p1.getRuns());
		System.out.println("Wickets"+" "+p1.getWickets());
		System.out.println("Nationality"+" "+p1.getNationality());
		System.out.println("PowerRating"+" "+p1.getPowerRating());
		
		System.out.println("\n");
		System.out.println("Player 2 Details are");
		System.out.println("Name:"+" "+p2.getName());
		System.out.println("Date Of Birth"+ " "+p2.getDateofbirth());
		System.out.println("Skills"+" "+p2.getSkill());
		System.out.println("Number Of mtches"+ " "+p2.getNumberOfMatches());
		System.out.println("Runs"+" "+p2.getRuns());
		System.out.println("Wickets"+" "+p2.getWickets());
		System.out.println("Nationality"+" "+p2.getNationality());
		System.out.println("PowerRating"+" "+p2.getPowerRating());
		
		System.out.println("\n");
		
		if(player1[0].equals(player2[0])&&player1[2].equals(player2[2])&&player1[6].equals(player2[6])) {
			System.out.println("Player 1 is same as Player 2");
			
		}
		
		else
		{
			System.out.println("Player 1 is not same as Player 2");
		}
		
		
	}

}
