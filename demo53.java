//sum of numbers in string as input given by user using ISR-BR 
import java.util.*;
import java.io.*;
class demo53{
	public static void main(String ar[])throws IOException{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(i);
		System.out.println("enter string:");
		String s1=br.readLine();
		StringTokenizer st=new StringTokenizer(s1," ,");
		int sum=0;
		/*boolean x=st.hasMoreTokens();
		while(x!=false){
			String s11=st.nextToken();
			int y=Integer.parseInt(s11);
			sum+=y;
			x=st.hasMoreTokens();
		}*/
		/*int n=st.countTokens();
		while(n!=0){
			String s11=st.nextToken();
			int y=Integer.parseInt(s11);
			sum+=y;
			n--;
		}*/
		int j;
		int n=st.countTokens();
		for(j=1;j<=n;j++){
			String s11=st.nextToken();
			int y=Integer.parseInt(s11);
			sum+=y;
		}
		System.out.println("sum="+sum);
	}
}