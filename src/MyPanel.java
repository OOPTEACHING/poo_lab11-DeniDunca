import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Simple Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 120);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		JLabel l = new JLabel("Label1 ");
		JTextField tf = new JTextField("TextField1");
		panel1.add(l);
		panel1.add(tf);
		panel1.setLayout(new FlowLayout());

		JButton b1 = new JButton("Button 1");
		final int[] count = {0};
		b1.addActionListener(e->{
			System.out.println("Butonul a fost apasat");
			count[0]++;
			l.setText(count[0]+"");
		});
		
		JButton b2 = new JButton("Button 2");
		b2.addActionListener(e->{
			String text = tf.getText();
			l.setText(text);
		});
		
		JButton b3 = new JButton("Button 3");
		b3.addActionListener(e->{
			panel1.setBackground(Color.yellow);
			panel2.setBackground(Color.pink);
		});
		
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);

		JPanel p = new JPanel();
		p.add(panel1);
		p.add(panel2);
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		frame.setContentPane(p);
		frame.setVisible(true);
	}
}
