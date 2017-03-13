package com.onur.se2einzelphase;

/**
 * Created by Onur on 12.03.2017.
 */

public class Calculator {

    public Calculator() {
    }

    public double divide(double dividend, double divisor){
        if(divisor==0) {
            throw new IllegalArgumentException("Nicht möglich!");
        }
        return dividend/divisor;
    }
}
