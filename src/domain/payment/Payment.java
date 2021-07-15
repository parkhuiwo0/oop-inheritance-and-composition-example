package domain.payment;

import domain.money.Money;

import java.time.LocalDateTime;

public class Payment {

    private LocalDateTime date;
    private Money fee;

    protected Payment() {}

    public Payment(LocalDateTime date, Money fee) {
        this.date = date;
        this.fee = fee;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Money getFee() {
        return fee;
    }
}
