//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(50);
		for(int i=0; i<10; i++) {
			
		
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(null, "What color would you like the robot to draw");
		//5. Use an if/else statement to set the pen color that the user requested
		
if (color.equals("Blue")) {
	
	rob.setPenColor(Color.BLUE);

	
}
else if (color.equals("Yellow")) {
	
	rob.setPenColor(Color.YELLOW);

	
}
else if (color.equals("Red")) {
	
	rob.setPenColor(Color.RED);

	
}
else if (color.equals("Black")) {
	
	rob.setPenColor(Color.BLACK);

	
}
else if (color.equals("Green")) {
	
	rob.setPenColor(Color.GREEN);

	
}
else if (color.equals("Orange")) {
	
	rob.setPenColor(Color.ORANGE);

	
}
else if (color.equals("Cyan")) {
	
	rob.setPenColor(Color.CYAN);

	
}

 if (color.equals("")) {
	 rob.setRandomPenColor();
	 
 }
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
 rob.move(90);
rob.turn(90);

	}
}
}
