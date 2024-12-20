import java.util.Scanner;

public class LabReport2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //output using 'print'
        System.out.print("Printed something using 'print'\n");

        //output using 'println'
        System.out.println("Printed this statement using 'println'");

        //output using 'printf'
        String something = "using printf";
        System.out.printf("Printed something %s", something);

        //user input of different type of data

        //--------Primitive Data Types--------//

        System.out.print("Enter an interger number: ");
        int integer = input.nextInt();

        System.out.print("Enter a float number: ");
        float floatNumber = input.nextFloat();
        
        System.out.print("Enter a double number: ");
        double doubleNumber = input.nextDouble();

        System.out.print("Enter a boolean value: ");
        boolean isTrue = input.nextBoolean();

        System.out.print("Enter a single character: ");
        char singleChar = input.next().charAt(0);

        input.nextLine();

        //--------Non-Primitive Data Types--------//

        System.out.print("Enter a line of String: ");
        String someString = input.nextLine();

        input.close();


        //ouput to all the data entered by the user

        System.out.println("\n\n\nInteger: " + integer);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Boolean: " + isTrue);
        System.out.println("Character: " + singleChar);
        System.out.println("String: " + someString);



        //type casting
        double anDoubleNumber =  20.5556;
        System.out.println("Double: " + anDoubleNumber);
        int toInteger = (int) anDoubleNumber;
        System.out.println("This double number '20.5556' casted to 'Integer': " + toInteger);
        
        
    }
}