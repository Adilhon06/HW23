package HomeWork;

public class BancAccount {
    private double amount;

    public BancAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withdraw(double sum) throws LimitExeption {
        if (sum > amount) {
            throw new LimitExeption("Запрошенная сумма превышает баланс счета", amount);
        }

        amount -= sum;
    }
}
