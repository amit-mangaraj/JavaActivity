import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class DIsplayTeamMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int no = Integer.parseInt(br.readLine());
String teamname,playername;
Set<Team> sttem = new TreeSet(); 

for(int i=0;i<no;i++) {
	String str=br.readLine();
	String[] pro= str.split("\\|");
	teamname= pro[0];
	playername=pro[1];
}
	}

}
