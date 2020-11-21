
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account bsesAccount = new Account("Bse's account", 100.00);
        
        bsesAccount.deposit(20);
        
        
        
        System.out.println(bsesAccount);
    }
}
