package domain.card;

import domain.money.Money;

public class VatAndPercentDiscountNormalCard extends VatNormalCard {

    private double discountRate;

    public VatAndPercentDiscountNormalCard(double vatRate) {
        super(vatRate);
    }

    /**
     * 할인율 적용하여 결과 금액을 리턴합니다.
     * @param fee 상위 정책에서 결제된 금액
     * @return 전달 받은 결제 금액에서 discountRate만큼 할인합니다.
     */
    @Override
    protected Money adjustAmountAfterCalculated(Money fee) {
        return super.adjustAmountAfterCalculated(fee).minus(fee.times(discountRate));
    }
}
