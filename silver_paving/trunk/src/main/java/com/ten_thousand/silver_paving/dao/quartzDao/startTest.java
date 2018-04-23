package com.ten_thousand.silver_paving.dao.quartzDao;

import org.quartz.SchedulerException;
import org.quartz.impl.StdScheduler;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class startTest implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("启动");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        StdScheduler stdScheduler = (StdScheduler) classPathXmlApplicationContext.getBean("stdScheduler");
        try {
            stdScheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
//        关闭时关闭定时任务
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring-core.xml");
        StdScheduler stdScheduler = (StdScheduler) classPathXmlApplicationContext.getBean("stdScheduler");
        stdScheduler.shutdown();

        System.out.println("关闭");
    }
}
