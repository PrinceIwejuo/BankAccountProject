public class Program{

    public static void main(String[] args) {
        BankAccount rinz = new BankAccount();
        BankAccount collins = new BankAccount();
        
        rinz.deposit(5000.00, true);
        collins.deposit(7000.00, true);
        System.out.println(collins.getTotal());
        
        rinz.withdraw(250.0, true);
        System.out.println(rinz.getTotal());
        System.out.println(BankAccount.bankCapital);
    }
}