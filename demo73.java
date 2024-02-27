//Login form using swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Fdemo extends JFrame {
	JTextField t[]=new JTextField[5];
	Fdemo(){
		
		setLayout(null);
		Font f=new Font("",Font.BOLD,20);
		
		JLabel la=new JLabel("FORM");
	    la.setFont(f);
        la.setSize(150,40);
        la.setLocation(200,10);
		add(la);
		
		JLabel la1=new JLabel("Name");
	    la1.setFont(f);
        la1.setSize(250,40);
        la1.setLocation(20,100);
		add(la1);
		JLabel la2=new JLabel("Last Name");
	    la2.setFont(f);
        la2.setSize(250,40);
        la2.setLocation(20,150);
		add(la2);
		JLabel la3=new JLabel("Email");
	    la3.setFont(f);
        la3.setSize(250,40);
        la3.setLocation(20,200);
		add(la3);
		JLabel la4=new JLabel("Contact No.");
	    la4.setFont(f);
        la4.setSize(250,40);
        la4.setLocation(20,250);
		add(la4);
		JLabel la5=new JLabel("Address");
	    la5.setFont(f);
        la5.setSize(250,40);
        la5.setLocation(20,300);
		add(la5);
		JLabel la6=new JLabel("Date");
	    la6.setFont(f);
        la6.setSize(250,40);
        la6.setLocation(20,350);
		add(la6);
		JLabel la7=new JLabel("Gender");
	    la7.setFont(f);
        la7.setSize(250,40);
        la7.setLocation(20,400);
		add(la7);
		JLabel la8=new JLabel("Languages");
	    la8.setFont(f);
        la8.setSize(250,40);
        la8.setLocation(20,470);
		add(la8);
        
		int y=100;
		for(int i=0;i<5;i++){
			t[i]=new JTextField();
			t[i].setSize(280,40);
			t[i].setLocation(250,y);
			t[i].setFont(f);
			add(t[i]);
			y+=50;
		}
		
		JComboBox cb1=new JComboBox();
		cb1.setLocation(250,350);
		cb1.setSize(50,30);
		for(int i=1;i<=31;i++){
			cb1.addItem(i);
		}
		cb1.setFont(f);
		add(cb1);
		JComboBox cb2=new JComboBox();
		cb2.setSize(50,30);
		cb2.setLocation(300,350);
		for(int i=1;i<=12;i++){
			cb2.addItem(i);
		}
		cb2.setFont(f);
		add(cb2);
		JComboBox cb3=new JComboBox();
		cb3.setSize(100,30);
		cb3.setLocation(350,350);
		for(int i=2001;i<=2023;i++){
			cb3.addItem(i);
		}
		cb3.setFont(f);
		add(cb3);
		ButtonGroup bg=new ButtonGroup();
	
		JRadioButton rb1=new JRadioButton("Male");
		rb1.setSize(100,40);
		rb1.setLocation(250,400);
		rb1.setFont(f);
		bg.add(rb1);
		add(rb1);
		JRadioButton rb2=new JRadioButton("Female");
		rb2.setSize(100,40);
		rb2.setLocation(350,400);
		rb2.setFont(f);
		bg.add(rb2);
		add(rb2);
		
		JCheckBox c1=new JCheckBox("C");
		c1.setFont(f);
		c1.setSize(70,30);
		c1.setLocation(250,470);
		add(c1);
		JCheckBox c2=new JCheckBox("C++");
		c2.setFont(f);
		c2.setSize(70,30);
		c2.setLocation(320,470);
		add(c2);
		JCheckBox c3=new JCheckBox("Java");
		c3.setFont(f);
		c3.setSize(70,30);
		c3.setLocation(250,510);
		add(c3);
		JCheckBox c4=new JCheckBox("J2EE");
		c4.setFont(f);
		c4.setSize(100,30);
		c4.setLocation(320,510);
		add(c4);
		
		JTextArea ta=new JTextArea(15,15);
		ta.setFont(f);
		ta.setSize(300,300);
		ta.setLocation(600,100);
		add(ta);
		
		JButton b1=new JButton("Submit");
		b1.setFont(f);
		b1.setLocation(400,600);
		b1.setSize(100,50);
		
		add(b1);
	}
}
class demo73{
	public static void main(String ar[]){
	    Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setSize(1000,800);
		f.setLocation(200,200);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}