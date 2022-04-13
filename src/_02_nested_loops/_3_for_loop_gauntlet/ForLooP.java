package _02_nested_loops._3_for_loop_gauntlet;
public class ForLooP {
	public static void main(String[] args) {
		/*this is how you null a paragraph
		 * 
		 * 
		 * */
		for(int a =0; a <=100; a++) {
			System.out.println(a);
		}
		for(int b = 100;b>=0;b--) {
			System.out.println(b);
		}
		for(int c = 0; c <=100; c++) {
			if(c%2==0) {
				System.out.println(c);
			}
		}
		for(int d=0;d<=100;d++) {
			if(d%2==1) {
				System.out.println(d);
			}
		}
		for(int e=0; e<=500;e++) {
			if(e%2==1) {
				System.out.println(e +" is odd");
			}
			if(e%2==0) {
				System.out.println(e + " is even");
			}
		}
		for(int f=0; f<=777;f++) {
			if(f%7==0) {
				System.out.println(f);
			}
		}
		
		int year = 2022;
		for(int g=17; g>=0;g--) {
			
		System.out.println("in "+year+", I was "+g+" years old.");
		year-=1;
		}
		
		
		
		
		
		for(int A=0; A<10; A++) {
			
		}
		}
	}