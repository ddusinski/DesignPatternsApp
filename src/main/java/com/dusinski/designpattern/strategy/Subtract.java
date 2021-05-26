package com.dusinski.designpattern.strategy;

import java.math.BigDecimal;

public class Subtract implements MathOperation {

    @Override
    public BigDecimal calculateStrategy(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }
}
