package domain.card;

import domain.money.Money;
import domain.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public abstract class Card {

    private List<Payment> payments = new ArrayList<>();

    public Money calculateFee() {
        Money fee = Money.ZERO;

        for (Payment payment : payments) {
            fee = fee.plus(calculatePaymentFee(payment));
        }

        return fee;
    }

    abstract protected Money calculatePaymentFee(Payment payment);
    abstract protected Money adjustAmountAfterCalculated(Money fee);
}
