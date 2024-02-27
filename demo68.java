//button implementation
import java.awt.*;
import java.awt.event.*;
class FDemo4 extends Frame implements ActionListener{
	Button b1,b2,b3;
	FDemo4(){
		Font f1=new Font("Lucida Handwriting",Font.BOLD,30);
		setFont(f1);
		FlowLayout fl=new FlowLayout();
		setLayout(fl);
		b1=new Button("red");
		add(b1);
		b2=new Button("green");
		add(b2);
		b3=new Button("blue");
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			setBackground(Color.red);
		}
		if(e.getSource()==b2){
			setBackground(Color.green);
		}
		if(e.getSource()==b3){
			setBackground(Color.blue);
		}
	}
	public void paint(Graphics g){
		g.drawString("Ankita Porwal",150,450);
	}
}
class demo68{
	public static void main(String ar[]){
		FDemo4 f4=new FDemo4();
		f4.setVisible(true);
		f4.setSize(800,800);
		f4.setLocation(100,100);
		
	}
}