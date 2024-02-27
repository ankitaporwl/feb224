//shape program using awt
import java.awt.*;
import java.awt.event.*;
class FDemo8 extends Frame implements ActionListener{
	boolean b1[]=new boolean[3];
	Button b[]=new Button[3];
	FDemo8(){
		Font f1=new Font("Lucida Handwriting",Font.ITALIC,30);
		setFont(f1);
		setLayout(null);
		int i;
		int x=50;
		for(i=0;i<3;i++){
			b[i]=new Button();
			b[i].setSize(120,40);
			b[i].setLocation(x,100);
			add(b[i]);
			b[i].addActionListener(this);
			x+=230;
		}
		b[0].setLabel("Rect");
		b[1].setLabel("Oval");
		b[2].setLabel("Arc");
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b[0]){
			b1[0]=true; 
			b1[1]=false;
			b1[2]=false;
		}
		else if(e.getSource()==b[1]){
			b1[1]=true;
			b1[0]=false;
			b1[2]=false;
		}else if(e.getSource()==b[2]){
			b1[2]=true;
			b1[1]=false;
			b1[0]=false;
		}
		repaint();
	}
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.drawString("Ankita Porwal",50,470);
		if(b1[0]){
			g.setColor(Color.red);
			g.fillRect(50,250,150,80);
			b[0].removeActionListener(this);
		}if(b1[1]){
			g.setColor(Color.blue);
			g.fillOval(280,250,150,80);
		}if(b1[2]){
			g.setColor(Color.green);
			g.fillArc(500,250,150,80,90,80);
		}
		
	}
}
class demo72{
	public static void main(String ar[]){
		FDemo8 f=new FDemo8();
		f.setVisible(true);
		f.setSize(700,500);
		f.setLocation(200,200);
	}
}