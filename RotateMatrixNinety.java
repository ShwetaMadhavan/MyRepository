import java.io.*;
import java.util.*;
public class RotateMatrixNinety {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r,c;
		System.out.println("Enter the number of rows");
		r=sc.nextInt();
		System.out.println("Enter the number of columns");
		c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		//First find transpose of a matix
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<c;j++) {
				if(i!=j) {
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
		//Swap the elements in first and last row
		for(int i=0;i<r;i++) {
			for(int j=0;j<c/2;j++) {
				int temp=a[i][j];
				a[i][j]=a[i][c-j-1];
				a[i][c-j-1]=temp;
			}
		}
		//Print the elements
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j==0 && i!=0) {
					System.out.println();
				}
				System.out.print(a[i][j]+" ");
			}
		}
		//Print the elements in anticlock wise direction

	}

}
