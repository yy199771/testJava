package twoLessonClass.homeWork;

import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Created by yy on 17/1/2.
 */
public class LoanTest {

    public static void main(String[] args){
        /**
            修改标的状态

        int lStatus = 4;
        Loan l = new Loan();
        lStatus = l.updateLoanStatus(lStatus);
        System.out.println(lStatus);

            查询投资人投标之后的帐户余额

        double amountPerInvestment1 = 4000;
        double amountPerInvestment2 = 3000;
        double currentBalance;
        Investor i = new Investor();
        currentBalance = i.updateInvestorBalance(amountPerInvestment1);
        currentBalance = i.updateInvestorBalance(amountPerInvestment2);
        System.out.println("投标人余额为：" + currentBalance);

            标的募集额

        double sumAmount =0;
        sumAmount = l.sumAmount(amountPerInvestment1);
        sumAmount = l.sumAmount(amountPerInvestment2);
        System.out.println("标的募集额为：" + sumAmount);
        */


        //推标
        Loan loan = new Loan();
        loan.setLoanStatus(1);
        loan.setId(10);
        loan.setTotal(1500);
        System.out.println("推标成功,当前状态为：" + loan.toString());

        //投标
        Investor investor = new Investor(0,0,99999,"JP",10001);
        Investor investor1 = new Investor(0,0,99999,"JP2",10002);
        System.out.println(investor.toString());
        investor.updateLoanBalance(loan, 1000);
        investor1.updateLoanBalance(loan, 500);

        //放款
        FinancingPerson financingPerson = new FinancingPerson("张三",20001,0);
        loan.makeLoans(financingPerson);
        System.out.println(financingPerson.toString());

        //还款
        financingPerson.repayment(investor,100);
        financingPerson.repayment(investor1,100);

    }
}
