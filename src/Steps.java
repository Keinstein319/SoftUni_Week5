import java.util.Scanner;

public class Steps {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int stepstotal = 0;

        while (!"Going home".equals(input) && stepstotal<10000) {

            int steps = Integer.parseInt(input);

            stepstotal = steps + stepstotal;
            if (stepstotal >= 10000) {
                System.out.println("Goal reached! Good job!");
                break;
            }input=scanner.nextLine();

        }
        if ("Going home".equals(input)) {
            int last = Integer.parseInt(scanner.nextLine());
            stepstotal = stepstotal + last;
            if (stepstotal > 10000) {
                System.out.println("Goal reached! Good job!");
            } else if (stepstotal < 10000) {
                System.out.println(10000 - stepstotal + " more steps to reach goal.");
            }
        }
    }
}