
import java.util.ArrayList;
import java.util.Scanner;

public class Activity7_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fifty=0,hundred=0;
		ArrayList <Integer> l1=new ArrayList<>();
		System.out.println("Enter the number of Matches Played by Gayle");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			l1.add(a);
			if(l1.get(i)>=50&&l1.get(i)<100)
			{
				fifty++;
				
			}
			if(l1.get(i)>=100)
			{
				hundred++;
			}
		}
		System.out.println(fifty);
		System.out.println(hundred);

		
		
	sc.close();

	}

}