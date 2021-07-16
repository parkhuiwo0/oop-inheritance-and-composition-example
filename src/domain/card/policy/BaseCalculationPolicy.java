package domain.card.policy;

import domain.card.Card;
import domain.card.interfaces.CalculationPolicy;
import domain.money.Money;
import domain.payment.Payment;

public abstract class BaseCalculationPolicy implements CalculationPolicy {

    @Override
    public Money calculateFee(Card card) {
        Money fee = Money.ZERO;
        for (Payment payment : card.getPayments()) {
            fee.plus(calculatePaymentFee(payment));
        }

        return fee;
    }

    protected abstract Money calculatePaymentFee(Payment payment);
}
