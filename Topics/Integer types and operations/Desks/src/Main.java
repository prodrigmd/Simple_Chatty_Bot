import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int studentsClassA = scanner.nextInt();
        int studentsClassB = scanner.nextInt();
        int studentsClassC = scanner.nextInt();

        int desksClassA = studentsClassA / 2 + studentsClassA % 2;
        int desksClassB = studentsClassB / 2 + studentsClassB % 2;
        int desksClassC = studentsClassC / 2 + studentsClassC % 2;

        int totalDesks = desksClassA + desksClassB + desksClassC;

        System.out.println(totalDesks);
    }
}