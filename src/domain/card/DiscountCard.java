package domain.card;

import domain.money.Money;
import domain.payment.Payment;

public class DiscountCard extends Card {
    private static final int discountAmount = 500;

    public DiscountCard() {
    }

    @Override
    protected Money calculatePaymentFee(Payment payment) {
        return payment.getFee().minus(Money.won(discountAmount));
    }

    @Override
    protected Money adjustAmountAfterCalculated(Money fee) {
        return fee;
    }
}