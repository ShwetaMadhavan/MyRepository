import java.io.*;
import java.util.*;
public class RearrangingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int res[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		if(n%2==0) {
		int a1[]=Arrays.copyOfRange(a, 0, n/2);
		int a2[]=Arrays.copyOfRange(a, (n/2), n);
		
		/*
		 * for(int i=0;i<a1.length;i++) { System.out.println(a1[i]); } for(int
		 * i=0;i<a2.length;i++) { System.out.println(a2[i]); }
		 */
		
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[a1.length-1-i]+" "+a2[i]+" ");
		}
		}
		else {
			int a1[]=Arrays.copyOfRange(a, 0, n/2+1);
			int a2[]=Arrays.copyOfRange(a, (n/2)+1, n);
			
			/*
			 * for(int i=0;i<a1.length;i++) { System.out.println(a1[i]); } for(int
			 * i=0;i<a2.length;i++) { System.out.println(a2[i]); }
			 */			
			for(int i=0;i<a2.length;i++) {
				System.out.print(a1[a1.length-1-i]+" "+a2[i]+" ");
			}
			System.out.print(a1[0]);
		}
	
		
		
		
		

	}

}
