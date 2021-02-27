package world;
import java.util.*;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1= "Virat"; //creating string object using string literals ""  strings literals are stored in SPM is same they refer to same memeory location
	String s4=  "Kohli";
	String s2 = new String("ahsljkfha"); //if I'm using new then it act as object and 
	                                   //we are passing value to the object
	//are stored in heap memory at different location
	
	String firsts1 =s1.substring(0,1);
	String remainingletters1 = s1.substring(1,s1.length());
	 
	firsts1 = firsts1.toUpperCase();
	
	String firsts4 = s4.substring(0,1);
	String remainingletters4 = s4.substring(1,s4.length());
	 firsts4 = firsts4.toUpperCase();
	
	String s3= new String("ahsljkfha asda afsaf asfasf ");  
	String [] s7 = s3.split("\s");
	
	System.out.println(s1.length());
	System.out.println(s2.length());
	System.out.println(firsts1+remainingletters1+" "+ firsts4+ remainingletters4);
	System.out.println((s1==s4));// literals refer to same memory location
	System.out.println(s2==s3); // stored in heap in differnt location
	System.out.println(s2.equals(s3)); // not focus on memory location but the value 
	
	System.out.println(s7);
	for(String ls:s7)
	{
		System.out.println(ls);
	}
	}
}
