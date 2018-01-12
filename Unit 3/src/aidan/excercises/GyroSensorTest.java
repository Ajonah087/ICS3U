package aidan.excercises;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;

public class GyroSensorTest {

	public static void main(String[] args) throws InterruptedException {
		EV3GyroSensor gyro= new EV3GyroSensor(SensorPort.S1);
		EV3LargeRegulatedMotor rightMotor= new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor= new EV3LargeRegulatedMotor(MotorPort.B);	
		
		float [] sample= new float [1];
		Button.waitForAnyPress();
		//gyro.reset();
		//rightMotor.setSpeed(rightMotor.getMaxSpeed());
		//leftMotor.setSpeed(250);
		
		leftMotor.rotate(345);
		rightMotor.forward();
		gyro.getAngleMode().fetchSample(sample, 0);
		Thread.sleep(1000);
		System.out.println(sample[0]);
		Thread.sleep(2500);
		//rightMotor.rotate(57);
		System.out.println(sample[0]);
		//Thread.sleep(280);
		//leftMotor.rotate(135);
		System.out.println(sample[0]);
		//Thread.sleep(500);
	}

	
	
}
