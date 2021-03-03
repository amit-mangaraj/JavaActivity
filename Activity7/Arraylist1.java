import java.io.*;
import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Team Name:");
		int i;
		for(i=0;i<5;i++) {
			String name = sc.next();
			al.add(name);
		}
			
	System.out.println(al);
	
Collections.swap(al,0,2);
System.out.println(al);
	}

}
