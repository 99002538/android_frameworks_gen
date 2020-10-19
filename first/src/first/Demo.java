package first;

import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Demo extends JFrame implements ActionListener{
	
	JLabel j1;
	JTextField jtf;
	static JButton jb1,jb2;
	
	Demo(){
		
		setTitle("Welcome");
		
		setSize(400,200);
		
		Container cnt=getContentPane();
		
		cnt.setLayout(new FlowLayout());
		
		cnt.setBackground(Color.green);
		
		 jtf=new JTextField(12);
		
		jb1=new JButton("Click me");
		
		jb2=new JButton("OK");
		
		j1=new JLabel("ENter your name");
		
		jb1.addActionListener(this);
		
		jb2.addActionListener(this);
		
		add(j1);
		
		add(jb1);
		
		add(jb2);
		
		add(jtf);
		
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Demo();
	}
	
	@Override
	
	public void actionPerformed(ActionEvent ae) {
		
		String ac=ae.getActionCommand();
		
		if(ac.equals("Click me")) {
			
			//JOptionPane.showMessageDialog(null, "You clicked" + jb1.getText() + "button");;
		
			new A();
			
			setDefaultCloseOperation(0);
			
		}
		
		else
		{
			
			JOptionPane.showMessageDialog(null,"You clicked"+jb2.getText()+"button");
		}
	}

}
