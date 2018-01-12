package aidan.excercises;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.Button;
import lejos.utility.*;
import lejos.hardware.sensor.EV3TouchSensor;

public class TouchSensorRobot {

	public static void main(String[] args) throws InterruptedException {
		
		EV3TouchSensor touch= new EV3TouchSensor(SensorPort.S2);
		float [] samples= new float[1];
		Button.waitForAnyPress();
		touch.fetchSample(samples, 0);
		System.out.println(samples[0]);
		Thread.sleep(10000);
		
		
	}

}
