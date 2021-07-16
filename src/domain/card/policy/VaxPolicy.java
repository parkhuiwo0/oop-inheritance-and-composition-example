package domain.card.policy;

import domain.card.interfaces.CalculationPolicy;
import domain.money.Money;

public class VaxPolicy extends AdditionalCalculationPolicy {

    private double vaxRate;

    public VaxPolicy(CalculationPolicy additionalPolicy, double vaxRate) {
        super(additionalPolicy);
        this.vaxRate = vaxRate;
    }

    @Override
    protected Money adjustAmountAfterCalculated(Money fee) {
        return fee.plus(fee.times(vaxRate));
    }
}
