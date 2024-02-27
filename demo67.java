//colorful table
import java.awt.*;
class FDemo3 extends Frame{
	FDemo3(){
		Font f=new Font("Lucida Handwriting",Font.ITALIC,20);
		setFont(f);
	}
	public void paint(Graphics g){
		int x=50;
		int y=100;
		g.setColor(Color.blue);
		g.drawString("Ankita Porwal",600,750);
		int i,j;
		for(i=1;i<=10;i++){
			for(j=1;j<=10;j++){
				int r1=(int)(Math.round(Math.random()*255));
				int g1=(int)(Math.round(Math.random()*255));
				int b1=(int)(Math.round(Math.random()*255));
				Color c=new Color(r1,g1,b1);
				g.setColor(c);
			    g.drawString(""+i*j,x,y);
				try{Thread.sleep(50);}catch(Exception e){}
				x+=70;
			}
			x=50;
			y+=70;
		}
	}
}
class demo67{
	public static void main(String ar[]){
		FDemo3 f3=new FDemo3();
		f3.setVisible(true);
		f3.setSize(800,800);
		f3.setLocation(100,100);
		f3.setBackground(Color.black);
		f3.setForeground(Color.white);
	}
}