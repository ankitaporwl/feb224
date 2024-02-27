class demo43{     //composite number
	public static void main(String ar[]){
		int n=23;//composite
		int c=1;
		int i;
		for(i=2;i<n;i++){
			if(n%i==0){
				c=0;
			}
		}
		if(c==0){
			System.out.println("number is composite");
		}
		else{
			System.out.println("number is not composite");
		}
	}
}