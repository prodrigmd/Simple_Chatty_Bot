import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int hotelPerNight = scanner.nextInt();

        int total = foodPerDay * days + oneWayFlight * 2 + hotelPerNight * (days - 1);

        System.out.println(total);
    }
}