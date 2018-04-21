package com.ten_thousand.silver_paving.dao.quartzDao;

import com.ten_thousand.silver_paving.dao.investorDao.IinvestDao;
import com.ten_thousand.silver_paving.dto.*;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

//定时任务的方法
@Component
public class unlockQuartz implements Job {

    @Autowired
    private IinvestDao iinvestDao;



    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

        System.out.println("开始解冻任务");

//        方法思路：1、以当前时间为起点回溯5分钟，然后计算起始时间和当前时间的差，
//                2、判断这个差值是否是十分钟，达到十分钟的，取到这个订单的金额，id。存入一个存map的list
//                3、然后遍历这个list然后进行解冻业务

//以当前时间为起点回溯5分钟
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MINUTE,-5);
        Timestamp end = new Timestamp(c.getTime().getTime());

        try {
//            查询到从当前时间往前推5分钟，所有的订单
            List<OrderDto> orderDtos = iinvestDao.queryRealTimeOrder(end);
            for (OrderDto orderDto : orderDtos) {
//        取到订单开始时间
                Timestamp startTime = orderDto.getStartTime();
//        取到当前时间
                Timestamp now = new Timestamp(System.currentTimeMillis());
//        比较时间
                long l = (now.getTime() - startTime.getTime()) / (1000 * 60);
                if (l >= 1) {
//                   释放冻结状态的金额
                    iinvestDao.unlockFroozenAmount(orderDto.getAmountInvest(), orderDto.getProdId());
//                    修改订单状态为"2"取消投标
                    iinvestDao.updateOrderState("2", orderDto.getOrderId());
                }
            }
            System.out.println("完成解冻任务");

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
