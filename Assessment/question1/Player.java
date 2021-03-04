
public class Player {
private String name;
private String Dateofbirth;
private String Skill;
private int numberOfMatches;
private int runs;
private int wickets;
private String  nationality;
private double powerRating;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDateofbirth() {
	return Dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	Dateofbirth = dateofbirth;
}
public String getSkill() {
	return Skill;
}
public void setSkill(String skill) {
	Skill = skill;
}
public int getNumberOfMatches() {
	return numberOfMatches;
}
public void setNumberOfMatches(int numberOfMatches) {
	this.numberOfMatches = numberOfMatches;
}
public int getRuns() {
	return runs;
}
public void setRuns(int runs) {
	this.runs = runs;
}
public int getWickets() {
	return wickets;
}

public void setWickets(int wickets) {
	this.wickets = wickets;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public double getPowerRating() {
	return powerRating;
}
public void setPowerRating(double powerRating) {
	this.powerRating = powerRating;
}

public Player(String name, String dateofbirth, String skill, int numberOfMatches, int runs, int wickets,
		String nationality, double powerRating) {
	super();
	this.name = name;
	Dateofbirth = dateofbirth;
	Skill = skill;
	this.numberOfMatches = numberOfMatches;
	this.runs = runs;
	this.wickets = wickets;
	this.nationality = nationality;
	this.powerRating = powerRating;
}

public Player() {
	super();
}
}
