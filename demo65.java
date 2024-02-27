//smilee
import java.awt.*;
class FDemo1 extends Frame{
	public void paint(Graphics g){
		Color c1=new Color(255,183,11);
		g.setColor(c1);
		g.fillOval(150,150,600,600);
		
		Color c2=new Color(82,37,23);
		g.setColor(c2);
		
		g.fillOval(230,280,190,190);
		g.fillOval(480,280,190,190);
		
		g.setColor(Color.white);
		
		g.fillOval(245,300,110,110);
		g.fillOval(495,300,110,110);
		g.fillOval(360,410,30,30);
		g.fillOval(610,410,30,30);
		
		Color c3=new Color(51,23,15);
		g.setColor(c3);
		
		g.drawArc(50,0,330,295,270,70);
		g.drawArc(51,0,330,295,270,70);
		g.drawArc(52,0,330,295,270,70);
		g.drawArc(53,0,330,295,270,70);
		g.drawArc(54,0,330,295,270,70);
		g.drawArc(55,0,330,295,270,70);
		g.drawArc(56,0,330,295,270,70);
		
		g.drawArc(520,0,330,295,200,70);
		g.drawArc(521,0,330,295,200,70);
		g.drawArc(522,0,330,295,200,70);
		g.drawArc(523,0,330,295,200,70);
		g.drawArc(524,0,330,295,200,70);
		g.drawArc(525,0,330,295,200,70);
		g.drawArc(526,0,330,295,200,70);
		
		g.drawArc(285,570,330,295,60,60);
		g.drawArc(285,571,330,295,60,60);
		g.drawArc(285,572,330,295,60,60);
		g.drawArc(285,573,330,295,60,60);
	}
}
class demo65{
	public static void main(String ar[]){
	    FDemo1 f1=new FDemo1();
        f1.setVisible(true);
		f1.setSize(800,800);
		f1.setLocation(100,100);
	}
}