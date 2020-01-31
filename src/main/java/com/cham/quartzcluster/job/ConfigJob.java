package com.cham.quartzcluster.job;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigJob {

    @Bean
    public JobDetail timeJobDetail() {
        return JobBuilder.newJob(TimeJob.class).withIdentity("timeJob")
                .storeDurably().build();
    }

    @Bean
    public Trigger timeJobTrigger(JobDetail timeJob) {
        return TriggerBuilder.newTrigger().forJob(timeJob)
                .withIdentity("TimeJobTrigger")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/10 * * ? * * *"))
                .build();
    }

}
