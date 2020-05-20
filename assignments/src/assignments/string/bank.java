package assignments.string;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;  
public class bank extends AccountDetail {
    public static int genRandomNumber()
    {
        Random r = new Random(System.currentTimeMillis());
        int num = ((1+r.nextInt(2)) * 10 + r.nextInt(10));
        return (54300 + num);
    }
    public static AccountDetail UploadNewAcountInformation(Integer AccNum,AccountDetail AccountDetailObject){
        Scanner sc = new Scanner(System.in);
        AccountDetailObject.SetAccountNumber(AccNum);
        System.out.println("Enter the Account Holder Name");
        String name = sc.nextLine();

        AccountDetailObject.SetNameOfDepositer(name);      
        System.out.println("Enter the Mobile number");
        double phNum = sc.nextDouble();

        AccountDetailObject.SetPhoneNumber(phNum);
        System.out.println("Enter the AccountType");
        Boolean AcType = true;
        String AccountType = "";
        while(AcType){
            System.out.println("Enter 1 Saving Account");
            System.out.println("Enter 2 Current Account");
            Integer type = sc.nextInt();
            if(type == 1){
                AccountType = "Savings Account";
                AcType = false;
            }
            else if(type == 2){
                AccountType = "Current Account";
                AcType = false;
            }
            else{
                System.out.println("Enter the proper input");
            }
        }
        AccountDetailObject.SetAccountType(AccountType);

        System.out.println("Enter the deposit Amount");
        int DepositAmount = sc.nextInt();
        AccountDetailObject.SetAccountBalance(DepositAmount);

//        sc.close();
        return AccountDetailObject;
    }
    public static void addDetail(AccountDetail AccountDetailObject){
        boolean addDetailActiveTime = true;
        while(addDetailActiveTime){
            System.out.println("Enter 1 to Edit Phone Number");
            System.out.println("Enter 2 to Edit Name");
            System.out.println("Enter 0 to Quit");
            Scanner sc = new Scanner(System.in);
            Integer Opt = sc.nextInt();
            sc.nextLine();
            if(Opt == 1){
                System.out.println("Enter the new phone number");
                double PhNum = sc.nextDouble();
                sc.nextLine();
                AccountDetailObject.SetPhoneNumber(PhNum);
            }
            else if(Opt == 2){
                System.out.println("Enter the Name ");
                String Depositername = sc.nextLine();
                sc.nextLine();
                AccountDetailObject.SetNameOfDepositer(Depositername);
            }
            else{
                addDetailActiveTime = false;
            }

        }
    }
    public static void displayNameandBalance(AccountDetail AccountDetailObject){
        System.out.println("The name of the Account Holder is:- " + AccountDetailObject.GetNameOfDepositer());
        System.out.println("Account Balance is = " + AccountDetailObject.GetAccountBalance());
    }
    public static void depositAmount(AccountDetail AccountDetailObject){
        double oldAmount = AccountDetailObject.GetAccountBalance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposit amount");
        double newAmout = sc.nextDouble();
        AccountDetailObject.SetAccountBalance(oldAmount+newAmout);   
    }
    public static void withdrawAmount(AccountDetail AccountDetailObject){
        boolean AmountDrawTime = true;
        while(AmountDrawTime){
            double accountBalance = AccountDetailObject.GetAccountBalance();
            System.out.println("Current Balance in your account is = Rs." + accountBalance);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Withdraw Amount amount");
            double newAmout = sc.nextDouble();
            if(newAmout <= accountBalance){
                System.out.println("You have withdraw the amount Rs." + newAmout);
                System.out.println("The Remaining balance is Rs." + (accountBalance - newAmout));
                AccountDetailObject.SetAccountBalance(accountBalance - newAmout);
                AmountDrawTime = false;
            }
            else{
                System.out.println("You do not have sufficient balance to withdraw ");
            }
        }
    }
    public static AccountDetail loginToAccount(Integer AccNum,AccountDetail AccountDetailObject){
        if(AccountDetailObject.GetPhoneNumber() == 0){
            System.out.println("Welcome to manipal Banking");
            AccountDetail UpdatedDetail = UploadNewAcountInformation(AccNum,AccountDetailObject);
            return UpdatedDetail;
        }
        else{
            boolean LoginTime = true;
            while(LoginTime){
                System.out.println("Enter 1 to add/Edit detail");
                System.out.println("Enter 2 to display name and ballance");
                System.out.println("Enter 3 to deposit amount");
                System.out.println("Enter 4 to withdraw amount");
                System.out.println("Enter 5 to quit");
                Scanner sc = new Scanner(System.in);
                int opt = sc.nextInt();
                if(opt == 1){
                    addDetail(AccountDetailObject);
                }
                else if(opt == 2){
                    displayNameandBalance(AccountDetailObject);
                }
                else if(opt == 3){
                    depositAmount(AccountDetailObject);
                }   
                else if(opt == 4){
                    withdrawAmount(AccountDetailObject);
                }
                else if(opt == 5){
                    LoginTime = false;
                }             
                else{
                    System.out.println("Enter the proper input");
                }
            }
            return AccountDetailObject;
        }
    }
    public static void main(String[] args) {
        Map<Integer,AccountDetail> AccountInformation = new HashMap<Integer,AccountDetail>();
        System.out.println("Welcome to bank");
        while(true){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter 1 to creat new Account");
            System.out.println("Enter 2 login to account");
            System.out.println("Enter 3 to Shutdown the application");
            int option_entry = sc1.nextInt();
            if(option_entry == 1){
                int GeneratedAccountnum = genRandomNumber();
                System.out.println("Your account Number is:- " + GeneratedAccountnum);
                AccountDetail Generatedinst = new AccountDetail();
                boolean acountNumberIteration = true;
                for(int accountNumber : AccountInformation.keySet()) {
                    if(accountNumber == GeneratedAccountnum)
                    {
                        System.out.println("The number is exist");
                        acountNumberIteration = false;
                    }
                }
                if(acountNumberIteration){
                    AccountInformation.put(GeneratedAccountnum, Generatedinst);
                    AccountDetail obj = loginToAccount(GeneratedAccountnum,Generatedinst);
                    AccountInformation.replace(GeneratedAccountnum,obj);
                }
            }
            else if(option_entry == 2){   
                System.out.println("Enter the customer Account number:-");    
                int CustomerAccountNumber = sc1.nextInt();
                for(int accountNumber : AccountInformation.keySet()) {
                    if(accountNumber == CustomerAccountNumber)
                    {
                        AccountDetail OldObj = AccountInformation.get(CustomerAccountNumber);
                        AccountDetail NewObj = loginToAccount(CustomerAccountNumber,OldObj);
                        AccountInformation.replace(CustomerAccountNumber,NewObj);
                    }
                }
            }
            else if(option_entry == 3){
                System.out.println("Thanks for Banking");
                //System.out.println("Developed by chandan");
                sc1.close();                
                break;
            }
            else{
                System.out.println("Enter the proper input");
            }
        }
            
    }
}