import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,temp,result,fact=1,count=0;
		int[] intArray = new int[20]; 
		System.out.println("enter number");
		number=sc.nextInt();
		temp=number;
		if(number>32767) {
			System.out.println("Too large");
		}
		else if(number<0) {
			System.out.println("Too small");
		}
		else if(number==0||number==1) {
			System.out.println(1);
		}
		else {
			
			while(temp>0) {
				result=temp%10;    //123%10= 3  result=3
				fact=1;
				// calculate factorial of the result
				for(int i=1;i<=result;i++) {
					fact=fact*i;  // 6
				}
				
				intArray[count]=fact;
				count++;
				temp=temp/10;
			} //[6, 2, 1]
			//print the array form last 
		for(int i=count-1;i>=0;i--) {
			System.out.println(intArray[i]);
		}
			
		}
		sc.close();
	}

}
