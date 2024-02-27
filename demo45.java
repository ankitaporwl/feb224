class demo45{       //fibonacci series
	public static void main(String ar[]){
		int m=0;
		int n=1;
		int t,i;
		for(i=0;i<=10;i++){
			if(i==0){
				System.out.print(m+" ");
			}else if(i==1){
				System.out.print(n+" ");
			}else{
				t=m+n;
				System.out.print(t+" ");
				m=n;
				n=t;
			}
		}
	}
}