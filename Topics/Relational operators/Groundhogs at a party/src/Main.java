import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        boolean bool = scanner.nextBoolean();

        boolean rightCups = (num >= 10 && num <= 20 && !bool) ^ (num >= 15 && num <= 25 && bool);

        System.out.println(rightCups);
    }
}