package br.com.almana;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by francisco on 8/2/15.
 */
public class PagodeBlocker implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        RockPhrase phrase = (RockPhrase) methodInvocation.getMethod().getDeclaringClass().getDeclaredConstructors()[0].newInstance();
        if (phrase.getStyle() == MusicalStyle.PAGODE) {
            throw new RuntimeException("Sorry, pagode not allowed here");
        }
        System.out.println(phrase.getClass().getSimpleName() + "is good");
        return methodInvocation.proceed();
    }
}
