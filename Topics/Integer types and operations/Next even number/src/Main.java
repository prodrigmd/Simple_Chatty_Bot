import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int remainder = number % 2;
        int number2 = number + (2 - remainder);

        System.out.println(number2);
    }
}