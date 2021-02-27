package world;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter The details");
		String details  = sc.next();
		
	    String[] str = details.split(",");
	c.setName(str[0]);
	c.setAddress(str[1]);
	c.setMobile(str[2]);
	
	System.out.println("Name:"+c.getName());
	System.out.println("Address:"+ c.getAddress());
	System.out.println("mobile:"+c.getMobile());
	}

}
