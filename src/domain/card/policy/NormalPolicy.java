package domain.card.policy;

import domain.money.Money;
import domain.payment.Payment;

public class NormalPolicy extends BaseCalculationPolicy {

    public NormalPolicy() {
    }

    @Override
    protected Money calculatePaymentFee(Payment payment) {
        return payment.getFee();
    }
}
