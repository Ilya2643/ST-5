package com.mycompany.app;

public class Sqrt
{
    private static final double DELTA = 0.00000001;
    private final double arg;

    public Sqrt(double arg) {
        this.arg=arg;
    }
    public double average(double x,double y) {
        return (x+y)/2.0;
    }
    public boolean good(double guess,double x) {
        return Math.abs(guess*guess-x)<DELTA;
    }
    public double improve(double guess,double x) {
        return average(guess,x/guess);
    }
    public double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    public double calc() {
        if (arg == 0) {
            return 0;
        }
        return iter(1.0,arg);
    }
}