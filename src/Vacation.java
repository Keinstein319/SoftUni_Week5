import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//https://pastebin.com/Cr8FDdDC

        double needed = Integer.parseInt(scanner.nextLine());
        double balance = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        double sum = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int count = 0;

        while (true) {

            days++;

            if (input.equals("save")) {
                count=0;
                balance += sum;

            } else if (input.equals("spend")) {

                count++;
                if (sum >= balance) {
                    balance = 0;
                } else if (balance > sum) {
                    balance -= sum;
                }

            } if (count==5){

                System.out.println("You can't save the money.");
                System.out.println(count);

                break;

            } else if (balance>=needed){

                System.out.println("You saved the money for "+days+" days.");
                break;
            }
            input=scanner.nextLine();
            sum=Integer.parseInt(scanner.nextLine());
        }
    }
}