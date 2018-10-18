import java.util.Scanner;

public class Graduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();


        int count = 1;
        int fail = 0;
        double sum = 0;


        while (count <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4) {
                sum += grade;
                count++;
            } else if (grade < 4) {

                fail++;
            }
            if (fail > 1) {
                System.out.printf("%s has been excluded at %d grade", name, count);
                break;
            }


        }
        if (count >= 12) {
            double average = sum / 12;

            System.out.printf("%s graduated. Average grade: %.2f", name, average);

        }
    }
}