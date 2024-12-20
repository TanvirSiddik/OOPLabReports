import java.util.ArrayList;
import java.util.List;

class Voter {
    String name;
    int birthCertificateNumber;
    int age;

    Voter(String name, int birthCertificateNumber, int age) {
        this.name = name;
        this.birthCertificateNumber = birthCertificateNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[Name=" + name + ", Birth Certificate Number=" + birthCertificateNumber + ", Age=" + age + "]";
    }
}

public class LabReport8 {
    private static final int MIN_AGE = 18;
    private static final int SENIOR_AGE = 60;
    private static final int MONTHLY_PAY_RATE = 200;

    public static void main(String[] args) {
        Voter tanvir = new Voter("Tanvir", 1568324839, 21);
        Voter siddik = new Voter("Siddik", 1568324839, 16);
        Voter tanvirsiddik = new Voter("Tanvir Siddik", 1568324839, 42);
        Voter siddiktanvir = new Voter("Siddik Tanvir", 1568324839, 216);

        List<Voter> voters = new ArrayList<>();
        voters.add(tanvir);
        voters.add(siddik);
        voters.add(tanvirsiddik);
        voters.add(siddiktanvir);

        System.out.println("Voter Categorization:");
        for (Voter voter : voters) {
            if (voter.age >= MIN_AGE && voter.age < SENIOR_AGE) {
                System.out.println("Eligible Voter: " + voter);
            } else if (voter.age >= SENIOR_AGE) {
                int monthlyPay = voter.age * MONTHLY_PAY_RATE;
                System.out.println("Senior Voter: " + voter + ", Monthly Pay: " + monthlyPay + " Taka");
            } else {
                System.out.println("Not Eligible Voter: " + voter);
            }
        }
    }
}
