class demo41{    //prime number
	public static void main(String ar[]){
		int n=23;//prime
		int i;
		int c=1;
		for(i=2;i<n;i++){
			if(n%i==0){
				c=0;
			}
		}
		if(c==1){
			System.out.println("number is prime");
		}
		else{
			System.out.println("number is not prime");
		}
	}
}