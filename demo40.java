class demo40{    //palindrome number
	public static void main(String ar[]){
		int n=122;//palindrome
		int s=0;
		int t=n;
		while(n!=0){
			int a=n%10;
			s=s*10+a;
			n/=10;
		}
		if(t==s){
			System.out.println("number is palindrome");
		}
		else{
			System.out.println("number is not palindrome");
		}
	}
}