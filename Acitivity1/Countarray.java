package world;
import java.util.*;
public class Countarray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to be count in array");
		int number = sc.nextInt();
		int count = 0;
		int array[] = {1,2,4,5,1,3,4,5,7,8,9};
		int n = array.length;
		if(number<0) {
			System.out.println("Invalid Output");
		}
		else
		{
			for(int i:array) {
				if(number==array[i]) {
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("Invalid Output");
			}
			else
			{
				System.out.println("The count of the array is:"+ count);	
			}
			
		}
		
	}

}
