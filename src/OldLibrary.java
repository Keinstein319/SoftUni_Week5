import java.util.Scanner;

public class OldLibrary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        int limit = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;

        while (!title.equals(input)) {
            count++;
            if (count==limit){break;}
            input = scanner.nextLine();

        }
        if (title.equals(input)) {
            System.out.println("You checked " + count + " books and found it.");
        } else if (!title.equals(input) || count >= limit) {
            System.out.println("The book you search is not here!");
            System.out.println("You checked " + count + " books.");
        }
    }
}