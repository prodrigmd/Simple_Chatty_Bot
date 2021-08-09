import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int a = (number % 10) * 100;
        int b = ((number % 100) / 10) * 10;
        int c = number / 100;

        int z = a + b + c;
        System.out.println(z);
    }
}