/* Copyright 2018:
 * Plaligraphy 
 *  & Y2KProduction$
 */
package txB;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Backup {
	File f = new File("Backup.txt");
	public void init() {
		//Main frame declaration
		JFrame f = new JFrame("Tx Backup");
		JPanel m = new JPanel(new BorderLayout()); f.add(m);
		JPanel s = new JPanel();m.add(s, BorderLayout.SOUTH);
		JPanel n = new JPanel();m.add(n, BorderLayout.NORTH);
		JPanel c = new JPanel();m.add(c, BorderLayout.CENTER);
		//JLabels used in frame
		JLabel title = new JLabel("Tx Backup"); title.setFont(new Font("Monospaced", Font.PLAIN, 30));
		JLabel dir = new JLabel("Directory of txt file: ");
		//Adding JLabels to frame
		n.add(title);
		
		//JButtons used in frame
		JButton bkup = new JButton("Backup");
		JButton exit = new JButton("Exit");
		JButton ext = new JButton("Settings");
		
		//Adding JButtons to frame
		s.add(bkup);
		s.add(ext);
		s.add(exit);
		
		
		//JButton Action Listeners
		exit.addActionListener(e-> System.exit(0));
		
		
		//JTextField
		JTextField tf = new JTextField(20);
		
		//Adding main text and label
		c.add(dir);
		c.add(tf);
		
		f.setSize(264, 177);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
	}
}
