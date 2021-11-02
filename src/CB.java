import java.util.Scanner;
public class CB {
    public static void main(String[] args) {
        System.out.println("Hello! My name Boris");
        System.out.println("I was created in 2021");
        String name = "Ekateryna";
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleas, remind me your name: ");
        if (scan.hasNext(name)) {
            for (int i = 0; i < 1; i++) {
                System.out.println("What a great name you have, " + name);
            }
        }
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int age;
        Scanner scanInt = new Scanner(System.in);
        int remainder3 = scanInt.nextInt();
        int remainder5 = scanInt.nextInt();
        int remainder7 = scanInt.nextInt();
        age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + " that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanInt.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Let's test your programming knowledge\nWhy do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of program.\n" +
                "4. To interrupt the execution of a program.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("Great, you right!");
                System.out.println("Goodbye, have a nice day");
                break;
            } else {
                System.out.println("Please, try again!");
            }
        }
    }

}
