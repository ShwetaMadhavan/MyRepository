import java.io.*;
import java.util.*;
public class CrossProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()%2==0) {
			System.out.println("String length is even");
		}
		else {
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if((j==i)||(j==s.length()-1-i)) {
					System.out.print(s.charAt(j));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
}
