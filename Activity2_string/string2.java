package world;
import java.util.*;
public class string2 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2 = sc.nextLine();
String [] s3 = s1.split("\\s");
String [] s4 = s2.split("\\s");
if(s3[1].equals(s4[1]))
{
	System.out.println("yes");
	}
else
{
	System.out.println("No");}
	}

}
