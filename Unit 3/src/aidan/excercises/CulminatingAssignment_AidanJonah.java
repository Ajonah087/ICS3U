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
	 * @param args
	 */
	public static void main(String[] args) {
		EV3LargeRegulatedMotor rightMotor= new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor= new EV3LargeRegulatedMotor(MotorPort.B);
		EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
		EV3GyroSensor gyro= new EV3GyroSensor(SensorPort.S1);
		EV3ColorSensor colour = new EV3ColorSensor(SensorPort.S3);
		System.out.println("Press the square button to start the maze runner program.");
		Button.waitForAnyPress();
		
	}
	
	public static void maintainDistance() throws InterruptedException{
		EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
		float [] distances = new float[1];
		sonar.fetchSample(distances,0);
		if (distances[0] < 0.05) {
		}
	}

	public static void colorCheck() throws InterruptedException{	
		EV3ColorSensor colour = new EV3ColorSensor(SensorPort.S3);
		float [] sample = new float[1];
		colour.getColorIDMode().fetchSample(sample,0);
		
	}
	
	

}
