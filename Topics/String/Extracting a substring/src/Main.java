import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(text.substring(num1, num2 + 1));

    }
}