package com.cham.quartzcluster.job;

import com.cham.quartzcluster.service.TimeService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class TimeJob implements Job {

    @Autowired
    private TimeService timeService;

    @Override
    public void execute(JobExecutionContext context) {
        timeService.printTime();
    }
}
