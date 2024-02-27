import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.*;
class fdemo extends JFrame implements ActionListener{
	JButton b[]=new JButton[20];
	JTextField tx;
	int k=0;
	String s1[]={"B","C","1/x","sqrt","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
	fdemo(){
		setLayout(null);
		Font f=new Font("",Font.BOLD,30);
		tx=new JTextField();
		tx.setFont(f);
		tx.setSize(400,120);
		tx.setLocation(0,0);
		tx.setBackground(Color.black);
		tx.setForeground(Color.white);
		tx.setHorizontalAlignment(JTextField.RIGHT);
		add(tx);
		int x=0;
		int y=120;
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				b[k]=new JButton(s1[k]);
				b[k].setSize(100,100);
				b[k].setLocation(x,y);
				x+=100;
				b[k].setFont(f);
				b[k].setBackground(Color.black);
				b[k].setForeground(Color.white);
				add(b[k]);
				b[k++].addActionListener(this);
			}
			x=0;
			y+=100;
		}
	}	
	public void actionPerformed(ActionEvent e){
		String s=tx.getText();
		if(e.getSource()==b[0]){
			tx.setText(s.substring(0,s.length()-1));
		}
		else if(e.getSource()==b[1]){
			tx.setText("");
		}
		else if(e.getSource()==b[2]){
			Double a=Double.parseDouble(s);
			a=1/a;
			tx.setText(""+a);
		}
		else if(e.getSource()==b[3]){
			Double a=Double.parseDouble(s);
			tx.setText(""+Math.sqrt(a));
		}
		else if(e.getSource()==b[18]){
			ScriptEngineManager sem=new ScriptEngineManager();
			ScriptEngine se=sem.getEngineByName("js");
			try{
				tx.setText(""+se.eval(s));
			}catch(Exception exc){}
		}
		else{
			JButton b1=(JButton)e.getSource();
			s=s+b1.getLabel();
			tx.setText(s);
		}
	}
}
class Xerox1{
	public static void main(String ar[]){
		fdemo f=new fdemo();
		f.setVisible (true);
		f.setSize(420,670);
		f.setLocation(200,200);			
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}