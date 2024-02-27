//store one array into another array in reverse order
import java.util.*;
class demo58{
	public static void main(String ar[]){
		int x[]=new int[6];
		System.out.println("enter array elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++){
			x[i]=sc.nextInt();
		}
		int j=5;
		int y[]=new int[6];
		for(int i:x){
			y[j]=i;
			j--;
		}
		System.out.println("copied array:");
		for(int i:y){
			System.out.print(i+"  ");
		}
	}
}