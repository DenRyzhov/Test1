package BankApplication;

public class CreditCardInterest extends CreditCard {
    public CreditCardInterest(double balance) {
        super(balance);
    }

    private final double creditLimit = 10_000; // Кредитный лимит устанавливается банком
    private double creditBalance = creditLimit; // Кредитные средства
    private double balance; // Собственные средства
    private double interest; // Накопление

    @Override
    public void topUp(double sum) {
        if (creditBalance < creditLimit) {
            double difference = creditLimit - creditBalance;
            if (sum <= difference) {
                creditBalance = creditBalance + sum;
                interest = sum * 0.005 / 100; // Расчёт накопления 0.005% от суммы пополнения
            }
            if (sum > difference) {
                creditBalance = creditBalance + difference;
                balance = balance + sum - difference;
                interest = sum * 0.005 / 100;
            }
            System.out.printf("Баланс кредитной карты пополнен на: %s%n", sum);
            System.out.println(getAllBalance());
        } else if (creditBalance >= creditLimit) {
            balance = balance + sum;
            interest = sum * 0.005 / 100;
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
        return "Основные средства кредитной карты:" +
                "\nКредитные средства: " + creditBalance +
                "\nСобственные средства: " + balance +
                "\nНакопление: " + interest;
    }
}