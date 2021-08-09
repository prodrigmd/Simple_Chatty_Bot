import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int snail = 0;
        int snaila;
        int day = 0;

        do {
            snaila = snail + a;
            snail = snail + (a - b);
            day++;
        } while (snaila < h);

        System.out.println(day);
    }
}