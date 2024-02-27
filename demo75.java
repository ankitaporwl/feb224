//calculator using swing
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.script.*;
class FDemo extends JFrame implements ActionListener{
	JButton b[]=new JButton[20];
	JTextField tx1;
	int k=0;
	int x,y,w,h;
	FDemo(){
		Font f=new Font("",Font.BOLD,30);
		setTitle("Ankita Porwal");
		setLayout(null);
		
		tx1=new JTextField("");
		tx1.setFont(f);
		tx1.setSize(400,120);
		tx1.setLocation(2,0);
		add(tx1);
		tx1.setHorizontalAlignment(JTextField.RIGHT);
		
		x=0;
		y=120;
		w=100;
		h=100;
		String Data[]={"B","C","1/x","sqrt","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
		for(int i=1;i<=5;i++){
			for(int j=1;j<=4;j++){
				b[k]=new JButton(Data[k]);
				b[k].setSize(w,h);
				b[k].setLocation(x,y);
				b[k].setFont(f);
				x+=100;
				add(b[k]);
				b[k].addActionListener(this);
				k++;
			}
			x=0;
			y+=100;
		}
		setResizable(false);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b[0]){
			String s1=tx1.getText();
			tx1.setText(s1.substring(0,s1.length()-1));
		}else if(e.getSource()==b[1]){
			tx1.setText(" ");
		}else if(e.getSource()==b[2]){
			String s1=tx1.getText();
			Double a=Double.parseDouble(s1);
			a=1/a;
			tx1.setText(""+a);
		}else if(e.getSource()==b[3]){
			String s1=tx1.getText();
			Double a=Double.parseDouble(s1);
			tx1.setText(""+Math.sqrt(a));
		}else if(e.getSource()==b[18]){
			String s1=tx1.getText();
			ScriptEngineManager sem=new ScriptEngineManager();
			ScriptEngine se=sem.getEngineByName("js");
			try{
				tx1.setText(""+se.eval(s1));
			}
			catch(Exception exc){}
		}else{
		JButton b1=(JButton)e.getSource();
		String s1=tx1.getText()+b1.getLabel();
		tx1.setText(s1);
		}
	}
}
class demo75{
	public static void main(String ar[]){
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(420,670);
		f.setLocation(200,200);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}