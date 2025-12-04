package tn.esprit.twin.springclasse.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* tn.esprit.twin.springclasse.Service.*.*(..))")
    public void beforeServiceMethod(JoinPoint joinPoint) {
        System.out.println("[AOP @Before] Appel de la méthode : " + joinPoint.getSignature());
    }

    @After("execution(* tn.esprit.twin.springclasse.Service.*.*(..))")
    public void afterServiceMethod(JoinPoint joinPoint) {
        System.out.println("[AOP @After] Fin de la méthode : " + joinPoint.getSignature());
    }

    @AfterReturning(value = "execution(* tn.esprit.twin.springclasse.Service.*.*(..))", returning = "result")
    public void afterReturningServiceMethod(JoinPoint joinPoint, Object result) {
        System.out.println("[AOP @AfterReturning] Méthode : " + joinPoint.getSignature() + " retourne : " + result);
    }

    @AfterThrowing(value = "execution(* tn.esprit.twin.springclasse.Service.*.*(..))", throwing = "ex")
    public void afterThrowingServiceMethod(JoinPoint joinPoint, Throwable ex) {
        System.out.println("[AOP @AfterThrowing] Exception dans : " + joinPoint.getSignature() + " : " + ex);
    }

    @Around("execution(* tn.esprit.twin.springclasse.Service.*.*(..))")
    public Object aroundServiceMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[AOP @Around] Avant exécution : " + pjp.getSignature());
        Object result = pjp.proceed();
        System.out.println("[AOP @Around] Après exécution : " + pjp.getSignature());
        return result;
    }
}
