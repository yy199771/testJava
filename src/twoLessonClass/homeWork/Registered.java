package twoLessonClass.homeWork;

/**
 * Created by yy on 17/1/2.
 *
 */
public class Registered {
    /*
    注册帐号基本信息
     */

    private int id;
    private String name;
    private String loginPassword;
    private int age;
    private String telephoneNumber;
    private String email;
    //帐号类型，区分投资人还是融资人
    private int accountType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //判断登录是否成功
    public String login(String telephoneNumber, String loginPassword){
        if(telephoneNumber == "aaa" || loginPassword == "bbb"){
            return "login is Success!";
        }else{
            return "login is failed!";
        }
    }

}
