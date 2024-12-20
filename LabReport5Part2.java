import java.util.Scanner;

class Bank {
    private double bankBalance;

    public double getBankBalance() {
        return bankBalance;
    }

    public Bank(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public boolean transferBalance(double amount) {
        if (amount > bankBalance) {
            return false;
        } else {
            bankBalance -= amount;
            return true;
        }
    }

    public double transferBalance(double amount, String country) {
        if (amount > bankBalance) {
            return -1;
        }
        double feePercentage = switch (country) {
            case "USA" -> 0.07;
            case "CANADA" -> 0.1;
            case "AUSTRALIA" -> 0.15;
            default -> 0.05;
        };
        double fee = amount * feePercentage;
        bankBalance -= (amount + fee);
        return fee;
    }
}

public class LabReport5Part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank myAccount = new Bank(1870);

        System.out.print("Transfer Type (Domestic/International): ");
        String transferType = input.next().toUpperCase();

        switch (transferType) {
            case "DOMESTIC" -> {
                System.out.println("Current Balance: $" + myAccount.getBankBalance());
                System.out.print("Enter Transfer Amount: $");
                double amount = input.nextDouble();
                if (myAccount.transferBalance(amount)) {
                    System.out.println("$" + amount + " successfully transferred!");
                    System.out.println("After Balance Transfer: $" + myAccount.getBankBalance());
                } else {
                    System.out.println("Insufficient funds to complete the transfer.");
                }
            }
            case "INTERNATIONAL" -> {
                System.out.println("Current Balance: $" + myAccount.getBankBalance());
                System.out.print("Enter Destination Country: ");
                String country = input.next().toUpperCase();
                System.out.print("Enter Transfer Amount: $");
                double amount = input.nextDouble();
                double fee = myAccount.transferBalance(amount, country);
                if (fee == -1) {
                    System.out.println("Insufficient funds to complete the transfer.");
                } else {
                    System.out.println("$" + amount + " successfully transferred to " + country);
                    System.out.printf("Transfer Fee: $%.2f%n", fee);
                    System.out.println("After Balance Transfer: $" + myAccount.getBankBalance());
                }
            }
            default -> System.out.println("Invalid transfer type selected!");
        }

    }
}
