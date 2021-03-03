
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortScore extends Thread {
	String matchType;
	String scoreString;
	
	public SortScore(String matchType,String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	public SortScore() {
		super();
	}
	
	
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getScorestring() {
		return scoreString;
	}
	public void setScoreString(String scorestring) {
		this.scoreString = scoreString;
	}
	List<Integer> l=new ArrayList<Integer>();
	
	public void run()
	{
		{
			String[] s=scoreString.split(",");
			for (int i=0;i<s.length;i++)
			{
				Integer in=Integer.parseInt(s[i]);
				l.add(in);
				}
			Collections.sort(l);
		}
	}
	public void getScores()
	{
		System.out.println("Match : "+matchType);
		for(int i:l )
		{
			System.out.println(i);
		}
	}
	

}