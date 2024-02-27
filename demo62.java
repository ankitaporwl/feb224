//second largest element in an array using single loop
import java.util.*;
class demo62{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int x[]=new int[6];
		System.out.println("enter array elements:");
		int i;
		for(i=0;i<6;i++){
			x[i]=sc.nextInt();
		}
		int max1=x[0];
		int max2=x[0];
		for(i=0;i<6;i++){
			if(x[i]>max1){
				max2=max1;
				max1=x[i];
			}
			else if(max1==max2 || x[i]>max2){
				max2=x[i];
			}
		}
		System.out.println("second largest element in an array:"+max2);
	}
}