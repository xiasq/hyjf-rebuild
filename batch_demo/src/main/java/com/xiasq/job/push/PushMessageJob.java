package com.xiasq.job.push;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.xiasq.job.BaseJob;

/**
 * @author xiasq
 * @version PushMessageJob, v0.1 2018/1/20 22:30
 */
public class PushMessageJob extends BaseJob implements Job {
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("PushMessageJob: {} execute...", context.getJobDetail().getKey().getName());
		//String url = "http://AF/af/job/mail/report/send";
		//String result = restTemplate.getForEntity(url, String.class).getBody();
		//logger.info("result:{}", result);
	}
}
