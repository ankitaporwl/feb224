//even number from array
import java.util.*;
class demo55{
	public static void main(String ar[]){
		int x[]=new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements:");
		int i;
		for(i=0;i<6;i++){
			x[i]=sc.nextInt();
		}
		System.out.println("even elements:");
		for(int j:x){
			if(j%2==0){
				System.out.print(j+"  ");
			}
		}
	}
}