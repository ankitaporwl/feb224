class demo42{    //armstrong number
	public static void main(String ar[]){
		int n=153;
		int s=0;
		int t=n;
		while(n!=0){
			int a=n%10;
			s+=a*a*a;
			n/=10;
		}
		if(t==s){
			System.out.println("Number is armstrong");
		}
		else{
			System.out.println("number is not armstrong");
		}
	}
}