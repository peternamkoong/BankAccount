public class BankAccount{
    private double balance;
    private double overdraftAmount = 100.0;

    public void deposit(double var1){
        if (var1 >= 0)
            balance = balance + var1;

    }
    
    public void withdraw(double var2){
        double tempBalance = (balance - var2);

        if (tempBalance > ((-1) * overdraftAmount)){
            balance = balance - var2;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setOverdraftAmount(double var3){
        overdraftAmount = var3;

    }
}
