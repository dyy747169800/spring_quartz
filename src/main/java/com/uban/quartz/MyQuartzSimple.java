package com.uban.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by DuanYangYu on 2017/4/19 0019.
 */
public class MyQuartzSimple {
    public void excute(){
        System.out.println("Hello MyQuartzSimple  "+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(new Date()));
    }
}
