package assignment10;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class CelsiusConverter extends JFrame{
	/**
	   * Creates a Celsius Converter window and initialises all its
	   * components.
	   */
	
	 JTextField inputC;
	 JTextField inputF;

	 JLabel celsiusLabel;
	 JLabel fahrenheitLabel;

	 JButton convertC2FButton;
	 JButton convertF2CButton;

	 JLabel _fahrenheitLabel;
	  
	  CelsiusConverter() {
	    super("Convert Celsius to Fahrenheit and back");

	    Container content = getContentPane();
	    LayoutManager layout = new GridLayout(3, 2);
	    content.setLayout(layout);

	    celsiusLabel = new JLabel("Celsius:");
	    fahrenheitLabel = new JLabel("Fahrenheit:");
	    inputC = new JTextField(10);
	    inputF = new JTextField(10);
	    convertC2FButton = new JButton("C->F");
	    convertF2CButton = new JButton("F->C");

	    Font font = new Font("SansSerif", 0, 20);
	    content.setFont(font);
	    inputC.setFont(null);
	    inputF.setFont(null);
	    celsiusLabel.setFont(null);
	    fahrenheitLabel.setFont(null);
	    convertC2FButton.setFont(null);
	    convertF2CButton.setFont(null);


	    Border borderCelsius = BorderFactory.createEmptyBorder(2, 5, 1, 0);
	    celsiusLabel.setBorder(borderCelsius);
	    Border borderFahrenheit = BorderFactory.createEmptyBorder(1, 5, 2, 0);
	    fahrenheitLabel.setBorder(borderFahrenheit);

	    ActionListener celsiusListener = new ConvertCelsiusListener();
	    convertC2FButton.addActionListener(celsiusListener);
	    inputC.addActionListener(celsiusListener);

	    ActionListener fahrenheitListener = new ConvertFahrenheitListener();
	    convertF2CButton.addActionListener(fahrenheitListener);
	    inputF.addActionListener(fahrenheitListener);

	    content.add(celsiusLabel);
	    content.add(fahrenheitLabel);
	    content.add(inputC);
	    content.add(inputF);
	    content.add(convertC2FButton);
	    content.add(convertF2CButton);

	  }


	  /**
	   * show and run the Celsius Converter.
	   */
	  public static void main(String[] args) {
	    javax.swing.SwingUtilities.invokeLater(new Runnable() {
		  public void run() {
		    CelsiusConverter gui = new CelsiusConverter();
		    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    gui.pack();
		    gui.setVisible(true);
		  }
	        }
						   );
	  }

	  private class ConvertCelsiusListener implements ActionListener {

	    public void actionPerformed(ActionEvent event) {
	      String celsiusText = inputC.getText();
	      double celsius = Double.parseDouble(celsiusText);
	      double fahrenheit = celsius * 9 / 5 + 32;
	      String fahrenheitText = String.valueOf(fahrenheit);
	      inputF.setText(fahrenheitText);
	    }
	  }

	  private class ConvertFahrenheitListener implements ActionListener {

	    public void actionPerformed(ActionEvent event) {
	      String fahrenheitText = inputF.getText();
	      double fahrenheit = Double.parseDouble(fahrenheitText);
	      double celsius = (fahrenheit-32) * 5 / 9;
	      String celsiusText = String.valueOf(celsius);
	      inputC.setText(celsiusText);
	    }
	  }


}
