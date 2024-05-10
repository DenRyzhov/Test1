public abstract class BankCard   {

    private double balance;
    public BankCard(double balance){
        this.balance= balance;
    }

    public abstract void toUp(double sum);
    public abstract boolean pay(double sum);
    public abstract double getBalance();
    public abstract String getAllBalance();
}
