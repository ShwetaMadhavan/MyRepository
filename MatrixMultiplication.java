import java.io.*;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r1,c1,r2,c2,sum=0;
		System.out.println("Enter the no of rows of matrix 1");
		r1=sc.nextInt();
		System.out.println("Enter the no of columns of matirx 1");
		c1=sc.nextInt();
		System.out.println("Enter the elements of matrix 1");
		int a[][]=new int[r1][c1];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the no of rows of matrix 2");
		r2=sc.nextInt();
		System.out.println("Enter the no of columns of matirx 2");
		c2=sc.nextInt();
		System.out.println("Enter the elements of matrix 2");
		int b[][]=new int[r2][c2];
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int mul[][]=new int[r1][c2];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<r2;k++) {
					sum=sum+(a[i][k]*b[k][j]);
				}
				mul[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				if(j==0 && i!=0) {
					System.out.println();
				}
					System.out.print(mul[i][j]+" ");
				
			}
		}
		
		

	}

}
