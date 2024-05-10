package BankApplication;

public class DebitCard extends BankCard {
    public DebitCard(double balance) {
        super(balance);
    }

    public void toUp(double sum) {

    }

    private double balance;

    @Override
    public void topUp(double sum) {
        balance = balance + sum;
        System.out.printf("Баланс дебетовой карты пополнен на: %s%n", sum);
        System.out.printf("Остаток на дебетовой карте: %s%n", balance);
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum) {
            balance = balance - sum;
            System.out.printf("Оплата на сумму %s рублей прошла успешно.%n", sum);
            System.out.println(getAllBalance());
            return true;
        } else {
            System.out.println("Недостаточно средств");
            System.out.println(getAllBalance());
            System.out.println("Пополните баланс карты и повторите операцию");
            return false;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAllBalance() {
        return String.format("Баланс на дебетовой карте: %s", balance);
    }
}