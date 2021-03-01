import java.io.*;
import java.util.*;

//A collection is hetrogeneous collection of elements 
public class Collection1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Details");
		System.out.println("Enter the Player name");
		String name = sc.next();
		
		System.out.println("Enter the Player Age");
		String age = sc.next();
		
		System.out.println("Enter the Player Country");
		String Country = sc.next();
		
		
		al.add(name);
		al.add(age);
		al.add(Country);
		System.out.println("Players Details:");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		
		
		System.out.println("Enter the Skills");
		String Skills = sc.next();
	System.out.println("Enter the postion to add skills:");
	int postion = sc.nextInt();
	al.set(postion, Skills);
	for(Object i :al) {
		System.out.println(i);
	}
	//System.out.println(al);
		
	}
}
