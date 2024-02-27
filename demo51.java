//is palindrome or not by user input
import java.io.*;
class demo51{
	public static void main(String ar[])throws IOException{
		InputStreamReader i= new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(i);
		System.out.println("enter the number:");
		String s1=br.readLine();
		int x=Integer.parseInt(s1);
		int s=0;
		int y=x;
		while(x!=0){
			int a=x%10;
			s=s*10+a;
			x/=10;
		}
		if(y==s){
			System.out.println("number is palindrome");
		}
		else{
			System.out.println("number is not palindrome");
		}
	}
}