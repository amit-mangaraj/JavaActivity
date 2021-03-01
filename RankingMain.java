import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class RankingMain {

	public static void main(String[] args)throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Ranking> r=new ArrayList<>();
		System.out.println("Please provide the number of players ");
		int size= Integer.parseInt(reader.readLine());
		int count=1;
		int count1=1;
		int i;
		for(i=0;i<size;i++) {
			System.out.println("Enter the name of the playe" +count);
			String Name = reader.readLine();
			count++;
			System.out.println("Emter the Player Score");
			int Score= Integer.parseInt(reader.readLine());
			r.add(new Ranking(Name,Score));
		}
		Collections.sort(r);
		for(Ranking j:r) {
			System.out.println(j.getName()+":"+j.getScore());
		}
	}

}
