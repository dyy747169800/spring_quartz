package com.uban.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by DuanYangYu on 2017/4/19 0019.
 */
@Component
public class MyQuartz extends QuartzJobBean {

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Hello MyQuartz  "+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date()));
    }
}
