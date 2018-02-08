package com.medha.listener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class HelloJobListener  implements JobListener{

	
	public static final  String LISTENER_NAME="dummyJobListener";
	
	public String getName() {
		// TODO Auto-generated method stub
		return LISTENER_NAME;
	}

	public void jobExecutionVetoed(JobExecutionContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("jobExecutionVetoed");
		
	}

	public void jobToBeExecuted(JobExecutionContext context) {
		// TODO Auto-generated method stub
		
		
		String jobName=context.getJobDetail().getKey().toString();
		System.out.println("job to be executed");
		System.out.println("JOb: "+jobName+" is going to start");
		
	}

	public void jobWasExecuted(JobExecutionContext context,
			JobExecutionException jobException) {
		// TODO Auto-generated method stub
		
		System.out.println("Job was executed ");
		
		String jobName=context.getJobDetail().getKey().toString();
		
		System.out.println("Job : " + jobName + " is finished...");
		if(!jobException.getMessage().equals(""))
		{
			System.out.println("Exception thrown by: " + jobName
					+ " Exception: " + jobException.getMessage());
		}
	}

}
