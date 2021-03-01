import java.util.Collections;
import java.util.List;
public class TeamClass implements Comparable<TeamClass> {
	private String name;
	private List playerList;
	
	public List getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}
	public void setPlayerList(List playerList) {
		this.playerList = playerList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TeamClass(String name) {
		super();
		this.name = name;
	}
	public TeamClass(String name, List playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}
	public TeamClass() {
		super();
	}
	public void addPlayer(String name) {
		playerList.add(new Player (name));
	}
	@Override
	public int compareTo(TeamClass o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

}
