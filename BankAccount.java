import java.util.Random;

public class BankAccount {
    private double checkings;
    private double savings;
    private Long accountNumber;
    private static int numAccounts = 0;
    public static double bankCapital = 0;
    private static Random random = new Random();
    
    public BankAccount() {
        numAccounts++;
        accountNumber = makeID();
        checkings = 0.00;
        savings = 0.00;
    }

    private Long makeID(){
        String number = "";
        for(int i = 0; i<10; i++);
        {
            number += random.nextInt(9);
        }
        return Long.parseLong(number);
    }
    public double getChecking(){
        return checkings;
    }
    public double setChecking(){
        return checkings;
    }
    public double setSaving(){
        return savings;
    }
    public double getSaving(){
        return savings;
    }
    public double getTotal(){
        return savings + checkings;
    }
    public void deposit(double breash, Boolean isChecking){
        if(isChecking){
            checkings += breash;
        }
        else{
            savings += breash;
        }
        bankCapital += breash;
    }
    public double withdraw(double breash, Boolean isChecking){
        if(isChecking){
            if(checkings < breash){
            return 0.00;
        }
        checkings -= breash;
        }
        else{
            if(savings < breash){
                return 0.00;
            }
            savings -= breash;
        }
        bankCapital -= breash;
        return breash;
    }
}
