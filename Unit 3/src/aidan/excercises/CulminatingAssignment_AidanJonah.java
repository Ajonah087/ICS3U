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
import lejos.robotics.Color;
import lejos.utility.Delay;


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
		EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S1);
		EV3GyroSensor gyro= new EV3GyroSensor(SensorPort.S3);
		EV3ColorSensor colour = new EV3ColorSensor(SensorPort.S4);
		System.out.println("Press the square button to start the maze runner program.");
		Button.waitForAnyPress();
//		rightMotor.forward();
//		leftMotor.forward();
//		Thread.sleep(1750);
		maintainDistance(rightMotor,leftMotor,sonar,gyro,colour);
		Thread.sleep(3500);
	}
	
	
	/**
	 * This method ensures that the robot utilises the ColorCheck Method when the EV3UltrasonicSensor senses that a wall is less than 5 cm away
	 * @throws InterruptedException
	 */
	public static void maintainDistance(EV3LargeRegulatedMotor rightMotor, EV3LargeRegulatedMotor leftMotor, EV3UltrasonicSensor sonar, EV3GyroSensor gyro, EV3ColorSensor colour) throws InterruptedException{
		float [] distances = new float[1];
		sonar.getDistanceMode().fetchSample(distances,0);
		do {
			rightMotor.forward();
			leftMotor.forward();
			System.out.println(distances[0]);
			sonar.getDistanceMode().fetchSample(distances,0);
			if (distances[0] < 0.05) {
				leftMotor.stop(true);
				rightMotor.stop(true);
				//leftMotor.forward();
				//rightMotor.forward();
				Thread.sleep(500);
				colorCheck(rightMotor, leftMotor, sonar,gyro, colour);
				Thread.sleep(5);
			}
			Delay.msDelay(12);
			
		}while (distances[0] > 0.04); 
			
			
		
		
	}
		
//	}
//
//	
//	if (distances[0] < 0.05) {
//		leftMotor.stop(true);
//		rightMotor.stop(true);
//		colorCheck(rightMotor, leftMotor, sonar,colour);
//	}
//	
//	else if (distances[0] > 0.05) {
//		rightMotor.forward();
//		leftMotor.forward();
//	}
//}
	
	/**
	 * This method ensures that the robot determines what colour the wall is and determine what speed & direction the robot goes in
	 * @throws InterruptedException
	 */
	public static void colorCheck(EV3LargeRegulatedMotor rightMotor, EV3LargeRegulatedMotor leftMotor, EV3UltrasonicSensor sonar, EV3GyroSensor gyro, EV3ColorSensor colour) throws InterruptedException{	
		float [] sample = new float[1];
		colour.getColorIDMode().fetchSample(sample,0);
		
		
		// go forward
//		if (sample[0]== -1) {
//			rightMotor.forward();
//			leftMotor.forward();
//			Thread.sleep(250);
//		}
		
		// turn to right
		//yellow
		if (sample[0]==Color.PINK) {
			rightMotor.setSpeed(500);
			leftMotor.setSpeed(200);
			leftMotor.rotate(120);
			rightMotor.forward();
			leftMotor.forward();
			Thread.sleep(250);
			System.out.println(Color.PINK);
		}		
		
		// go backwards and turn right
		// green
//		else if (sample[0]==Color.GREEN) {
//			rightMotor.setSpeed(250);
//			leftMotor.setSpeed(250);
//			
//			rightMotor.backward();
//			leftMotor.backward();
//			Thread.sleep(250);
//			rightMotor.setSpeed(500);
//			leftMotor.setSpeed(200);
//			rightMotor.forward();
//			leftMotor.forward();
//			Thread.sleep(350);
//			System.out.println(Color.GREEN);
//		}
		// go left
		// Blue
		else if(sample[0]==Color.GREEN) {
			rightMotor.setSpeed(400);
			leftMotor.setSpeed(400);
			leftMotor.backward();
			rightMotor.backward();
			Delay.msDelay(500);
			//leftMotor.stop();
			rightMotor.rotate(-90);
			Thread.sleep(90);
			leftMotor.forward();
			rightMotor.forward();
			Thread.sleep(250);
			System.out.println(Color.GREEN);
		}
		// go back and left
		// red
		else if(sample[0]==Color.YELLOW) {
			rightMotor.setSpeed(250);
			leftMotor.setSpeed(250);
			rightMotor.backward();
			leftMotor.backward();
			Thread.sleep(20);
			leftMotor.rotate(105);
			Thread.sleep(90);
			rightMotor.setSpeed(500);
			leftMotor.setSpeed(500);
			rightMotor.forward();
			leftMotor.forward();
			Thread.sleep(100);
			System.out.println(Color.YELLOW);
		}
		else {
			System.out.println("No colour found");
		}
		
	}
	
	

}
