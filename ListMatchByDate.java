import java.util.Date;

public class ListMatchByDate implements Comparable<ListMatchByDate> {

private Date matchDate;
private String teamone;
private String teamtwo;
public Date getMatchDate() {
	return matchDate;
}
public ListMatchByDate(Date matchDate, String teamone, String teamtwo) {
	super();
	this.matchDate = matchDate;
	this.teamone = teamone;
	this.teamtwo = teamtwo;
}
public void setMatchDate(Date matchDate) {
	this.matchDate = matchDate;
}
public String getTeamone() {
	return teamone;
}
public void setTeamone(String teamone) {
	this.teamone = teamone;
}
public String getTeamtwo() {
	return teamtwo;
}
public void setTeamtwo(String teamtwo) {
	this.teamtwo = teamtwo;
}

public int compareTo(ListMatchByDate st){  
	if(matchDate==)  
	return 0;  
	else if(score<st.score)  
	return 1;  
	else  
	return -1;  
	}  
}
