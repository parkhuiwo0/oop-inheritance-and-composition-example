package domain.card.policy;

import domain.card.interfaces.CalculationPolicy;
import domain.money.Money;

public class PercentDiscountPolicy extends AdditionalCalculationPolicy {
    private double discountRate;

    public PercentDiscountPolicy(CalculationPolicy additionalPolicy, double discountRate) {
        super(additionalPolicy);
        this.discountRate = discountRate;
    }

    @Override
    protected Money adjustAmountAfterCalculated(Money fee) {
        return fee.minus(fee.times(discountRate));
    }
}
