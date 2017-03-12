package com.onur.se2einzelphase;

/**
 * Created by Onur on 12.03.2017.
 */

public class Calculator {

    public Calculator() {
    }

    public int divide(int dividend, int divisor){
        int result=0;
        if(divisor==0){
            throw new IllegalArgumentException("Nicht möglich!");
        }
        else{
           result=dividend/divisor;
        }
        return result;
    }
}
