import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int total = 0;

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                total += num;
            }
        }
        System.out.println(total);
    }
}