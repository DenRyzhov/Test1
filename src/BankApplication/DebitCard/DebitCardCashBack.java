package BankApplication;

public class DebitCardCashBack extends DebitCard {
    public DebitCardCashBack(double balance) {

        super(balance);
    }

    private double balance;
    private double cashBack;

    @Override
    public void topUp(double sum) {
        balance = balance + sum;
        System.out.printf("Баланс дебетовой карты пополнен на: %s%n", sum);
        System.out.printf("Остаток на дебетовой карте: %s%n", balance);
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum) {
            if (sum > 5000) {
                cashBack = sum * 5 / 100; // Расчёт кешбэк 5% от суммы оплаты более 5000 не включительно
            }
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

        return "Баланс на дебетовой карте: " + balance +
                "\nНакопленный кешбэк: " + cashBack;
    }
}