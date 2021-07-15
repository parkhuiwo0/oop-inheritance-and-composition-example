package domain.card;

import domain.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private List<Payment> payments = new ArrayList<>();

    public Card(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Payment> getPayments() {
        return payments;
    }

}
