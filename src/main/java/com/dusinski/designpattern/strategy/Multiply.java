package com.dusinski.designpattern.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Multiply implements MathOperation {

    @Override
    public BigDecimal calculateStrategy(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}
