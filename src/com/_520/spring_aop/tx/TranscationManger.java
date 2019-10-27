package com._520.spring_aop.tx;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

//@Component
public class TranscationManger {

    public void begin(JoinPoint joinPoint){
        System.out.println("代理对象：" + joinPoint.getThis().getClass());
        System.out.println("目标对象：" + joinPoint.getTarget().getClass());
        System.out.println("开始事务");
    }

    public void commit(){
        System.out.println("提交事务");
    }

    public void rollback(Exception ex){
        System.out.println("回滚事务" + ex);
    }

    public Object around(ProceedingJoinPoint point){
        Object ret = null;
        System.out.println("开始事务");
        try{
            // 执行目标方法
            ret = point.proceed();
            System.out.println("提交事务");
        }catch (Throwable e){
            System.out.println("回滚事务");
        }finally{
            System.out.println("释放资源");
        }

        return ret;
    }
}
