import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    int count=Integer.parseInt(scanner.nextLine());
    int vnoski=0;
    double balance=0;

    while(vnoski<count){
       double deposit=Double.parseDouble(scanner.nextLine());
        if (deposit<0){
            System.out.printf("\nInvalid operation!");
            break;
        }
        balance=balance+deposit;

        vnoski++;
        System.out.printf("\nIncrease: %.2f", deposit);

    }
        System.out.printf("\nTotal: %.2f",balance);



}
}
