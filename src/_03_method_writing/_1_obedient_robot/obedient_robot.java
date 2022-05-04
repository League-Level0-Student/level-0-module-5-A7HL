package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class  obedient_robot{
	public static void main(String[] args) {
		/*
1.This recipe practices writing and calling void methods.
2.Make a new class, create a main method, and show the robot. 
3.Have the robot draw a square. 
4.Put this code into a drawSquare() method. 
5.Have the robot draw a triangle. 
6.Put this code into a drawTriangle() method. 
7.Have the robot draw a circle. 
8.Put this code into a drawCircle() method. 
9.Ask the user which shape they want. Draw the appropriate shape depending on their answer (call the right method). 
10.Ask the user which color they want. Give them some choices so you don't have to accomodate every possible color. Color the the shape depending on their answer
		 */
		//900 x 600
		String shape = JOptionPane.showInputDialog("what shape u want? (square, triangle, or circle");
		if (shape.equals("square")){
			mthd_square();
		}if (shape.equals("triangle")) {
			mthd_triangle();
		}if (shape.equals("circle")) {
			mthd_circle();
		}else {
		JOptionPane.showMessageDialog(null, "learn how to spell prick");
		}	
		}
		
	public static void mthd_square() {
		Robot sqr= new Robot();
		sqr.setSpeed(50);
		sqr.penDown();
		sqr.moveTo(400, 350);
		for(int i =1; i<5;i++) {
		sqr.move(100);
		sqr.turn(90);
		}
	}
	public static void mthd_triangle() {
		Robot tri= new Robot();
		tri.setSpeed(50);
		tri.penDown();
		tri.moveTo(400, 350);
		tri.turn(30);
		for(int i = 1; i <4; i++) {
			tri.move(100);
			tri.turn(120);
		}
	}
	public static void mthd_circle() {
		Robot cir= new Robot();
		cir.setSpeed(1000);
		cir.penDown();
		cir.moveTo(400, 300);
		for(int i = 0; i <= 360; i++) {
			cir.move(1);
			cir.turn(1);
		}
	}
}