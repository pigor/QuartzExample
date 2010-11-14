package net.pigor.scheduler;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class CronScheduler {

	public CronScheduler() throws Exception {

		SchedulerFactory sf = new StdSchedulerFactory();

		Scheduler sche = sf.getScheduler();

		sche.start();

		JobDetail jDetail = new JobDetail("Newsletter", "NJob", MyJob.class);

		// "0 0 12 * * ?" Fire at 12pm (noon) every day
		// "0/2 * * * * ?" Fire at every 2 seconds every day

		CronTrigger crTrigger = new CronTrigger("cronTrigger", "NJob",
				"0/2 * * * * ?");

		sche.scheduleJob(jDetail, crTrigger);
	}
}
