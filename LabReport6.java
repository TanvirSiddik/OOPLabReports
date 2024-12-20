class Account {
    private final String accountNumber;
    protected double balance;
    private final String accountType;

    public Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited: ৳%.2f%n", amount);
        } else {
            System.out.println("⚠️ Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.printf("Successfully withdrawn: ৳%.2f%n", amount);
        } else {
            System.out.println("⚠️ Insufficient balance or invalid withdrawal amount!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }
}

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance, "Savings");
    }

    public void addInterest() {
        double interest = balance * INTEREST_RATE;
        deposit(interest);
        System.out.printf("💰 Interest added: ৳%.2f%n", interest);
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance, "Checking");
    }
}

class Customer {
    private final String customerId;
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final Account account;

    public Customer(String customerId, String name, String address, String phoneNumber, Account account) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }

    public void displayCustomerInfo() {
        System.out.println("---------------------------------------------------");
        System.out.println("📄 Customer Details");
        System.out.printf("🔑 Customer ID    : %s%n", customerId);
        System.out.printf("👤 Name           : %s%n", name);
        System.out.printf("🏠 Address        : %s%n", address);
        System.out.printf("📞 Phone          : %s%n", phoneNumber);
        System.out.printf("💼 Account Type   : %s%n", account.getAccountType());
        System.out.printf("💵 Account Balance: ৳%.2f%n", account.getBalance());
        System.out.println("---------------------------------------------------");
    }

    public Account getAccount() {
        return account;
    }
}

public class LabReport6 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S123", 1000);
        CheckingAccount checking = new CheckingAccount("C456", 500);

        Customer customer1 = new Customer("1787", "Tanvir", "Polashbari, Ashulia", "01568324839", savings);
        Customer customer2 = new Customer("7871", "Rivnat", "DSC, Birulia", "01857325861", checking);

        System.out.println("\n🔔 Initial Account Details 🔔");
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();

        System.out.println("\n🔔 Adding Interest to Savings Account 🔔");
        savings.addInterest();
        customer1.displayCustomerInfo();

        System.out.println("\n🔔 Withdrawing from Checking Account 🔔");
        checking.withdraw(200);
        customer2.displayCustomerInfo();

        System.out.println("\n✅ Operations completed successfully!");
    }
}
