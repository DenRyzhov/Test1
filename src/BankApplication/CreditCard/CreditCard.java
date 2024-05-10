package BankApplication;

public class CreditCard extends BankCard {
    public CreditCard(double balance) {
        super(balance);
    }

    @Override
    public void toUp(double sum) {

    }

    private final double creditlimit = 10000;
    private double creditBalance = creditlimit;
    private double balance;

    @Override
    public void topUp(double sum) {
        if (creditBalance < creditlimit) {
            double difference = creditlimit - creditBalance;
            if (sum <= difference) {
                creditBalance = creditBalance + sum;
            }
            if (sum > difference) {
                creditBalance = creditBalance + difference;
                balance = balance + sum - difference;
            }
            System.out.printf("Баланс кредитной карты пополнен на: %s%n", sum);
            System.out.println(getAllBalance());
        } else if (creditBalance >= creditlimit) {
            balance = balance + sum;
            System.out.printf("Баланс кредитной карты пополнен на: %s%n", sum);
            System.out.println(getAllBalance());
        }
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum) {
            balance = balance - sum;
            System.out.printf("Оплата на сумму %s рублей прошла успешно.%n", sum);
            System.out.println(getAllBalance());
            return true;
        } else if (balance < sum && sum <= (balance + creditBalance)) {
            double difference = sum - balance;
            balance = balance + difference - sum;
            creditBalance = creditBalance - difference;
            System.out.printf("Оплата на сумму %s рублей прошла успешно.%n", sum);
            System.out.println(getAllBalance());
            return true;
        } else if (balance + creditBalance < sum) {
            System.out.println("ВНИМАНИЕ! Недостаточно средств");
            System.out.println(getAllBalance());
            System.out.println("Пополните баланс карты и повторите операцию");
            return false;
        } else {
            System.out.println("ВНИМАНИЕ! Недостаточно средств");
            System.out.println(getAllBalance());
            System.out.println("Пополните баланс карты и повторите операцию");
            return false;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double getCreditBalance() {
        return creditBalance;

    }

    @Override
    public String getAllBalance() {
        return String.format("Основные средства кредитной карты:\nКредитные средства: %s\nСобственные средства: %s",
                creditBalance, balance);
    }
}