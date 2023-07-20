import java.awt.*;
import java.awt.event.*;
class CalculatorDemo extends Frame implements WindowListener,ActionListener
{
    float a,b,c;
    char op;
    boolean flag=true;
	Label  lbnum1, lbnum2,lbnum3;
	//TextArea txtar;
	TextField textfield ;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
	Panel p1,p2,p3,p4,p5,p6,p7,p8,mp;
	CalculatorDemo()
	{
		setLayout(new FlowLayout());
		lbnum1=new Label("view");
        lbnum2=new Label("Edit");
        lbnum3=new Label("help");
       // txtar=new TextArea(3,20);
	    textfield = new TextField(30);
		b1=new Button("MC");
		b2=new Button("MR");
		b3=new Button("MS");
		b4=new Button("M+");
		b5=new Button("M-");
		b6=new Button("<-");
		b7=new Button("CE");
		b8=new Button("C");
		b9=new Button("+/-");
		b10=new Button("sqrt");
		b11=new Button("7");
		b12=new Button("8");
		b13=new Button("9");
		b14=new Button("/");
		b15=new Button("%");
		b16=new Button("4");
		b17=new Button("5");
		b18=new Button("6");
		b19=new Button("*");
		b20=new Button("1/x");
		b21=new Button("1");
		b22=new Button("2");
		b23=new Button("3");
		b24=new Button("-");
		b25=new Button("=");
		b26=new Button("0");
		b27=new Button(".");
		b28=new Button("+");
        p1=new Panel();
        p2=new Panel();
		p3=new Panel(new GridLayout(1,4,5,5));
		p4=new Panel(new GridLayout(1,4,5,5));
		p5=new Panel(new GridLayout(1,4,5,5));
		p6=new Panel(new GridLayout(1,4,5,5));
		p7=new Panel(new GridLayout(1,4,5,5));
		p8=new Panel(new GridLayout(1,4,5,5));
		mp=new Panel(new GridLayout(8,5,5,5));
		p1.add(lbnum1);
		p1.add(lbnum2);
		p1.add(lbnum3);
		p2.add(textfield);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		p4.add(b6);
		p4.add(b7);
		p4.add(b8);
		p4.add(b9);
		p4.add(b10);
		p5.add(b11);
		p5.add(b12);
		p5.add(b13);
		p5.add(b14);
		p5.add(b15);
		p6.add(b16);
		p6.add(b17);
		p6.add(b18);
		p6.add(b19);
		p6.add(b20);
		p7.add(b21);
		p7.add(b22);
		p7.add(b23);
		p7.add(b24);
		p7.add(b25);
		p8.add(b26);
		p8.add(b27);
		p8.add(b28);
		mp.add(p1);
		mp.add(p2);
		mp.add(p3);
		mp.add(p4);
		mp.add(p5);
		mp.add(p6);
		mp.add(p7);
		mp.add(p8);
		add(mp);
		setTitle("Calculator");
		setBounds(200,200,500,500);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
		addWindowListener(this);
	}

	public void windowClosed(WindowEvent e)
				{
				}
				public void windowActivated(WindowEvent e)
				{
				}
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
				public void windowDeactivated(WindowEvent e)
				{
				}
				public void windowDeiconified(WindowEvent e)
				{
				}
				public void windowIconified(WindowEvent e)
				{
				}
				public void windowOpened(WindowEvent e)
				{
             	}
             	void displaynum(int n)
					{
						textfield.setText(textfield.getText()+n);//for textfield +n for concatenate
					}

