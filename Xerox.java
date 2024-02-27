//X O
import java.awt.*;
import java.awt.event.*;
class FDemo5 extends Frame implements ActionListener{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	FDemo5(){
		Font f1=new Font("Lucida Handwriting",Font.BOLD,30);
		setFont(f1);
		
		setLayout(null);
		b1=new Button();
		b1.setSize(80,80);
		b1.setLocation(100,100);
		add(b1);
		b2=new Button();
		b2.setSize(80,80);
		b2.setLocation(180,100);
		add(b2);
		b3=new Button();
		b3.setSize(80,80);
		b3.setLocation(260,100);
		add(b3);
		b4=new Button();
		b4.setSize(80,80);
		b4.setLocation(100,180);
		add(b4);
		b5=new Button();
		b5.setSize(80,80);
		b5.setLocation(180,180);
		add(b5);
		b6=new Button();
		b6.setSize(80,80);
		b6.setLocation(260,180);
		add(b6);
		b7=new Button();
		b7.setSize(80,80);
		b7.setLocation(100,260);
		add(b7);
		b8=new Button();
		b8.setSize(80,80);
		b8.setLocation(180,260);
		add(b8);
		b9=new Button();
		b9.setSize(80,80);
		b9.setLocation(260,260);
		add(b9);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
	}
	int i=1;
	public void actionPerformed(ActionEvent e){
		if((e.getSource()==b1 || e.getSource()==b2 || e.getSource()==b3 || e.getSource()==b4 || e.getSource()==b5 ||
		e.getSource()==b6 || e.getSource()==b7 || e.getSource()==b8 || e.getSource()==b9) && i%2==1){
			e.getSource(setLabel("0"));
		}
        if((e.getSource()==b1 || e.getSource()==b2 || e.getSource()==b3 || e.getSource()==b4 || e.getSource()==b5 ||
		e.getSource()==b6 || e.getSource()==b7 || e.getSource()==b8 || e.getSource()==b9)  && i%2==0){
			b1.setLabel("X");
		}
		
		i++;
	}
	public void paint(Graphics g){
		g.drawString("Ankita Porwal",100,450);
	}
}
class dsf{
	public static void main(String ar[]){
		FDemo5 f5=new FDemo5();
		f5.setVisible(true);
		f5.setSize(500,500);
		f5.setLocation(100,100);
		
	}
}