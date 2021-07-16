package interfaces;

import domain.card.Card;
import domain.money.Money;

/**
 * 결제 정책들을 반영한 결제 오퍼레이션을 수행합니다.
 */
public interface CalculationPolicy {
    Money calculateFee(Card card);
}
