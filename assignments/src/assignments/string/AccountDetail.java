//17. bank account
package assignments.string;
public class AccountDetail {
    public AccountDetail(){}
    private static AccountDetail single_instance = null;
    private double PhoneNumber = 0;
    private String NameOfDepositer;
    private int AccountNumber;
    private String AccountType;
    private double AccountBalance;
    public String s;

    public void SetNameOfDepositer(String name){
        NameOfDepositer = name;
    }
    public String GetNameOfDepositer(){
        return NameOfDepositer;
    }
    public void SetAccountNumber(int num){
        AccountNumber = num;
    }
    public int GetAccountNumber(){
        return AccountNumber;
    }
    public void SetAccountType(String type){
        AccountType = type;
    }
    public String GetAccountType(){
        return AccountType;
    }
    public void SetAccountBalance(double balance){
        AccountBalance = balance;
    }
    public double GetAccountBalance(){
        return AccountBalance;
    }
    public void SetPhoneNumber(double number){
        PhoneNumber = number;
    }
    public double GetPhoneNumber(){
        return PhoneNumber;
    }

    public static AccountDetail GetInstance(){
        if(single_instance == null)
            single_instance = new AccountDetail();
        return single_instance;
    }
}