//bubble sort
import java.util.*; 
class demo54{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int x[]=new int[7];
		System.out.println("enter elements");
		int i,j;
		for(i=0;i<7;i++){
			x[i]=sc.nextInt();
		}
		for(i=6;i>0;i--){
			for(j=0;j<i;j++){
				if(x[j]>x[j+1]){
					int t=x[j];
					x[j]=x[j+1];
					x[j+1]=t;
				}
			}
		}
		System.out.println("sorted array:");
		for(i=0;i<7;i++){
			System.out.print(x[i]+"  ");
		}
	}
}