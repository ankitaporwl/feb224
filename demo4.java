import java.awt.*;
class FDemo1 extends Frame{
	FDemo1(){
		Font f=new Font("",Font.BOLD,30);
		setFont(f);
	}
	public void paint(Graphics g){
		int x=140;
		int y=645;
		int count=17;
		int count1=0;
		int k=0;
		M:
		for(int i=1;i<=10;i++){
			if(k==11){
				x-=70;
				k--;
			}else{
				x+=70;
				k++;
			}
			for(int j=1;j<=10;j++){
				count1++;
				try{Thread.sleep(200);}catch(Exception e){}
				g.drawString(""+k,x,y);
				if(count1==count)break M;
				if(i%2==1){
					x+=70;
					k++;
				}else{
					x-=70;
					k--;
				}
			}
			y-=70;
		}
	}
}
class demo4{
    public static void main(String[] args){
        FDemo1 f=new FDemo1();
		f.setVisible(true);
		f.setBounds(200,100,1100,900);
    }
}