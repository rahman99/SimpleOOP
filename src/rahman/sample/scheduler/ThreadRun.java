package rahman.sample.scheduler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class ThreadRun extends TimerTask {

	@Override
	public void run() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		System.out.println("My task on : "+dt.format(cal.getTime()));
	}

}
