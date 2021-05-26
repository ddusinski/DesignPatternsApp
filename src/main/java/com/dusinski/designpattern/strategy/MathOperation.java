package com.dusinski.designpattern.strategy;

import java.math.BigDecimal;

public interface MathOperation {
    BigDecimal calculateStrategy(BigDecimal a, BigDecimal b);
}
