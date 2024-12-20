import java.util.Scanner;

class Alibaba {

    public static double shippingCost(double weight) {
        return weight * 5;
    }

    public static double shippingCost(double weight, double distance) {
        return weight * 5 + distance * 4;
    }

    public static double shippingCost(double weight,double distance ,String destination) {
        return switch (destination) {
            case "USA" -> weight * 5 + distance * 4 + 100;
            case "CANADA" -> weight * 5 + distance * 4 + 200;
            case "AUSTRALIA" -> weight * 5 + distance * 4 + 300;
            default -> weight * 5 + distance * 4 + 50;
        };
    }
}
public class LabReport5Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Select Shipping Mode (Standard/Express/International): ");
        String shippingMode = input.nextLine().toLowerCase();


        {
            switch (shippingMode) {
                case "standard" -> {
                    System.out.print("Enter Package Weight(kg): ");
                    double weight = input.nextDouble();
                    System.out.println("Shipping Cost: " + Alibaba.shippingCost(weight));
                }
                case "express" -> {
                    System.out.print("Enter Package Weight(kg): ");
                    double weight = input.nextDouble();
                    System.out.print("Enter Distance(km): ");
                    double distance = input.nextDouble();
                    System.out.println("Shipping Cost: " + Alibaba.shippingCost(weight, distance));

                }
                case "international" -> {
                    System.out.print("Enter Package Weight(kg): ");
                    double weight = input.nextDouble();
                    System.out.print("Enter Distance(km): ");
                    double distance = input.nextDouble();
                    System.out.print("Enter Destination(country): ");
                    String destination = input.next().toUpperCase();
                    System.out.println("Shipping Cost: $" + Alibaba.shippingCost(weight, distance, destination));
                }
                default -> System.out.println("Wrong Mode Selected!");
            }
        }

    }
}
