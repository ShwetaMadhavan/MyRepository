import java.io.*;
import java.util.*;
public class FindingGrandChildren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    
		//String s[][]= {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		int r=0,c = 0;
		System.out.println("Enter the no of rows");
		r=sc.nextInt();
		System.out.println("Enter the no of columns");
		c=sc.nextInt();
	    String f="";
	    int count=0;
		String s[][]=new String[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				s[i][j]=sc.next();
			}
		}
		System.out.println("Enter the name of the grandfather");
	    String g=sc.next();
		/*
		 * for(int i=0;i<r;i++) { for(int j=0;j<c;j++) { System.out.println(s[i][j]); }
		 * }
		 */
		System.out.println(Arrays.deepToString(s));
		for(int i=0;i<r;i++) {
				if((s[i][1]).equals(g)) {
					f=s[i][0];
					System.out.println(f);
				}
			
		}
		for(int i=0;i<r;i++) {
				if((s[i][1]).equals(f)) {
					count++;;
				}
			
		}
		System.out.println(count);
		
		
		
		
		
		

	}

}
