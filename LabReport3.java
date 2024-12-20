import java.util.Scanner;

public class LabReport3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //if-else
        System.out.println("----------IF-ELSE----------");
        System.out.print("Enter Any Integer Number: ");
        int anyNumber = input.nextInt();
       
        if (anyNumber % 2 == 0) {
            System.out.println("A even number!");
        } else {
            System.out.println("Not a even number!");
        }

        //3 types of loop
        System.out.println("\n----------LOOPS----------");
        //for loop
        System.out.println("Printing Integer 1-10 Using 'For-Loop'");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nPrinting Integer 1-10 Using 'While-Loop'");
        //while loop
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\nPrinting Integer 1-10 Using 'Do-While' Loop");
        //do while loop
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);

        //continue
        System.out.println("\n\n-------Using Continue!-------");
        
        for (int k = 1; k < 11; k++) {
            if (k == 5) {
                System.out.print("Skipped! ");
                continue;
            } 
            System.out.print(k + " ");
        }

        //break
        System.out.println("\n\n-------Using Break!-------");
        for (int k = 1; k < 11; k++) {
            if (k == 5) {
                System.out.print("Exited! ");
                break;
            } 
            System.out.print(k + " ");
        }
        //array
        System.out.println("\n\n-------Array!-------");
        

        int[] arr = new int[5];
        //taking input
        System.out.print("Enter 5 Integer Numbers: ");
        for (int k = 0; k < arr.length; k++) {
            arr[k] = input.nextInt();
        }
        input.close();

        //showing output
        System.out.print("Output: ");
        for (int elements : arr) {
            System.out.print(elements + " ");
        }

    }
}
