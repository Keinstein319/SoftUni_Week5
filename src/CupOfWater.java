import java.util.Scanner;

public class CupOfWater {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ml = Integer.parseInt(scanner.nextLine());
        String type = "asd";
        int fill = 0;
        int count = 0;

        while (fill < ml) {
            type = scanner.nextLine();
            switch (type) {
                case "Easy":
                    fill = fill + 50;
                    break;
                case "Medium":
                    fill = fill + 100;
                    break;
                case "Hard":
                    fill = fill + 200;
                    break;
            }
            count++;
        }
        if (fill == ml) {
            System.out.println("The dispenser has been tapped " + count + " times.");
        }
        if (fill > ml) {
            System.out.println(fill - ml + "ml has been spilled.");
        }
    }
}
