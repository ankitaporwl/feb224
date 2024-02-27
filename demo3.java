//snake game
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame{
	JPDemo jp;
	FDemo(){
		JPDemo jp=new JPDemo();
		add(jp);
	}
}
class JPDemo extends JPanel implements ActionListener,KeyListener{
	ImageIcon img1,img2,img3;
	Image dot,head,food;
	int dots=5;
	int r1=0,r2=0;
	int x[]=new int[100];
	int y[]=new int[100];
	boolean sg=false;
	boolean left=false,right=true,up=false,down=false;
	JPDemo(){
		int x1=120;
		for(int i=0;i<dots;i++){
			x[i]=x1;
			y[i]=100;
			x1-=20;
		}
		setBackground(Color.black);
	    img1=new ImageIcon("dot.png");
		dot=img1.getImage();
		img2=new ImageIcon("head.png");
		head=img2.getImage();
		img3=new ImageIcon("food.png");
		food=img3.getImage();
		Timer t=new Timer(100,this);
		t.start();
		addKeyListener(this);
		setFocusable(true);
		randomDemo();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(food,r1,r2,this);
		for(int i=0;i<dots;i++){
			if(i==0){
				g.drawImage(head,x[i],y[i],this);
			}else{
				g.drawImage(dot,x[i],y[i],this);
			}
		}
		
	}
	public void actionPerformed(ActionEvent e){
		if(x[0]==r1 && y[0]==r2){
			dots++;
			randomDemo();
		}
		if(sg){
		for(int i=dots;i>0;i--){
			x[i]=x[i-1];
			y[i]=y[i-1];
		}
		
			if(left){
				x[0]=x[0]-20;
			}if(right){
				x[0]=x[0]+20;
			}if(up){
				y[0]=y[0]-20;
			}if(down){
				y[0]=y[0]+20;
			}
		}
		repaint();
	}
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e){
		sg=true;
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			left=true;
			right=false;
			up=false;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			left=false;
			right=true;
			up=false;
			down=false;
		}if(e.getKeyCode()==KeyEvent.VK_UP){
			left=false;
			right=false;
			up=true;
			down=false;
		}if(e.getKeyCode()==KeyEvent.VK_DOWN){
			left=false;
			right=false;
			up=false;
			down=true;
		}
		
	}
	public void keyTyped(KeyEvent e){}
	void randomDemo(){
		r1=(int)Math.round(Math.random()*45+1);
		r1*=20;
		r2=(int)Math.round(Math.random()*45+1);
		r2*=20;
	}
}
class demo3{
	public static void main(String[] args){
		FDemo f=new FDemo();
        f.setVisible(true);
		f.setSize(1000,1000);
		f.setLocation(100,50);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}