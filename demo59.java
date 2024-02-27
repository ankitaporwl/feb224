//merging of two arrays
import java.util.*;
class demo59{
	public static void main(String ar[]){
		int x[]=new int[5];
		int y[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements of x array:");
		for(int i=0;i<5;i++){
			x[i]=sc.nextInt();
		}
		System.out.println("enter elements of y array:");
		for(int i=0;i<5;i++){
			y[i]=sc.nextInt();
		}
		int z[]=new int[10];
		for(int i=0;i<5;i++){
			z[i]=x[i];
			z[i+5]=y[i];
		}
		System.out.println("merged array:");
		for(int i=0;i<10;i++){
			System.out.print(z[i]+"   ");
		}
	}
}