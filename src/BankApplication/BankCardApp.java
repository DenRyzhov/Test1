import java.util.Scanner;

public class BankCardApp {
    public static void main(String[] args) {

        double balance = 0;

        Scanner scanner = new Scanner(System.in);

        DebitCard debitCard = new DebitCard(balance);
        CreditCard creditCard = new CreditCard(balance);
        DebitCardBonus debitCardBonus = new DebitCardBonus(balance);
        DebitCardCashBack debitCardCashBack = new DebitCardCashBack(balance);
        DebitCardInterest debitCardInterest = new DebitCardInterest(balance);
        CreditCardBonus creditCardBonus = new CreditCardBonus(balance);
        CreditCardCashBack creditCardCashBack = new CreditCardCashBack(balance);
        CreditCardInterest creditCardInterest = new CreditCardInterest(balance);

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("На какую сумму вы хотите пополнить баланс дебетовой карты?");
                double sum = scanner.nextDouble();
                debitCard.topUp(sum);
            } else if (command == 2) {
                System.out.println(debitCard.getAllBalance());
            } else if (command == 3) {
                System.out.println("На какую сумму совершить оплату?");
                double sum = scanner.nextDouble();
                debitCard.pay(sum);
            } else if (command == 4) {
                System.out.println("На какую сумму вы хотите пополнить баланс кредитной карты?");
                double sum = scanner.nextDouble();
                creditCard.topUp(sum);
            } else if (command == 5) {
                System.out.println(creditCard.getAllBalance());
            } else if (command == 6) {
                System.out.println("На какую сумму совершить оплату?");
                double sum = scanner.nextDouble();
                creditCard.pay(sum);
            } else if (command == 7) {
                System.out.println("На какую сумму вы хотите пополнить баланс дебетовой карты?");
                double sum = scanner.nextDouble();
                debitCardBonus.topUp(sum);
            } else if (command == 8) {
                System.out.println("На какую сумму совершить оплату?");
                double sum = scanner.nextDouble();
                debitCardBonus.pay(sum);
            } else if (command == 9) {
                System.out.println(debitCardBonus.getAllBalance());
            } else if (command == 10) {
                System.out.println("На какую сумму вы хотите пополнить баланс дебетовой карты?");
                double sum = scanner.nextDouble();
                debitCardCashBack.topUp(sum);
            } else if (command == 11) {
                System.out.println("На какую сумму совершить оплату?");
                double sum = scanner.nextDouble();
                debitCardCashBack.pay(sum);
            } else if (command == 12) {
                System.out.println(debitCardCashBack.getAllBalance());
            } else if (command == 13) {
                System.out.println("На какую сумму вы хотите пополнить баланс дебетовой карты?");
                double sum = scanner.nextDouble();
                debitCardInterest.topUp(sum);
            } else if (command == 14) {
                System.out.println("На какую сумму совершить оплату?");
                double sum = scanner.nextDouble();
                debitCardInterest.pay(sum);
            } else if (command == 15) {
                System.out.println(debitCardInterest.getAllBalance());
            } else if (command == 16) {
                System.out.println("На какую сумму вы хотите пополнить баланс кредитной карты?");
                double sum = scanner.nextDouble();
                creditCardBonus.topUp(sum);
            } else if (command == 17) {
                System.out.println("На какую сумму совершить оплату?");
                double sum = scanner.nextDouble();
                creditCardBonus.pay(sum);
            } else if (command == 18) {
                System.out.println(creditCardBonus.getAllBalance());
            } else if (command == 19) {
                System.out.println("На какую сумму вы хотите пополнить баланс кредитной карты?");
                double sum = scanner.nextDouble();
                creditCardCashBack.topUp(sum);
            } else if (command == 20) {
                System.out.println("На какую сумму совершить оплату?");
                double sum = scanner.nextDouble();
                creditCardCashBack.pay(sum);
            } else if (command == 21) {
                System.out.println(creditCardCashBack.getAllBalance());
            } else if (command == 22) {
                System.out.println("На какую сумму вы хотите пополнить баланс кредитной карты?");
                double sum = scanner.nextDouble();
                creditCardInterest.topUp(sum);
            } else if (command == 23) {
                System.out.println("На какую сумму совершить оплату?");
                double sum = scanner.nextDouble();
                creditCardInterest.pay(sum);
            } else if (command == 24) {
                System.out.println(creditCardInterest.getAllBalance());
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой операции пока нет. Но мы работаем над этим.");
            }

        }
    }

    public static void printMenu() {
        System.out.println("\nЧто вы хотите сделать? ");

        System.out.println("1 - Пополнить дебетовую карту");
        System.out.println("2 - Получить информацию о балансе дебетовой карты");
        System.out.println("3 - Оплатить дебетовой картой");

        System.out.println("4 - Пополнить кредитную карту");
        System.out.println("5 - Получить информацию о балансе кредитной карты");
        System.out.println("6 - Оплатить кредитной картой");

        System.out.println("7 - Пополнить дебетовую карту Бонус 1%");
        System.out.println("8 - Оплатить дебетовой картой Бонус 1%");
        System.out.println("9 - Получить информацию о балансе дебетовой карты Бонус 1%");

        System.out.println("10 - Пополнить дебетовую карту Кешбэк 5%");
        System.out.println("11 - Оплатить дебетовой картой Кешбэк 5%");
        System.out.println("12 - Получить информацию о балансе дебетовой карты Кешбэк 5%");

        System.out.println("13 - Пополнить дебетовую карту Накопление в размере 0.005%");
        System.out.println("14 - Оплатить дебетовой картой Накопление в размере 0.005%");
        System.out.println("15 - Получить информацию о балансе дебетовой карты Накопление в размере 0.005%");

        System.out.println("16 - Пополнить кредитную карту Бонус 1%");
        System.out.println("17 - Оплатить кредитной картой Бонус 1%");
        System.out.println("18 - Получить информацию о балансе кредитной карты Бонус 1%");

        System.out.println("19 - Пополнить кредитную карту Кешбэк 5%");
        System.out.println("20 - Оплатить кредитной картой Кешбэк 5%");
        System.out.println("21 - Получить информацию о балансе кредитной карты Кешбэк 5%");

        System.out.println("22 - Пополнить кредитную карту Накопление в размере 0.005%");
        System.out.println("23 - Оплатить кредитной картой Накопление в размере 0.005%");
        System.out.println("24 - Получить информацию о балансе кредитной карты Накопление в размере 0.005%");

        System.out.println("0 - Выход");
    }
}


    }
