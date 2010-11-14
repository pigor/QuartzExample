package net.pigor.scheduler;

import java.util.Calendar;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println(Calendar.getInstance().getTime().toString());
	}

}
