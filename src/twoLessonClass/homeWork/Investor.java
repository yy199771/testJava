package twoLessonClass.homeWork;

/**
 * Created by yy on 17/1/2.
 *
 */
public class Investor extends Account {
    /*
        投资人帐户子类
     */
        /*
        投标人投标
     */
    //每次投资金额
    //private double amountPerInvestment;
    //总资产
    private double totalAssets;
    //P2P总资产
    private double totalP2P;
    //帐户余额
    private double balance;
    //name
    private String userName;
    //id
    private int userId;

    public Investor(double totalAssets, double totalP2P, double balance, String userName, int userId) {
        this.totalAssets = totalAssets;
        this.totalP2P = totalP2P;
        this.balance = balance;
        this.userName = userName;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(double totalAssets) {
        this.totalAssets = totalAssets;
    }

    public double getTotalP2P() {
        return totalP2P;
    }

    public void setTotalP2P(double totalP2P) {
        this.totalP2P = totalP2P;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Investor{" +
                "totalAssets=" + totalAssets +
                ", totalP2P=" + totalP2P +
                ", balance=" + balance +
                ", userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }

    //投资人完成投资之后，帐户余额。
    public double updateInvestorBalance(double amountPerInvestment){
        balance -= amountPerInvestment ;
        return balance;
    }

    public void updateLoanBalance(Loan loan, double amount){

        //投资人减钱
        setBalance(this.balance - amount);
        System.out.print("投资人：" + getUserName() + "投资金额：" + amount + "剩余余额：" + this.balance);
        //募集金额＋钱
        loan.setRaiseFunds(loan.getRaiseFunds() + amount);
        //是否满标
        if(loan.getTotal() == loan.getRaiseFunds()){
            System.out.println("已满标");
        }else{
            System.out.println("剩余可投金额：" + (loan.getTotal() - loan.getRaiseFunds()));
        }
    }
}
