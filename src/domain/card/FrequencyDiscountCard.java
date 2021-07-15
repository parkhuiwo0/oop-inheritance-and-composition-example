package domain.card;

import domain.money.Money;
import domain.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class FrequencyDiscountCard {
    private static final int discountAmount = 500;

    private List<Payment> payments = new ArrayList<>();

    public FrequencyDiscountCard(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    /**
     * 결제 내역을 순회 하면서 금액을 더합니다. (결제 건당 500원씩 할인)
     * @return 결제 내역의 총 금액 합산
     */
    public Money calculateFee() {
        Money fee = Money.ZERO;

        for (Payment payment : payments) {
            fee = fee.plus(calculatePaymentFee(payment));
        }

        return fee;
    }

    private Money calculatePaymentFee(Payment payment) {
        return payment.getFee().minus(Money.won(discountAmount));
    }
}