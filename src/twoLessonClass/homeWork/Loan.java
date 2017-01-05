package twoLessonClass.homeWork;

/**
 * Created by yy on 17/1/2.
 */
public class Loan {
    /*
        标的类
     */

    //标的名称
    private String loanName;
    //标的id
    private int id;
    //年利率
    private double annualInterestRate;
    //还款期限
    private int repaymentTerm;
    //标的总额
    private double total;
    //标的状态
    private int loanStatus;
    //标的募集额
    private double raiseFunds;

    public Loan() {
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getRepaymentTerm() {
        return repaymentTerm;
    }

    public void setRepaymentTerm(int repaymentTerm) {
        this.repaymentTerm = repaymentTerm;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(int loanStatus) {
        this.loanStatus = loanStatus;
    }

    public double getRaiseFunds() {
        return raiseFunds;
    }

    public void setRaiseFunds(double raiseFunds) {
        this.raiseFunds = raiseFunds;
    }

    public Loan(String loanName, int id, double annualInterestRate, int repaymentTerm, double total, int loanStatus, double raiseFunds) {
        this.loanName = loanName;
        this.id = id;
        this.annualInterestRate = annualInterestRate;
        this.repaymentTerm = repaymentTerm;
        this.total = total;
        this.loanStatus = loanStatus;
        this.raiseFunds = raiseFunds;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanName='" + loanName + '\'' +
                ", id=" + id +
                ", annualInterestRate=" + annualInterestRate +
                ", repaymentTerm=" + repaymentTerm +
                ", total=" + total +
                ", loanStatus=" + loanStatus +
                ", raiseFunds=" + raiseFunds +
                '}';
    }

    /*
                标的募集金额。
            */
    public double sumAmount(double amount){
        raiseFunds += amount;
        return raiseFunds;
    }

    /*
        标的满标与流标的判断

    public double loanIsFull(Investor investor) {
        Investor i = new Investor();
        if (total == raiseFunds) {
            loanStatus = updateLoanStatus(5);
            return loanStatus;
        }else{
            return 6;
        }
    }
     */

    /* 修改标的状态。
            1：初始化
            2：初审
            3: 2审
            4：确认推标，标的处于开放可以购买状态。
    */
    public int updateLoanStatus(int loanStatus){
        loanStatus = loanStatus;
        switch (loanStatus){
            case 1:
                loanStatus = 2;
                return loanStatus;
            case 2:
                loanStatus = 3;
                return loanStatus;
            case 3:
                loanStatus = 4;
                return loanStatus;
            case 4:
                loanStatus = 5;
                return loanStatus;
            default:
                loanStatus = 6;
                return loanStatus;
        }
    }
    //放款
    public void makeLoans(FinancingPerson financingPerson){
        financingPerson.setFinancingPersonAmount(getTotal());
        System.out.println("融资人: " + financingPerson.getFinancingPersonName() + " 帐户金额：" + financingPerson.getFinancingPersonAmount());
    }

}
