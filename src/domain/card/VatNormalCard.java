package domain.card;

import domain.money.Money;

/**
 * 일반 카드 + 부가세 정책 적용 카드
 */
public class VatNormalCard extends NormalCard {
    private double vatRate; // 부가세율

    public VatNormalCard(double vatRate) {
        this.vatRate = vatRate;
    }

    /**
     * 부가세율을 적용하여 결과 금액을 리턴합니다.
     * @param fee 상위 정책에서 결제된 금액
     * @return 부가세율을 적용한 최종 금액
     */
    @Override
    protected Money adjustAmountAfterCalculated(Money fee) {
        return fee.plus(fee.times(vatRate));
    }
}
