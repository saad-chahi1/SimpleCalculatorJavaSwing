
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class classePrincipale extends JFrame implements ActionListener{
	
	private final JComboBox<String> operationJComboBox;
	private static final String[] operation = {"+", "-", "*", "/"};
	private JPanel pan;
	private JButton button = new JButton("RESULT :");
	private JTextField text1 = new JTextField("0", 20);
	private JTextField text2 = new JTextField("0", 20);
	private JTextField text3 = new JTextField(20);
	
	public classePrincipale() {
		
		operationJComboBox = new JComboBox<String>(operation);
		//create the frame and their sizes
		JFrame frame = new JFrame();
		frame.setTitle("Calculatrice");
		frame.setBackground(Color.white);
		frame.setSize(250, 250);
		frame.setVisible(true);
		
		//pan decorations and their sizes
		pan = new JPanel();
		button.addActionListener(this);
		pan.add(text1);
		pan.add(text2);
		pan.add(operationJComboBox);
		pan.add(button);
		pan.add(text3);
		pan.setOpaque(true);
			
		frame.setLocationRelativeTo(null);
		frame.setContentPane(pan);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			//convert first num
			String j1 = text1.getText();
			int s1 = Integer.parseInt(j1);
			//convert second num
			String j2 = text2.getText();
			int s2 = Integer.parseInt(j2);
			int s3;
			if( operationJComboBox.getSelectedItem() == "+") {
				s3 = s1 + s2;
			}else if( operationJComboBox.getSelectedItem() == "*") {
				s3 = s1 * s2;
			}else if( operationJComboBox.getSelectedItem() == "-") {
				s3 = s1 - s2;
			}else {
				s3 = s1 / s2;
			}
			
			Integer j=new Integer(s3);
			String s=j.toString();
			
			text3.setText(s);
		}
		
	}

	public static void main(String[] args) {
		new classePrincipale();
	}

}
