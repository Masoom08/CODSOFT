import java.util.*;

class ATMinterface {
    double balance = 0.0; 
    void withdraw(double amt) {
        if (amt > balance)
            balance = balance - amt;
        else
            System.out.println("Insufficient balance ");
    }
    void deposit(double amt) {
        balance = balance + amt;
    }
    void checkbalance() {
        System.out.println("Your balance is " + balance);
    }
    public static void main() {
        try (Scanner scanner = new Scanner(System.in)) {
            ATMinterface t = new ATMinterface();
            System.out.println("Welcome to Bank");
            System.out.println("Press 1 to Withdraw ");
            System.out.println("Press 2 to deposit ");
            System.out.println("Press 3 to check balance");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Please enter the amt");
                    double a = scanner.nextDouble();
                    t.withdraw(a);
                    break;
                case 2:
                    System.out.println("Please enter the amt");
                    double b = scanner.nextDouble();
                    t.deposit(b);
                    break;
                case 3:
                    t.checkbalance();
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
