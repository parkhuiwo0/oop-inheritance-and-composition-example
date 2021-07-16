package domain.card.policy;

import domain.card.Card;
import domain.card.interfaces.CalculationPolicy;
import domain.money.Money;

public abstract class AdditionalCalculationPolicy implements CalculationPolicy {
    private CalculationPolicy additionalPolicy;

    public AdditionalCalculationPolicy(CalculationPolicy additionalPolicy) {
        this.additionalPolicy = additionalPolicy;
    }

    @Override
    public Money calculateFee(Card card) {
        Money fee = additionalPolicy.calculateFee(card);
        return adjustAmountAfterCalculated(fee);
    }

    abstract protected Money adjustAmountAfterCalculated(Money fee);
}
