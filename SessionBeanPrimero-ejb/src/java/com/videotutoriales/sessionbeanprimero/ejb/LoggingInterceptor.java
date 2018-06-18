package com.videotutoriales.sessionbeanprimero.ejb;

import java.lang.reflect.Method;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {
 
    @AroundInvoke
    public Object logMethodCall(InvocationContext invocationContext)throws Exception{
        
        Object interceptedObject = invocationContext.getTarget();
        Method interceptedMethod = invocationContext.getMethod();
        
        System.out.println("Entrando " 
                + interceptedObject.getClass().getName() + "." 
                + interceptedMethod.getName() + "()");
        
        long ini = System.nanoTime();
        
        Object o = invocationContext.proceed();
        
        long fin = System.nanoTime();
        
        System.out.println("Saliendo " 
                + interceptedObject.getClass().getName() + "." 
                + interceptedMethod.getName() + "()");
        
        System.out.println("Duración: " + (fin - ini) + " nanosegundos");
        
        return o;
    }
}
