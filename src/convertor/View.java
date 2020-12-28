package convertor;
import java.awt.*;

import javax.swing.*;

import calculator.CalcModel;

class View extends JFrame {
	String[] valuta = {"RON", "EUR", "USD"};
	private JTextField titlu = new JTextField(5);
    private JComboBox box1 = new JComboBox(valuta);
    private JButton   convert = new JButton(">>");
    private JComboBox box2 = new JComboBox(valuta);
    private JTextField suma = new JTextField(5);
    private JTextField rezultat = new JTextField(5);
    
    private Model m_model;
    
    View(Model model)
    {
    	m_model = model;
        m_model.setValue(Model.INITIAL_VALUE);
        
   
    	JPanel content = new JPanel();
    	content.setLayout(new GridLayout(3,0));
    	content.add(new JLabel("1 EUR = 4.4693 RON"));
    	content.add(box1);
    	content.add(convert);
    	content.add(box2);
    	content.add(new JLabel("Suma"));
    	content.add(suma);
    	content.add(new JLabel("EUR"));
    	content.add(new JLabel("Rezultat"));
    	content.add(rezultat);
    	content.add(new JLabel("RON"));
    	
    	this.setContentPane(content);
        this.pack();
        this.setTitle("Simple convertor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
