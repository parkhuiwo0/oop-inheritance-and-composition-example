package domain.card.policy;

import domain.money.Money;
import domain.payment.Payment;

public class DiscountPolicy extends BaseCalculationPolicy {
    private static final int discountAmount = 500;

    @Override
    protected Money calculatePaymentFee(Payment payment) {
        return payment.getFee().minus(Money.won(discountAmount));
    }
}
