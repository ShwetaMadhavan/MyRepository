import java.io.*;
import java.util.*;
public class ReversalAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		//leftRotate(a,k,n);
		rightRotate(a,k,n);
		printArray(a);
	}

	private static void rightRotate(int[] a, int k, int n) {
		// TODO Auto-generated method stub
		if(k==0) {
			return;
		}
		k=k%n;
		reverseArray(a,0,n-1);
		reverseArray(a,0,k-1);
		reverseArray(a,k,n-1);
		
	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

	private static void leftRotate(int[] a, int k,int n) {
		// TODO Auto-generated method stub
		if(k==0) {
			return;
		}
		k=k%n;
		reverseArray(a,0,k-1);
		reverseArray(a,k,n-1);
		reverseArray(a,0,n-1);
		
	}

	private static void reverseArray(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		
	}

}
