//flag
import java.awt.*;
class FDemo2 extends Frame{
	public void paint(Graphics g){
		Color c4=new Color(198,231,255);
		g.setColor(c4);
		g.fillRect(0,0,800,800);
		g.setColor(Color.green);
		g.fillRect(0,600,800,200);
		Color c5=new Color(52,150,32);
		g.setColor(c5);
		g.fillArc(600,470,200,300,0,180);
		g.fillArc(500,550,150,150,0,180);
		g.fillArc(400,590,100,80,0,180);
	
		Color c1=new Color(255,97,37);
		g.setColor(c1);
		g.fillRect(100,100,250,60);
		g.setColor(Color.white);
		g.fillRect(100,160,250,60);
		g.setColor(Color.green);
		g.fillRect(100,220,250,60);
		
		Color c2=new Color(153,58,16);
		g.setColor(c2);
		g.fillRect(95,95,4,555);
		g.fillRect(70,650,60,25);
		g.fillRect(50,675,100,25);
		g.fillRect(30,700,140,25);
		
		g.setColor(Color.black);
		g.drawRect(100,100,250,180);
		g.drawRect(70,650,60,25);
		g.drawRect(50,675,100,25);
		g.drawRect(30,700,140,25);
		
		g.setColor(Color.blue);
		int i=0;
		int j=15;
		g.drawArc(190,160,60,60,0,360);
		while(i<=345){
			g.fillArc(190,160,60,60,i,5);
			i+=15;
		}
		
	}
}
class demo66{
	public static void main(String ar[]){
		FDemo2 f2=new FDemo2();
        f2.setVisible(true);
        f2.setSize(800,800);
		f2.setLocation(100,100);			
	}
}