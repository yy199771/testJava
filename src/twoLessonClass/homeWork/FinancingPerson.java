package twoLessonClass.homeWork;

/**
 * Created by yy on 17/1/2.
 */
public class FinancingPerson extends Account {
    /*
        借款人帐户子类
     */
    //借款人名字
    private String financingPersonName;
    //借款人id
    private int financingPersonId;
    //借款人帐户
    private double financingPersonAmount;
    //每次还款金额
    private double repaymentAmount;

    public FinancingPerson(String financingPersonName, int financingPersonId, double financingPersonAmount, double repaymentAmount) {
        this.financingPersonName = financingPersonName;
        this.financingPersonId = financingPersonId;
        this.financingPersonAmount = financingPersonAmount;
        this.repaymentAmount = repaymentAmount;
    }

    public FinancingPerson(String financingPersonName, int financingPersonId, double financingPersonAmount) {
        this.financingPersonName = financingPersonName;
        this.financingPersonId = financingPersonId;
        this.financingPersonAmount = financingPersonAmount;
    }

    @Override
    public String toString() {
        return "FinancingPerson{" +
                "financingPersonName=" + financingPersonName +
                ", financingPersonId='" + financingPersonId + '\'' +
                ", financingPersonAmount='" + financingPersonAmount + '\'' +
                '}';
    }

    public String getFinancingPersonName() {
        return financingPersonName;
    }

    public void setFinancingPersonName(String financingPersonName) {
        this.financingPersonName = financingPersonName;
    }

    public int getFinancingPersonId() {
        return financingPersonId;
    }

    public void setFinancingPersonId(int financingPersonId) {
        this.financingPersonId = financingPersonId;
    }

    public double getFinancingPersonAmount() {
        return financingPersonAmount;
    }

    public void setFinancingPersonAmount(double financingPersonAmount) {
        this.financingPersonAmount = financingPersonAmount;
    }

    public double getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(double repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    //还款
    public void repayment(Investor investor, double repaymentAmount){
        //判断是否还清
        if(financingPersonAmount > 0){
            //融资人帐号扣钱
            setFinancingPersonAmount(financingPersonAmount - repaymentAmount);
            System.out.println("融资人： " + getFinancingPersonName() + ",融资人帐户金额： " + getFinancingPersonAmount()+ "，每次投资额： "+ repaymentAmount);
            //投资人帐号加钱
            investor.setBalance(investor.getBalance() + repaymentAmount);
            System.out.println("投资人： " + investor.getUserName() + ",融资人帐户金额： " + investor.getBalance());

        }else{
            System.out.println(toString());
            System.out.println(investor.toString());
            System.out.println("融资人已将资金还清");
        }
    }
}
