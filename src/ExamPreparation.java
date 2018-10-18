import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int limit = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();
        String backup="asd";
        int grade = Integer.parseInt(scanner.nextLine());


        double gradetotal = 0;
        int max = 0;
        int count = 1;

        while (true) {

            if (grade <= 4) {
                max++;
            }
            gradetotal += grade;

            if (max == limit) {
                break;
            }


            problem = scanner.nextLine();
            if ("Enough".equals(problem)) {

                break;
            } backup=problem;
            count++;
            grade = Integer.parseInt(scanner.nextLine());

        }
        if (max == limit) {
            System.out.println("You need a break, " + limit + " poor grades.");
        } else {
            System.out.printf("Average score: %.2f", (gradetotal / count));
            System.out.printf("\nNumber of problems: %d", count);
            System.out.printf("\nLast problem: %s", backup);
        }
    }
}