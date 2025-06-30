class Bank {
    private int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InSufficientFundsException {
        if (amount > balance) {
            throw new InSufficientFundsException();
        }

        balance -= amount;
    }
}

class InSufficientFundsException extends Exception {
    public InSufficientFundsException() {
        super("Error what");
    }
}

public class Exceptions2 {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank(10);
        sbi.withdraw(11);
    }
}
