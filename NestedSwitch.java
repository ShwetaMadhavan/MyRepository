import java.io.*;
import java.util.*;
public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Select");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		int n=sc.nextInt();
		int a,b,c=0;
		System.out.println("Enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		
		
		switch(n) {
		case 1:
			c=a+b;
			System.out.println(c);
			break;
		case 2:
			c=Math.abs(a-b);
			System.out.println(c);
			break;
		case 3:
			c=a*b;
			System.out.println(c);
			break;
		case 4:
			System.out.println("a.Quotient");
			System.out.println("b.Remainder");
			char ch=sc.next().charAt(0);
		  switch(ch) {
		  case 'a':
			  c=a/b;
			  System.out.println(c);
			  break;
		  case 'b':
			  c=a%b;
			  System.out.println(c);
			  break;
		  default:
			  System.out.println("Invalid Choice");
			  break;
		  
		  }
		  break;
		  
	   default:
		   System.out.println("Invalid choice");
	
	
		}
		

	}

}
