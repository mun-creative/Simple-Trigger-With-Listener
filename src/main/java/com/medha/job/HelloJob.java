package com.medha.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job{

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		
		System.out.println("Quartz Job Scheduled !!!");
		
		//Throw exception for testing
				throw new JobExecutionException("Testing Exception");
		
	}

}
