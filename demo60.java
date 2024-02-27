//maximum number in an array
import java.util.*;
class demo60{
public static void main(String ar[]){
	Scanner sc=new Scanner(System.in);
	int x[]=new int[6];
	System.out.println("enter elements:");
	int i;
	for(i=0;i<6;i++){
		x[i]=sc.nextInt();
	}
	int max=x[0];
	for(i=1;i<6;i++){
		if(x[i]>max){
			max=x[i];
		}
	}
	System.out.println("maximum number in an array:"+max);
}
}