import java.io.*;
import java.util.*;
public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		k=k%n;
		for(int i=0;i<n;i++) {
			if(i<k) {
				System.out.print(a[n+i-k]+" ");
			}
			else {
				System.out.print(a[i-k]+" ");
			}
		}
	}
}
