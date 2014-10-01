package rahman.sample.scheduler;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {

	public static void main(String[] args) {
		//menggunakan Thread
		getCara1();
		
		//cara manual, pengulangan detik ke-n
//		getCara2();
	}
	
	/**
	 * Cara 1: menggunakan Thread
	 */
	private static void getCara1(){
		
		Timer tm = new Timer();
		tm.schedule(new ThreadRun(), 0, 5000); //akan terulang setiap 5 detik.
	}
	
	/**
	 * Cara 2 : menggunakan Timer calender
	 */
	private static void getCara2(){
		Timer timer = new Timer();
		final Date date = new Date();
		TimerTask tt = new TimerTask(){
			public void run(){
				Calendar cal = Calendar.getInstance(); //this is the method you should use, not the Date(), because it is desperated.
 
//				int hour = cal.get(Calendar.HOUR_OF_DAY);//get the hour number of the day, from 0 to 23
				int second= cal.get(Calendar.SECOND);
				if(second == 30){
					System.out.println("scheduler update on "+new Timestamp(date.getTime()));					
				}
				
			}
		};
		timer.schedule(tt, 1000, 1000);//	delay the task 1 second, and then run task every two seconds
	}

}
