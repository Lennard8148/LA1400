package BühlerLennard;
import robocode.*;


public class Crish extends JuniorRobot
{
	
	public void run() {
		
		setColors(black, red, red, black, red);
	
		while(true) {
		 ahead(10);
		 turnRight(10);
		 turnGunLeft(200);
		}
	}

	public void onScannedRobot() {	
		turnGunTo(scannedAngle + scannedVelocity/2);
	    
		smartshooting();
	}
	
	public void onHitByBullet() {
	
		turnRight(45);
		ahead(50);
	}
	
	//If enemy scanned less than 100 shoot full power else shoot power 1
	public void smartshooting(){
			if(scannedDistance < 100){
				fire(3);
			}
			else { 
				fire(1);
		    }
   }
   
	public void onHitWall() {
	
		turnLeft(90);
		ahead(50);
	}	
}