package com.uban.quartz;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by DuanYangYu on 2017/4/19 0019.
 */
public class MyQuartzSimple {
    private static Logger log = Logger.getLogger(MyQuartzSimple.class);
    public void excute(){
        log.info("Hello MyQuartzSimple  "+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date()));
    }
}
