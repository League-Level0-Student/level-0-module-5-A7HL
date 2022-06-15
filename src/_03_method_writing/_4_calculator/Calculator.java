package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		double result =0;
		String input1 = JOptionPane.showInputDialog("Enter a number");
		double task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);
		String input2 = JOptionPane.showInputDialog("Enter another number");
		double number1 = Double.parseDouble(input1);
		double number2 = Double.parseDouble(input2);
		// 3) Call the correct method depending on what option the user chooses
	if(task==0) {
		result = divide(number1,number2);
	}
	if(task==1) {
		result = multiply(number1,number2);
		
	}if(task==2) {
		result = subtract(number1,number2);
	}
	if(task==3) {
		result = add(number1,number2);
	}
	
	// 4) Call the result() method and put the answer in a pop-up
	String result2 = String.format("Your answer is " + result);
	JOptionPane.showMessageDialog(null, result2);
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	
	public static double divide (double number1,double number2) {
		double totald = number1/=number2;
		return (totald);
	}public static double multiply(double number1,double number2) {
		double totalm = number1*=number2;
		return (totalm);
	}
	public static double subtract(double number1,double number2) {
		double totalp = number1-=number2;
		return(totalp);
	}
	public static double add(double number1,double number2) {
		double totals = number1+=number2;
		return(totals);
		
	}
	
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
