//sum of all elements in array
import java.util.*;
class demo57{
	public static void main(String ar[]){
		int x[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		for(int i=0;i<5;i++){
			x[i]=sc.nextInt();
		}
		int s=0;
		for(int i:x){
			s+=i;
		}
		System.out.println("sum="+s);
	}
}