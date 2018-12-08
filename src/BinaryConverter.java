import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	JTextField answer = new JTextField(15);
	JLabel label= new JLabel("A");
	public static void main(String[] args) {
		BinaryConverter convert = new BinaryConverter();
		convert.stuff();
		

	}

	public void stuff() {
		new JFrame();
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		
		JButton button = new JButton("convert");
		frame.add(panel);
		panel.add(answer);
		panel.add(button);
		panel.add(label);
		frame.pack();
		button.addMouseListener(this);
		frame.setVisible(true);
		frame.setSize(450, 100);
		frame.setTitle("Convert 8 bits of binary to ASCII");
		
	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	public void method() {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String text=answer.getText();
		String numbers = convert(text);
		label.setText(numbers);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
