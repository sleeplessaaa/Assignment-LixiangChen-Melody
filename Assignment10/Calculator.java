package assignment10;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

 class Calculator extends JFrame implements ActionListener{
		 JLabel label1, label2, label3;

		 JButton btnPlus, btnMinus, btnMultiply, btnDivide;
		 JTextField txtField1, txtField2, txtField3;
		 
		 public Calculator(){
		  setLayout(new GridLayout(5,2));
		  setTitle("Two Numbers Calculator");
		  //initializing label
		  label1 = new JLabel("Number 1 :",JLabel.RIGHT);
		  label2 = new JLabel("Number 2 :",JLabel.RIGHT);
		  label3 = new JLabel("Result :",JLabel.RIGHT);
		  
		  //initializing buttons;
		  btnPlus = new JButton("+");
		  btnMinus = new JButton("-");
		  btnMultiply = new JButton("*");
		  btnDivide = new JButton("/");
		  
		  //adding eventlistener
		  btnPlus.addActionListener(this);
		  btnMinus.addActionListener(this);
		  btnMultiply.addActionListener(this);
		  btnDivide.addActionListener(this);
		  //initializing textfield
		  //for(int i = 0; i < 3; i++)
		   txtField1 = new JTextField();
		   txtField2 = new JTextField();
		   txtField3 = new JTextField();
		   
		  //adding to the frame
		  add(label1,0);
		  add(txtField1);
		  add(label2);
		  add(txtField2);
		  add(label3);
		  add(txtField3);
		  add(btnPlus);
		  add(btnMinus);
		  add(btnMultiply);
		  add(btnDivide);
		 }//end of constructor
		 
		 
		 //action listener method
		 public void actionPerformed(ActionEvent event){
		  String opt = event.getActionCommand();
		  int num1, num2, num = 0;
		  num1 = Integer.parseInt(txtField1.getText());
		  num2 = Integer.parseInt(txtField2.getText());
		  
		  
		   if(opt.equals("+"))
		    num = num1 + num2;
		   else if(opt.equals("-"))
		    num = num1 - num2;
		   else if(opt.equals("*"))
		    num = num1 * num2;
		   else if(opt.equals("/")){
			num = num1 / num2;
		   }
		   txtField3.setText(Integer.toString(num));
		  
		 }


		 public static void main(String args[]){
		  Calculator demo = new Calculator();
		  demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  demo.setVisible(true);
		  demo.setSize(300,500);
		 }
}
