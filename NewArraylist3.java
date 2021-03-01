import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.*; 

public class NewArraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Set<String> a = new HashSet<String>();
		  Set<String> b = new HashSet<String>();
		  Scanner sc=new Scanner(System.in); 
		  int i,j;
		  
		  for(i=0;i<5;i++) {
			  String name = sc.next();
				a.add(name);
		  }
		  
		System.out.println(a);
		 for(i=0;i<5;i++) {
			  String name = sc.next();
				b.add(name);
		  }
		a.retainAll(b);
		 System.out.println("Consistent run scorers");
		 
		 
		 for(Object i4:a) {
				System.out.println(i4);}
			
	sc.close();

	}

}
