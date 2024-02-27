//tik tak game using swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fdemo extends JFrame implements ActionListener{
	JButton b[]=new JButton[9];
	int k=0;
	int c=1;
	Fdemo(){
		setLayout(null);
	    Font f=new Font("",Font.BOLD,50);
		int x=100;
		int y=100;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				b[k]=new JButton();
				b[k].setSize(100,100);
				b[k].setLocation(x,y);
				x+=100;
				b[k].setFont(f);
				add(b[k]);
				b[k].addActionListener(this);
				k++;
			}
			x=100;
			y+=100;
		}
	}
	public void actionPerformed(ActionEvent e){
		JButton b1=(JButton)e.getSource();
		if(c%2==1){
			b1.setLabel("O");
		}else{
			b1.setLabel("X");
		}
		c++;
		b1.removeActionListener(this);
	}
}
class demo74{
	public static void main(String ar[]){
	    Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setSize(800,800);
		f.setLocation(200,200);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}