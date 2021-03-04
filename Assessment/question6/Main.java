package question6;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of players");
n=sc.nextInt();
Player [] player = new Player[n];
for(int i=0;i<n;i++) {
	String s;
	Scanner sc2=new Scanner(System.in);
	s=sc2.nextLine();
	player[i]=Player. createPlayer(s);
}
HashMap<String, Integer> hmap = new HashMap<String, Integer>(); 

for (int i = 0; i < n; i++) { 
 if (hmap.containsKey(player[i].nationality)) { 
	 hmap.put(player[i].nationality, hmap.get(player[i].nationality) + 1); 
 } 
 else { 
	 hmap.put(player[i].nationality, 1); 
 }
 Set<Map.Entry<String, Integer> > set = hmap.entrySet(); 
 String key = ""; 
 int value = 0; 

 for (Map.Entry<String, Integer> map : set) { 
     if (map.getValue() > value) { 
         value = map.getValue(); 
         key = map.getKey(); 
     } 
 } 


 // Return word having highest frequency 
 System.out.println(hmap);
System.out.println("The nationality with maximum players: "+key);
System.exit(0);

} 
} 
}
