package lotto.view;

public class OutputView {

    public void printPurchasePriceMessage(){
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void printPurchaseLottoQuantity(Integer purchaseQuantity){System.out.println("\n"+purchaseQuantity+"개를 구매했습니다.");}

    public void printWinningNumbersMessage(){System.out.println("당첨 번호를 입력해 주세요.");}

    public void printBonusNumberMessage(){System.out.println("보너스 번호를 입력해 주세요.");}
}
