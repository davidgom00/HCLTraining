import java.util.*;
public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//prompt 1
		System.out.println("Please enter a number: ");
		
		int n = in.nextInt();
		int first = 0;
		int second = 1;
		int next;
		
		for(int i = 1; i<=n ; ++i) {
			System.out.print(first + " ");			
			next = first +second;
			first = second;
			second = next;
		}
		
		//prompt 2
		System.out.println();
		System.out.println("Please enter a number and I will tell you if it is prime: ");
		int prime = in.nextInt();
		boolean flag = true;
		for(int i = 2; i <= prime; i++)
		{
			if(prime % i ==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(prime + " is prime");
		}
		else {
			System.out.println(prime + " is not prime");
		}
		
		//prompt 3
		int x =10;
		int y =5;
		System.out.println();
		
		System.out.println("before swap x="+ x + ", y =" +y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("After swap x="+ x + ", y =" +y);
		
		//Prompt 4
		System.out.println();
		System.out.println("please enter 3 numbers:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a+b == c) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//prompt 5
		String word = in.next();
		String reverse="";
		char ch;
		
		for(int i =0; i<word.length(); i++) {
			ch = word.charAt(i);
			reverse = ch+reverse;
		}
		System.out.println("Reversed: " + reverse);
		
		in.close();
	}

}
