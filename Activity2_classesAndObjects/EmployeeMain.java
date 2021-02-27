package world;
import java.util.*;
public class EmployeeMain {
public static void main(String[] args ) {
	Scanner sc = new Scanner(System.in);
	Employee e = new Employee();
	System.out.println("Enter The name");
	String Name  = sc.nextLine();
	System.out.println("Enter The address");
	String Address = sc.nextLine();
	System.out.println("Enter The mobile");
	String Mobile = sc.nextLine();
	
	
	e.setName(Name);
	e.setAddress(Address);
	e.setMobile(Mobile);
	
	System.out.println("Employee Details");
	System.out.println("Employee name"+":"+ e.getName());
	System.out.println("Employee address"+":" + e.getAddress());
	System.out.println("Employee mobile"+":"+ e.getMobile());
}
}
