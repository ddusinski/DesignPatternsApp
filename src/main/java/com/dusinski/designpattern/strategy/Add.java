package com.dusinski.designpattern.strategy;

import java.math.BigDecimal;

public class Add implements MathOperation {

    @Override
    public BigDecimal calculateStrategy(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
