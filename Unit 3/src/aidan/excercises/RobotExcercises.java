package aidan.excercises;
import lejos.hardware.motor.EV3LargeRegulatedMotor;


import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Delay;
import lejos.hardware.Button;


public class RobotExcercises {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Press the square button to start");
		Button.waitForAnyPress();
		square();
		UltrasonicSensors();
	}
	
		
	
		public static void square() throws InterruptedException{
		EV3LargeRegulatedMotor rightMotor= new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor leftMotor= new EV3LargeRegulatedMotor(MotorPort.B);
		leftMotor.setSpeed(1000);
		rightMotor.setSpeed(1000);
		Button.waitForAnyPress();
		
		// create loop
		for (int e=1; e<=4; e++) {
			rightMotor.forward();
			leftMotor.forward();
			Thread.sleep(1500);
			leftMotor.stop();
			rightMotor.rotate(135);
			//rightMotor.rotateTo(-90);
		
			
		}
	}

		public static void UltrasonicSensors() throws InterruptedException{
			EV3UltrasonicSensor sonar = new EV3UltrasonicSensor(SensorPort.S4);
			float [] distances = new float[1];
			
			for (int i=0; i < distances.length; i++) {
				sonar.fetchSample(distances,0);
				Delay.msDelay(40);
				Thread.sleep(200);
				System.out.println("The distance is" + distances[0]);
			
			}
		
}
}
