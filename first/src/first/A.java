package first;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class A extends JFrame implements ActionListener{

	A(){
		
		setTitle("A");
		
		setSize(400,600);
		
		Container cnt=getContentPane();
		
		cnt.setLayout(new FlowLayout());
		
		cnt.setBackground(Color.yellow);
		
		JLabel  j11=new JLabel(Demo.jb1.getText());
		
		cnt.add(j11);
		
		JButton joob=new JButton("aah");
		
		joob.addActionListener(this);
		
		cnt.add(joob);
		
		setVisible(true);
	}
	
	@Override
	
	public void actionPerformed(ActionEvent ae) {
		
		String ac=ae.getActionCommand();
		
		if(ac.equals("aah")) {
			
			new Demo();
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null,"GO BACK!");
		}
	}
	
}
