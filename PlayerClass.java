
public class PlayerClass implements Comparable<PlayerClass>{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlayerClass(String name) {
		super();
		this.name = name;
	}
	
	public int compareTo(PlayerClass st){  
		return this.getName().compareTo(st.name); 
		}  

	
}
