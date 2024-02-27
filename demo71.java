//calci using awt
import java.awt.*;
import java.awt.event.*;
class FDemo7 extends Frame implements ActionListener{
	Button b[]=new Button[4];
	TextField t[]=new TextField[3];
	Label l1,l2,l3;
	FDemo7(){
		setTitle("Calci");
		Font f1=new Font("Lucida Handwriting",Font.ITALIC,30);
		setFont(f1);
		setLayout(null);
		int i;
		
		
		l1=new Label("Enter No.1:");
		l1.setSize(250,40);
		l1.setLocation(50,50);
		add(l1);
		
		l2=new Label("Enter No. 2:");
		l2.setSize(250,40);
		l2.setLocation(50,120);
		add(l2);
		
		l3=new Label("Output:");
		l3.setSize(250,40);
		l3.setLocation(50,300);
		add(l3);
		
		int x=300;
		int y=50;
		for(i=0;i<3;i++){
			t[i]=new TextField(10);
		    t[i].setSize(250,40);
		    t[i].setLocation(x,y);
		    add(t[i]);
			y+=80;
			if(i==1){
				y+=90;
			}
		}
		
		
		x=50;
		y=220;
		
		for(i=0;i<4;i++){
			b[i]=new Button();
		    b[i].setSize(80,50);
		    b[i].setLocation(x,y);
		    add(b[i]);
			x+=130;
			b[i].addActionListener(this);
		}
		b[0].setLabel("+");
		b[1].setLabel("-");
		b[2].setLabel("*");
		b[3].setLabel("/");
		setResizable(false);
	}
	public void actionPerformed(ActionEvent e){
		Button b=(Button)e.getSource();
		String s1=t[0].getText();
		String s2=t[1].getText();
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
        int z=0;
		if(b.getLabel()=="+"){
			z=x+y;
		}else if(b.getLabel()=="-"){
			z=x-y;
		}else if(b.getLabel()=="*"){
			z=x*y;
		}else if(b.getLabel()=="/"){
			z=x/y;
		}
		t[2].setText(z+"");
	}
	public void paint(Graphics g){
		g.drawString("Ankita Porwal",50,470);
	}
}
class demo71{
	public static void main(String ar[]){
		FDemo7 f=new FDemo7();
		f.setVisible(true);
		f.setSize(700,500);
		f.setLocation(200,200);
	}
}