             	public void actionPerformed(ActionEvent e)
			     {
					 //for 0 to 9
					 if(e.getSource()==b26)
					 {
						 displaynum(0);
					 }
					 if(e.getSource()==b21)
					 {
						 displaynum(1);
					 }
					 if(e.getSource()==b22)
					 {
						 displaynum(2);
					 }
					 if(e.getSource()==b23)
					 {
						 displaynum(3);
					 }
					 if(e.getSource()==b16)
					 {
						 displaynum(4);
					 }
					 if(e.getSource()==b17)
					 {
						 displaynum(5);
					 }
					 if(e.getSource()==b18)
					 {
						 displaynum(6);
					 }
					 if(e.getSource()==b11)
					 {
						 displaynum(7);
					 }
					 if(e.getSource()==b12)
					 {
						 displaynum(8);
					 }
					 if(e.getSource()==b13)
					 {
						 displaynum(9);
					 }
					 //for performing +,-,*,/.
					 if(e.getSource()==b28)
					 {
						 a=Float.parseFloat(textfield.getText());
						 op='+';
						 textfield.setText("");
						 flag=true;
					 }
					 if(e.getSource()==b24)
					 {
						 a=Float.parseFloat(textfield.getText());
						 op='-';
						 textfield.setText("");
						 flag=true;
					 }
					 if(e.getSource()==b19)
					 {
						 a=Float.parseFloat(textfield.getText());
						 op='*';
						 textfield.setText("");
						 flag=true;
					 }
					 if(e.getSource()==b14)
					 {
						 a=Float.parseFloat(textfield.getText());
						 op='/';
						 textfield.setText("");
						 flag=true;
					 }
					 if(e.getSource()==b10)//for square root
					 {
						 a=Float.parseFloat(textfield.getText());
						 textfield.setText(""+Math.sqrt(a));
					 }
					 if(e.getSource()==b20)//for 1/x
					 {
						 a=Float.parseFloat(textfield.getText());
						 b=1/a;
					     textfield.setText(""+b);
					 }
					 if(e.getSource()==b9)//for (+/-)
					 {
						 a=Float.parseFloat(textfield.getText());
						 b=a*(-1);
						 textfield.setText(""+b);
					 }
					 if(e.getSource()==b8)//for clear c
					 {
						 textfield.setText("");
					 }
					 if(e.getSource()==b7)//fpor clear ce
					 {
						 textfield.setText("");
					 }
					if(e.getSource()==b15)//for %
					 {
						 //a=Float.parseFloat(textfield.getText());
						 b=Float.parseFloat(textfield.getText());
						 c=(a*b)/100;
						 textfield.setText(""+c);
					 }
					 if(e.getSource()==b27)//for "."
					 {
						 if(flag)
						 {
						 textfield.setText(textfield.getText()+".");
					     flag=false;
					     }
					 }
					     if(e.getSource()==b6)//for backspace
					     {
							String str=textfield.getText();
							if(str.length()>0)
							{
								String res=str.substring(0,str.length()-1);
								textfield.setText(res);
							}
					 }
					 if(e.getSource()==b3)//for MS
					 {
						 a=Float.parseFloat(textfield.getText());
						 textfield.setText("");
					 }
					 if(e.getSource()==b2)//for MR
					 {
						 textfield.setText(""+a);
					 }
					 if(e.getSource()==b4)//for MS
					 {
					   //a+=Float.parseFloat(textfield.getText());
					   //textfield.setText("");
					   System.exit(0);
				      }
				      if(e.getSource()==b5)//for MS
					  {
	     				   a-=Float.parseFloat(textfield.getText());
						   textfield.setText("");
				      }
				      if(e.getSource()==b1)//for MC
				      {
						  a=Float.parseFloat(textfield.getText());
						  textfield.setText("");
					  }
					 if(e.getSource()==b25)//for equal
					 {
						 b=Float.parseFloat(textfield.getText());
						 textfield.setText("");
						 switch(op)
						 {
							 case '+':c=a+b;
							 textfield.setText(""+c);
							 break;
						     case '-':c=a-b;
						     textfield.setText(""+c);
						     break;
						     case '*':c=a*b;
						     textfield.setText(""+c);
						     textfield.setBackground(Color.pink);
						     break;
						     case '/':c=a/b;
						     textfield.setText(""+c);
						     break;
						 }
					 }
				 }
	public static void main(String args[])
	{
		new CalculatorDemo();
	}
}