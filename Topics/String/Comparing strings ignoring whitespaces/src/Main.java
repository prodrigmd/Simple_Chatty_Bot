import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        String newText1 = text1.trim().replace(" ", "");
        String newText2 = text2.trim().replace(" ", "");

        System.out.println(newText1.equals(newText2));
    }
}