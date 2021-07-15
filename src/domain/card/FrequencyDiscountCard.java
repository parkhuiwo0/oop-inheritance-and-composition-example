package domain.card;

import domain.money.Money;
import domain.payment.Payment;

import java.util.List;

public class FrequencyDiscountCard extends Card {
    private static final int TARGET_DISCOUNT_FREQUENCY = 10;
    private static final Money discountAmount = Money.won(500);

    public FrequencyDiscountCard(List<Payment> payments) {
        super(payments);
    }

    @Override
    public Money calculateFee() {
        Money fee = super.calculateFee();
        Money discountFee = Money.ZERO;

        if (getPayments().size() > TARGET_DISCOUNT_FREQUENCY) {
            discountFee = Money.won(((getPayments().size() - TARGET_DISCOUNT_FREQUENCY) * 500));
        }

        return fee.minus(discountFee);
    }

    //    private List<Payment> payments = new ArrayList<>();
//
//    public FrequencyDiscountCard(List<Payment> payments) {
//        this.payments = payments;
//    }
//
//    public List<Payment> getPayments() {
//        return payments;
//    }
//
//    /**
//     * 결제 내역을 순회 하면서 금액을 더합니다.
//     * 11번째 결제 내역부터는 500원씩 할인합니다.
//     * @return 결제 내역의 총 금액 합산
//     */
//    public Money calculateFee() {
//        Money fee = Money.ZERO;
//        int count = 0;
//
//        for (Payment payment : payments) {
//            fee.plus(payment.getFee());
//
//            if (++count > TARGET_DISCOUNT_FREQUENCY) {
//                fee.minus(discountAmount);
//            }
//        }
//
//        return fee;
//    }

}
