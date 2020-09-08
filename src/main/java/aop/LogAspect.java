package aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author stone tiger
 * @Description: 日志切面类
 * @date 2019/11/27
 */
@Aspect
public class LogAspect {

    @Pointcut("execution( void aop..*(..))")
    public void pointCut(){

    }

    // 被切入方法执行前执行
    @Before("pointCut()")
    public void logStart(JoinPoint point){
        System.out.println("logStart"+point.getSignature().toString());
    }

    // 被切入方法执行完成后执行，抛出异常也会执行
    @After("pointCut()")
    public void logEnd(JoinPoint point){
        System.out.println("logEnd"+point.getSignature().toString());
    }

    // 被切入方法执行完成后执行，抛出异常就不会执行
    @AfterReturning("pointCut()")
    public void logReturn(JoinPoint point){
        System.out.println("logReturn"+point.getSignature().toString());
    }

    // 被切入方法抛出异常后执行
    @AfterThrowing("pointCut()")
    public void logThrow(JoinPoint point){
        System.out.println("logThrow"+point.getSignature().toString());
    }

    // 可以自己在执行前后操作
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around");
        return proceedingJoinPoint.proceed();

    }
}
