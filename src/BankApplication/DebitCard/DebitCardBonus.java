package BankApplication;

public class DebitCardBonus extends DebitCard {
    public DebitCardBonus(double balance) {

        super(balance);
    }

    private double balance;
    private double bonus;

    @Override
    public void topUp(double sum) {
        balance = balance + sum;
        System.out.printf("Баланс дебетовой карты пополнен на: %s%n", sum);
        System.out.printf("Остаток на дебетовой карте: %s%n", balance);
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum) {
            bonus = sum * 1 / 100; // Расчёт бонус 1% от суммы оплаты
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
                "\nБонусных баллов: " + bonus;
    }
}