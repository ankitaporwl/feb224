//tik tak game using awt
import java.awt.*;
import java.awt.event.*;
class FDemo5 extends Frame implements ActionListener{
    Button b[]=new Button[9];
	int c=1;
	FDemo5(){
		Font f1=new Font("Lucida Handwriting",Font.BOLD,30);
	    setFont(f1);
		setLayout(null);
		int i,j;
		int k=0;
		int x=100;
		int y=100;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				b[k]=new Button();
				b[k].setSize(80,80);
				b[k].setLocation(x,y);
				add(b[k]);
				b[k].addActionListener(this);
				k++;
				x+=80;
			}   
			x=100;
			y+=80;
		}
		
	}
	
	public void actionPerformed(ActionEvent e){
		Button b1=(Button)e.getSource();
		if(c%2==1){
			b1.setLabel("O");
		}else{
			b1.setLabel("X");
		}
		c++;
		b1.removeActionListener(this);
		
	}
	public void paint(Graphics g){
		g.drawString("Ankita Porwal",100,450);
	}
	
}
class demo69{
	public static void main(String ar[]){
		FDemo5 f5=new FDemo5();
		f5.setVisible(true);
		f5.setSize(500,500);
		f5.setLocation(100,100);
		f5.labelling();
	}
}