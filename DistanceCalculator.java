import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());

        int count = steps / 5;

        double stepsInCM = ((steps - count) * length);


        double lessDistance = count * length * 0.70;

        double totalDistanceTravelled = (stepsInCM + lessDistance) / 100;

        double result = (totalDistanceTravelled / distance) * 100;

        System.out.printf("You travelled %.2f%% of the distance!", result);
    }
}
