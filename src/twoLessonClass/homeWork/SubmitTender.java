package twoLessonClass.homeWork;

/**
 * Created by yy on 17/1/2.
 */
public class SubmitTender {
    /*
        投标人投标
     */
    //每次投资金额
    private double amountPerInvestment;
    //当前投资人余额
    private double currentBalanceInvestment;
    //当前标的余额
    private double currentBalanceLoan;

    public double getAmountPerInvestment() {
        return amountPerInvestment;
    }

    public void setAmountPerInvestment(double amountPerInvestment) {
        this.amountPerInvestment = amountPerInvestment;
    }

    public double getcurrentBalanceInvestment() {
        return currentBalanceInvestment;
    }

    public void setcurrentBalanceInvestment(double currentBalanceInvestment) {
        this.currentBalanceInvestment = currentBalanceInvestment;
    }

}
