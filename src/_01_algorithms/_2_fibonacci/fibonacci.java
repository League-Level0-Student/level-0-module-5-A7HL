package _01_algorithms._2_fibonacci;
public class fibonacci{
	public static void main(String[] args) {
	int number1 = 0;
	int number2 = 1;
	System.out.println(number1);
	System.out.println(number2);
	int sum;
	for(int count = 0; count < 10; count++) {
	sum=number2+number1;
	System.out.println(sum);
	number1=number2;
	number2=sum;
		}	
	}
}