package aidan.excercises;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class CircleProgram {

	public static void main(String[] args) throws InterruptedException {
		EV3LargeRegulatedMotor rightMotor= new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor= new EV3LargeRegulatedMotor(MotorPort.B);		
		leftMotor.setSpeed(leftMotor.getMaxSpeed());
		rightMotor.setSpeed(250);
		Button.waitForAnyPress();
		rightMotor.forward();
		leftMotor.forward();
		Delay.msDelay(10000);
		rightMotor.stop();
		leftMotor.stop();
	}

}
// for figure 8 program have the right motor at max speed 