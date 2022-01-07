package tdd.model;

import java.math.BigDecimal;

public enum JobPerformance {
    TO_BE_DESIRED{
        @Override
        public BigDecimal percentReadjustment() {
            return new BigDecimal("0.03");
        }
    },
    GREAT {
        @Override
        public BigDecimal percentReadjustment() {
            return new BigDecimal("0.15");
        }
    },
    ABOVE_EXPECTATIONS {
        @Override
        public BigDecimal percentReadjustment() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal percentReadjustment();

}
