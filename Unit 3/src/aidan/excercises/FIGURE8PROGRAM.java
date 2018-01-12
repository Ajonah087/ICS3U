package aidan.excercises;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class FIGURE8PROGRAM {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor rightMotor= new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor= new EV3LargeRegulatedMotor(MotorPort.B);	
		//
		Button.waitForAnyPress();
		leftMotor.setSpeed(leftMotor.getMaxSpeed());
		rightMotor.setSpeed(250);
		Button.waitForAnyPress();
		rightMotor.forward();
		leftMotor.forward();
		Delay.msDelay(1750);
		//
		leftMotor.setSpeed(250);
		rightMotor.setSpeed(leftMotor.getMaxSpeed());
		leftMotor.getMaxSpeed();
		//Button.waitForAnyPress();
		rightMotor.forward();
		leftMotor.forward();
		Delay.msDelay(2750);
		//
		leftMotor.setSpeed(leftMotor.getMaxSpeed());
		rightMotor.setSpeed(250);
		//Button.waitForAnyPress();
		rightMotor.forward();
		leftMotor.forward();
		Delay.msDelay(1750);
	}
//3 OUT 4 TURNS ARE GOOD 3RD TURN NEEDS FIX
}
