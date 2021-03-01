import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ArrayList al = new ArrayList();
				ArrayList al2 = new ArrayList();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the top 5 scorers of IPL Season 13");
				int i;
				for(i=0;i<5;i++) {
					String name = sc.next();
					al.add(name);
				}
					
			System.out.println(al);
			
			System.out.println("Enter the top 5 scorers of IPL Season 12");
			int j;
			for(j=0;j<5;j++) {
				String name = sc.next();
				al2.add(name);
			}
				
		System.out.println(al);
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(al.get(i).equals(al2.get(j))) {
					System.out.println(al.get(i));
				}
			}
		}
		
	

	}

}
