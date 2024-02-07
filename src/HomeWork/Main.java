package HomeWork;

public class Main {
    public static void main(String[] args) {

            BancAccount account = new BancAccount(20000.0);

            double withdrawAmount = 6000.0;

            while (true) {
                try {
                    account.withdraw(withdrawAmount);
                    System.out.println("Withdrawn " + withdrawAmount + " som");
                } catch (LimitExeption e) {
                    double remainingAmount = e.getRemainingAmount();
                    System.out.println("Withdrawn " + remainingAmount + " som. Reached account limit.");
                    break;
                }
            }
    }
}
