package com.dusinski.designpattern.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide implements MathOperation {

    @Override
    public BigDecimal calculateStrategy(BigDecimal a, BigDecimal b) {
        return a.divide(b,8, RoundingMode.FLOOR);
    }
}
