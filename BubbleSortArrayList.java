import java.io.*;
import java.util.*;
public class BubbleSortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		for(int i=0;i<a.size()-1;i++) {
			for(int j=0;j<a.size()-i-1;j++) {
				if(a.get(j)>a.get(j+1)) {
					int temp=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1,temp);
				}
			}
		}
		for(Integer arr:a) {
			System.out.print(arr+" ");
		}

	}

}
