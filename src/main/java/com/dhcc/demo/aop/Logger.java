package com.dhcc.demo.aop;

public class Logger {

    public void beforeAdvice() {
        System.out.println("before Advice");
    }

    public void afterAdvice() {
        System.out.println("after Advice");
    }

    public void afterReturningAdvice(Object retVal) {
        System.out.println("Executed successful returning after advice" + retVal.toString());
    }

    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception when executing the advice: " + ex.getMessage());
    }
}
