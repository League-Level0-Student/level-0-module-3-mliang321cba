
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot("mini");
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(9999);
		for(int i = 0; i<360; i++) {
			rob.move(2);
			rob.turn(1);
		}
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String input = JOptionPane.showInputDialog("What  color would you like?");
		if(input.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.RED);
			rob.penDown();
			rob.setPenWidth(10);
			rob.setSpeed(9999);
			for(int i = 0; i<360; i++) {
				rob.move(2);
				rob.turn(1);
			}
		}
		if(input.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.BLUE);
			rob.penDown();
			rob.setPenWidth(10);
			rob.setSpeed(9999);
			for(int i = 0; i<360; i++) {
				rob.move(2);
				rob.turn(1);
			}
		}
		if(input.equalsIgnoreCase("orange")) {
			rob.setPenColor(Color.ORANGE);
			rob.penDown();
			rob.setPenWidth(10);
			rob.setSpeed(9999);
			for(int i = 0; i<360; i++) {
				rob.move(2);
				rob.turn(1);
			}
		}
		if(input.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.YELLOW);
			rob.penDown();
			rob.setPenWidth(10);
			rob.setSpeed(9999);
			for(int i = 0; i<360; i++) {
				rob.move(2);
				rob.turn(1);
			}
		}
		if(input.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.GREEN);
			rob.penDown();
			rob.setPenWidth(10);
			rob.setSpeed(9999);
			for(int i = 0; i<360; i++) {
				rob.move(2);
				rob.turn(1);
			}
		}
		if(input.equalsIgnoreCase("purple")) {
			rob.setPenColor(Color.MAGENTA);
			rob.penDown();
			rob.setPenWidth(10);
			rob.setSpeed(9999);
			for(int i = 0; i<360; i++) {
				rob.move(2);
				rob.turn(1);
			}
		}
		//5. Use an if/else statement to set the pen color that the user requested
		else {
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
