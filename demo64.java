//introduction
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
class FDemo extends Frame{
	FDemo(){
		Font f1=new Font("Lucida Handwriting",Font.BOLD,20);
		setFont(f1);
	}
	public void paint(Graphics g){
		g.drawRoundRect(50,50,700,550,100,100);
		g.drawString("Introduction",320,100);
		g.drawRect(310,70,200,40);
		g.drawString("Name:-Ankita Porwal",95,145);
		g.drawLine(90,160,700,160);
		g.drawString("College:-AITR",95,190);
		g.drawLine(90,200,700,200);
		g.drawString("Department:-IT",95,230);
		g.drawLine(90,240,700,240);
		g.drawString("Year:-2nd Year",95,270);
		g.drawLine(90,280,700,280);
		g.drawString("Session:2022-23",95,310);
		g.drawLine(90,320,700,320);
		g.drawString("Batch:-Java",95,350);
		g.drawLine(90,360,700,360);
		g.drawString("Timing:-7:00-8:00",95,390);
		g.drawLine(90,400,700,400);
		g.drawString("Coaching:-Softwaves Technologies",95,430);
		g.drawLine(90,440,700,440);
		
		g.drawString("Thank You",320,520);
		g.drawRoundRect(310,490,170,40,10,10);
	}
}
class demo64{
	public static void main(String ar[]){
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(800,800);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
		
	}
}