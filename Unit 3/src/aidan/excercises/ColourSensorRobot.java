package aidan.excercises;

import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;

public class ColourSensorRobot {

	public static void main(String[] args) throws InterruptedException {
		EV3ColorSensor colour = new EV3ColorSensor(SensorPort.S3);
		
		float [] sample = new float[1];
		Button.waitForAnyPress();
		colour.getColorIDMode().fetchSample(sample,0);
		Thread.sleep(1500);
		System.out.println(sample[0]);
		
	}

}
