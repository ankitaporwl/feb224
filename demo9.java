//sum of n numbers using command line argument
class demo9{
public static void main(String arg[]){
	int s=0;
	for(int i=0;i<arg.length;i++){
		String s1=arg[i];
		int x=Integer.parseInt(s1);
		s+=x;
	}
	System.out.println("sum="+s);
}
}