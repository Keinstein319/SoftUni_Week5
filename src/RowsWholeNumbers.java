import java.util.Scanner;

public class RowsWholeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int maxnum=Integer.MAX_VALUE;
        int minnum=Integer.MIN_VALUE;

        while (!"END".equals(input)){
            int num=Integer.parseInt(input);

            if (num<maxnum){
                maxnum=num;
            } if (num>minnum){
                minnum=num;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Max number: %s", minnum);
        System.out.printf("\nMin number: %s", maxnum);



    }
}