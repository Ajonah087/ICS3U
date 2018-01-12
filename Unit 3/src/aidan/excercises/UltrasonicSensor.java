package aidan.excercises;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.Button;
import lejos.utility.*;
public class UltrasonicSensor {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Press the square button to measure the distance");
		Button.waitForAnyPress();
		EV3LargeRegulatedMotor rightMotor= new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor= new EV3LargeRegulatedMotor(MotorPort.B);
		EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
		float [] distances = new float[1];
		sonar.fetchSample(distances,0);
		System.out.println(distances[0]);
		Thread.sleep(15000);
		
		if (distances[0]>0.0) {
			rightMotor.forward();
			leftMotor.forward();
		}
		//UltrasonicSensors();
		
	}
	
	public static void UltrasonicSensors() throws InterruptedException{
//		EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
//		float [] distances = new float[1];
//		
//		for (int i=0; i < distances.length; i++) {
//			sonar.fetchSample(distances,0);
//			Delay.msDelay(1500);
//			System.out.println(distances[0]);
//		
		//}
		
	
}
}