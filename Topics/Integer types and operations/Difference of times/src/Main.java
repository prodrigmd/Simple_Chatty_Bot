import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int number6 = scanner.nextInt();

        int secondsFirst = number1 * 60 * 60 + number2 * 60 + number3;
        int secondsLast = number4 * 60 * 60 + number5 * 60 + number6;

        System.out.println(secondsLast - secondsFirst);
    }
}