package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
	String shape = JOptionPane.showInputDialog("What shape would you like?");
	if (shape.equals("Triangle")) {
	drawTriangle();		 
}
	else if (shape.equals("Square")) {
	drawSquare();	
		
	}
	else if (shape.equals("Circle")) {
		drawCircle();
	}
}
	static void drawTriangle() {
	rob.setSpeed(10);
	rob.penDown();
	rob.move(100);
	rob.turn(135);
	rob.move(140);
	rob.turn(135);
	rob.move(100);
	}
	static void drawSquare() {
	rob.setSpeed(10);
	rob.penDown();
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);

}
	static void drawCircle() {
		rob.setSpeed(1000);
		rob.penDown();
		for(int i=0; i<500; i++) {
		rob.move(1);
		rob.turn(1);
	}
}
}

