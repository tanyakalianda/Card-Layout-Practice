import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 

//typically all panels would be in their own class. here, we are just trying to demonstrate how cardlayout works
public class myFrame extends JFrame
{
	public myFrame()
	{
		CardLayout cl = new CardLayout();
		JPanel overall = new JPanel();     
		overall.setLayout(cl);
		
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("Panel1"));
		JButton button1 = new JButton("Button1");
		panel1.add(button1);
		
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("Panel2"));
		JButton button2 = new JButton("Button2");
		panel2.add(button2);
		
		JPanel panel3 = new JPanel();
		panel3.add(new JLabel("Panel3"));
		JButton button3 = new JButton("Button3");
		panel3.add(button3);
		
		overall.add(panel1, "beginning");
		overall.add(panel2, "panel2");
		overall.add(panel3, "panel3");
		
		cl.show(overall,  "beginning");         //tells it to show panel1
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				cl.show(overall,  "panel2");
			}
		});
		
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				cl.show(overall,  "panel3");
			}
		});
		
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				cl.show(overall,  "beginning");
			}
		});
		
		
		add(overall);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setBounds(100,100,600,400);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args)
	{
		new myFrame();
	}
}
