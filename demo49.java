class demo49{       //prime number series in pattern
	public static void main(String ar[]){
		int a=1;
		int b=1;
		int i,j;
		int c;
		for(i=1;i<=45;i++){
			c=1;
			for(j=2;j<i;j++){
				if(i%j==0){
					c=0;
				}
			}
			if(c==1){
				while(b<=5){
					System.out.print(i+"  ");
					if(a==b){
						System.out.println();
						a=0;
						b++;
					}
					a++;
					break;
				}
			}
		}
	}
}