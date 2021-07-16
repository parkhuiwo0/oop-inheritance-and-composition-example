package domain.card;

import domain.money.Money;
import domain.payment.Payment;

public class FrequencyDiscountCard extends Card {
    private static final int discountAmount = 500;

    public FrequencyDiscountCard() {
    }

    @Override
    protected Money calculatePaymentFee(Payment payment) {
        return payment.getFee().minus(Money.won(discountAmount));
    }
}