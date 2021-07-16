package domain.card;

import domain.card.interfaces.CalculationPolicy;
import domain.money.Money;
import domain.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Card {

    private CalculationPolicy calculationPolicy;
    private List<Payment> payments = new ArrayList<>();

    public Card(CalculationPolicy calculationPolicy) {
        this.calculationPolicy = calculationPolicy;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public Money calculateFee() {
        return calculationPolicy.calculateFee(this);
    }
}
