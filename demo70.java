//form
import java.awt.*;

class FDemo6 extends Frame{
	FDemo6(){
		setTitle("Login page");
		Font f=new Font("Lucida Handwriting",Font.BOLD,30);
		setFont(f);
		setLayout(null);
		Label la1=new Label("Enter Name:");
		la1.setSize(200,40);
		la1.setLocation(50,100);
		add(la1);
		TextField tx1=new TextField(15);
		tx1.setSize(250,40);
		tx1.setLocation(250,100);
		add(tx1);
		Label la2=new Label("Enter Password:");
		la2.setSize(250,40);
		la2.setLocation(50,150);
		add(la2);
		TextField tx2=new TextField(15);
		tx2.setSize(200,40);
		tx2.setLocation(300,150);
		add(tx2);
		tx2.setEchoChar('*');
		setResizable(false);
		Button b1=new Button("Login");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setSize(120,50);
		b1.setLocation(200,230);
		add(b1);
	}
}
class demo70{
	public static void main(String ar[]){
		FDemo6 f6=new FDemo6();
		f6.setVisible(true);
		f6.setLocation(100,100);
		f6.setSize(600,400);
	}
}