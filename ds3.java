class ds3{
	public static void main(String ar[]){
		int i,j;
		int n=21;
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(i+j<=n/2+2 || j-i==n/2 || i-j==n/2 || i+j>=n+n/2+2){
					System.out.print("  ");
				}
				else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}