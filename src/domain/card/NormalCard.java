package domain.card;

import domain.money.Money;
import domain.payment.Payment;

public class NormalCard extends Card {

    public NormalCard() {
    }

    @Override
    protected Money calculatePaymentFee(Payment payment) {
        return payment.getFee();
    }
}
