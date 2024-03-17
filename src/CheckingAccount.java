import java.util.Scanner;

public class CheckingAccount implements BankAccount {
    /**
     * Возможность проверки баланса счета до выполнения операций по счету.
     */

 balance;

    Scanner scanner = new Scanner(System.in);
     public void deposit(){

        double y;

        System.out.println("Введите сумму к зачислению");
        y = scanner.nextInt();
        balance += y;
        System.out.println("Деньги внесены на счет, ваш баланс: " + balance);
    }
    public void withdraw(){

        System.out.println("Введите сумму к снятию");
        double p = scanner.nextInt();
        balance = balance - p;
        System.out.println("Деньги со счета сняты, остаток на счете: " + balance);
    }

}
