package com.aaa.ssm.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * fileName:DeptScheduleController
 * description:
 * author:zz
 * createTime:2020/9/28 20:37
 * version:1.0.0
 */
@Component
public class DeptScheduleController {

    @Scheduled(cron =  "*/2 * * * * ?")
    public void run(){
        System.out.println("...定时任务......");
    }
}
