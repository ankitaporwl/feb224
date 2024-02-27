class ds2{
	public static void main(String ar[]){
		int n=21;
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(i+j<=n/2+2 || j-i==n/2 || i-j==n/2 || i+j>=n+n/2+1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}