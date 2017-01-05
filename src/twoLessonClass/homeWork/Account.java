package twoLessonClass.homeWork;

/**
 * Created by yy on 17/1/2.
 *
 */
public class Account extends Registered {
    /*
        帐号基本信息
     */
    private String IDCard;
    private String P2PBankCard;
    private String P2PPassword;
    private String fundBankCard;
    private String fundPassword;

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getP2PBankCard() {
        return P2PBankCard;
    }

    public void setP2PBankCard(String p2PBankCard) {
        P2PBankCard = p2PBankCard;
    }

    public String getP2PPassword() {
        return P2PPassword;
    }

    public void setP2PPassword(String p2PPassword) {
        P2PPassword = p2PPassword;
    }

    public String getFundBankCard() {
        return fundBankCard;
    }

    public void setFundBankCard(String fundBankCard) {
        this.fundBankCard = fundBankCard;
    }

    public String getFundPassword() {
        return fundPassword;
    }

    public void setFundPassword(String fundPassword) {
        this.fundPassword = fundPassword;
    }


}
