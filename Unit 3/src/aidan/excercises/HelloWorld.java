package aidan.excercises;
import lejos.hardware.Button;

import javax.sound.sampled.Clip;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import lejos.hardware.Sound;
import lejos.hardware.Sounds;
import lejos.hardware.motor.Motor;


	
public class HelloWorld {

	public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		Clip all = AudioSystem.getClip();
//		all.open(AudioSystem.getAudioInputStream(new File("DiscordToday.wav")));
		Button.waitForAnyPress();
		System.out.println("Do you want song 1 or 2");
	String choice= scan.nextLine();
		if (choice.equalsIgnoreCase("1")) {
			
			Sound.playTone(440, 500);
			Sound.playTone(440, 500);    
			Sound.playTone(440, 500);
			Sound.playTone(349, 350);
			Sound.playTone(523, 150);  
			Sound.playTone(440, 500);
			Sound.playTone(349, 350);
			Sound.playTone(523, 150);
			Sound.playTone(440, 650);
			 
			  Thread.sleep(250);
			 
			  Sound.playTone(659, 500);
			  Sound.playTone(659, 500);
			  Sound.playTone(659, 500);  
			  Sound.playTone(698, 350);
			  Sound.playTone(523, 150);
			  Sound.playTone(415, 500);
			  Sound.playTone(415, 350);
			  Sound.playTone(523, 150);
			  Sound.playTone(440, 650);
			 
			  Thread.sleep(250);
			  
			  Sound.playTone(880, 500);
			  Sound.playTone(440, 300);
			  Sound.playTone(440, 150);
			  Sound.playTone(880, 500);
			  Sound.playTone(830, 325);
			  Sound.playTone(784, 175);
			  Sound.playTone(740, 125);
			  Sound.playTone(698, 125);    
			  Sound.playTone(740, 250);
			 
			  Thread.sleep(250);
			 
			  Sound.playTone(455, 250);
			  Sound.playTone(622, 500);
			  Sound.playTone(587, 325);  
			  Sound.playTone(554, 175);  
			  Sound.playTone(523, 125);  
			  Sound.playTone(466, 125);  
			  Sound.playTone(523, 250);  
			  
			  Thread.sleep(250);
			  
			  Sound.playTone(880, 500);
			  Sound.playTone(440, 300);
			  Sound.playTone(440, 150);
			  Sound.playTone(880, 500);
			  Sound.playTone(830, 325);
			  Sound.playTone(784, 175);
			  Sound.playTone(740, 125);
			  Sound.playTone(698, 125);    
			  Sound.playTone(740, 250);
			  
			  Thread.sleep(250);
			 
			  Sound.playTone(455, 250);
			  Sound.playTone(622, 500);
			  Sound.playTone(587, 325);  
			  Sound.playTone(554, 175);  
			  Sound.playTone(523, 125);  
			  Sound.playTone(466, 125);  
			  Sound.playTone(523, 250);  
			
		}
		
		
		else {
			
			Sound.playTone((int) 24, 200);
			 Sound.playTone(33, 250);  
			 Sound.playTone(37, 300);
			 Sound.playTone(49, 300);
			 Sound.playTone(37, 300);
			 Sound.playTone(49, 300);
			 Sound.playTone(49, 300);
			 Sound.playTone(33, 300);
			 Sound.playTone(37,300);
			 Sound.playTone(49, 275);
			 Sound.playTone(37,280);
			 Sound.playTone(35, 240);
			
			 
			
		}

//		Motor.B.setSpeed(1200);
//		Motor.C.setSpeed(1200);
//		Motor.B.forward();
//		Motor.A.forward();
//		Sound.twoBeeps();
//		Motor.A.rotate(2160);
//		Motor.B.getAcceleration();
		
		
		
//		Sound.playTone(245,1000);
//		Sound.playTone(290,1000);
//		Sound.playTone(345,1000);
//		Sound.playTone(390,1000);
//		Sound.playTone(345,1000);
//		Sound.playTone(290,1000);
//		Sound.playTone(245,1000);
		
		
//		Sound.playTone(349, 250);
//		 Sound.playTone(415, 500);  
//		 Sound.playTone(349, 350);  
//		 Sound.playTone(440, 125);
//		 Sound.playTone(523, 500);
//		 Sound.playTone(440, 375);  
//		 Sound.playTone(523, 125);
//		 Sound.playTone(659, 650);
		
		
		
		
		Sound.playTone(440, 500);
		Sound.playTone(440, 500);    
		Sound.playTone(440, 500);
		Sound.playTone(349, 350);
		Sound.playTone(523, 150);  
		Sound.playTone(440, 500);
		Sound.playTone(349, 350);
		Sound.playTone(523, 150);
		Sound.playTone(440, 650);
		 
		  Thread.sleep(250);
		 
		  Sound.playTone(659, 500);
		  Sound.playTone(659, 500);
		  Sound.playTone(659, 500);  
		  Sound.playTone(698, 350);
		  Sound.playTone(523, 150);
		  Sound.playTone(415, 500);
		  Sound.playTone(415, 350);
		  Sound.playTone(523, 150);
		  Sound.playTone(440, 650);
		 
		  Thread.sleep(250);
		  
		  Sound.playTone(880, 500);
		  Sound.playTone(440, 300);
		  Sound.playTone(440, 150);
		  Sound.playTone(880, 500);
		  Sound.playTone(830, 325);
		  Sound.playTone(784, 175);
		  Sound.playTone(740, 125);
		  Sound.playTone(698, 125);    
		  Sound.playTone(740, 250);
		 
		  Thread.sleep(250);
		 
		  Sound.playTone(455, 250);
		  Sound.playTone(622, 500);
		  Sound.playTone(587, 325);  
		  Sound.playTone(554, 175);  
		  Sound.playTone(523, 125);  
		  Sound.playTone(466, 125);  
		  Sound.playTone(523, 250);  
		  
		  Thread.sleep(250);
		  
		  Sound.playTone(880, 500);
		  Sound.playTone(440, 300);
		  Sound.playTone(440, 150);
		  Sound.playTone(880, 500);
		  Sound.playTone(830, 325);
		  Sound.playTone(784, 175);
		  Sound.playTone(740, 125);
		  Sound.playTone(698, 125);    
		  Sound.playTone(740, 250);
		  
		  Thread.sleep(250);
		 
		  Sound.playTone(455, 250);
		  Sound.playTone(622, 500);
		  Sound.playTone(587, 325);  
		  Sound.playTone(554, 175);  
		  Sound.playTone(523, 125);  
		  Sound.playTone(466, 125);  
		  Sound.playTone(523, 250);  
		  
		  
		}
		
		
	}




