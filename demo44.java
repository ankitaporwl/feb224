class demo44{     //perfect number
	public static void main(String ar[]){
		int n=27;
        int s=0;
		int i;
		for(i=1;i<n;i++){
			if(n%i==0){
				s+=i;
			}
		}
		if(s==n){
			System.out.println("number is perfect");
		}
		else{
			System.out.println("number is not perfect");
		}
  	}
	
}