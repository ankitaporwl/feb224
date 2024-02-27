class demo48{   //series of composite number between 1 to 100
	public static void main(String ar[]){
		int i,j;
		int c;
		for(i=1;i<=100;i++){
			c=1;
			for(j=2;j<i;j++){
				if(i%j==0){
					c=0;
				}
			}
			if(c==0){
				System.out.print(i+"  ");
			}
		}
	}
}