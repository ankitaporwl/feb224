//is perfect or not by user input
import java.io.*;
class demo52{
	public static void main(String ar[])throws IOException{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		System.out.println("enter any number");
		String s1=br.readLine();
		int x=Integer.parseInt(s1);
		int j;
		int s=0;
		for(j=1;j<x;j++){
			if(x%j==0){
				s+=j;
			}
		}
		if(x==s){
			System.out.println("number is perfect");
		}else{
			System.out.println("number is not perfect");
		}
	}
}