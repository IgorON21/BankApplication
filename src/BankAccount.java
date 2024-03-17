import java.util.Scanner;

public interface BankAccount {
    /**
     * Данный интерфейс должен содержать методы для внесения и снятия наличных
     * и имплементироваться в классы CheckingAccount, ?Bank?.
     */
     protected double balance;

    Scanner scanner = new Scanner(System.in);
    public void deposit();

    public void withdraw();

}
