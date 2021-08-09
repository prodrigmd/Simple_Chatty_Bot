import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int units = scanner.nextInt();

        if (units > 0 && units <= 19) {
            System.out.println("pack");
        } else if (units >= 20 && units <= 249) {
            System.out.println("throng");
        } else if (units >= 250 && units <= 999) {
            System.out.println("zounds");
        } else if (units >= 1000) {
            System.out.println("legion");
        } else {
            System.out.println("no army");
        }
    }
}