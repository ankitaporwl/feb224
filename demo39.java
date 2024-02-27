class demo39{    //fibonacci series in pattern
	public static void main(String ar[]){
		int i,j;
		int m=0;
		int n=1;
		for(i=1;i<=4;i++){
			for(j=1;j<=i;j++){
				if(i==1){
					System.out.print(m+" ");
				}
				else if(i==2 && j==1){
					System.out.print(n+" ");
				}
				else{
					int t=m+n;
					System.out.print(t+" ");
					m=n;
					n=t;
				}
			}
			System.out.println();
		}
		
	}
}