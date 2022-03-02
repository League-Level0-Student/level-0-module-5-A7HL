package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Enter a number");
		boolean prime = false;
		int numnum = Integer.parseInt(num);
		for(int a = 2; a <= numnum /2; ++a) {
		if(numnum%a==0){
		prime = true;
		break;
			}
		}
		if (!prime)
			System.out.println(numnum + " is a prime number");
		else
			System.out.println(numnum + " is not a prime number");
	}
}