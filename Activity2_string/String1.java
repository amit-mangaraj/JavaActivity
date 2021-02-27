package world;
import java.util.*;
public class String1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine(); 
		String s4=  sc.nextLine();
		

		String firsts1 =s1.substring(0,1);
		String remainingletters1 = s1.substring(1,s1.length());
		firsts1 = firsts1.toUpperCase();
		
		String firsts4 = s4.substring(0,1);
		String remainingletters4 = s4.substring(1,s4.length());
		 firsts4 = firsts4.toUpperCase();
		 
		System.out.println(firsts1+remainingletters1+" "+ firsts4+ remainingletters4);
	} 

}
