/**
 * 
 */
package aidan.excercises;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;


/**
 * @author 343057964
 *
 */
public class CulminatingAssignment_AidanJonah {

	/**
	 * This method is used to have a robot get through a maze, making decisions about how fast and where to turn as the robot makes its' way through the maze 
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		EV3LargeRegulatedMotor rightMotor= new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor= new EV3LargeRegulatedMotor(MotorPort.B);
		EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
		EV3GyroSensor gyro= new EV3GyroSensor(SensorPort.S1);
		EV3ColorSensor colour = new EV3ColorSensor(SensorPort.S3);
		System.out.println("Press the square button to start the maze runner program.");
		Button.waitForAnyPress();
		rightMotor.forward();
		leftMotor.forward();
		maintainDistance(rightMotor,leftMotor,sonar,gyro,colour);
	}
	
	/**
	 * This method ensures that the robot utilises the ColorCheck Method when the EV3UltrasonicSensor senses that a wall is less than 5 cm away
	 * @throws InterruptedException
	 */
	public static void maintainDistance(EV3LargeRegulatedMotor rightMotor, EV3LargeRegulatedMotor leftMotor, EV3UltrasonicSensor sonar, EV3GyroSensor gyro, EV3ColorSensor colour) throws InterruptedException{
		float [] distances = new float[1];
		sonar.fetchSample(distances,0);
		if (distances[0] < 0.05) {
			colorCheck(rightMotor, leftMotor, sonar, gyro, colour);
		}
	}

	
	/**
	 * This method ensures that the robot determines what colour the wall is and determine what speed & direction the robot goes in
	 * @throws InterruptedException
	 */
	public static void colorCheck(EV3LargeRegulatedMotor rightMotor, EV3LargeRegulatedMotor leftMotor, EV3UltrasonicSensor sonar, EV3GyroSensor gyro, EV3ColorSensor colour) throws InterruptedException{	
		float [] sample = new float[1];
		colour.getColorIDMode().fetchSample(sample,0);
		
		if (sample[0]== -1) {
			rightMotor.forward();
			leftMotor.forward();
			Thread.sleep(250);
		}
		
		
		else if (sample[0]==3) {
			rightMotor.setSpeed(500);
			leftMotor.setSpeed(200);
			
			rightMotor.forward();
			leftMotor.forward();
			Thread.sleep(250);
		}
		
		else if (sample[0]==1) {
			rightMotor.setSpeed(250);
			leftMotor.setSpeed(250);
			
			rightMotor.backward();
			leftMotor.backward();
			Thread.sleep(250);
			rightMotor.setSpeed(500);
			leftMotor.setSpeed(200);
			rightMotor.forward();
			leftMotor.forward();
			Thread.sleep(350);
		}
		
		else if(sample[0]==2) {
			rightMotor.setSpeed(200);
			leftMotor.setSpeed(500);
			
			rightMotor.forward();
			leftMotor.forward();
			Thread.sleep(250);
		}
		
		else if(sample[0]==6) {
			rightMotor.setSpeed(250);
			leftMotor.setSpeed(250);
			rightMotor.backward();
			leftMotor.backward();
			Thread.sleep(250);
			rightMotor.setSpeed(200);
			leftMotor.setSpeed(500);
			rightMotor.forward();
			leftMotor.forward();
			Thread.sleep(350);
		}
		
	}
	
	

}
