import java.util.Scanner;

public class CAAAAKE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

int a =Integer.parseInt(scanner.nextLine());
int b =Integer.parseInt(scanner.nextLine());

int cake=a*b;
int pieces=0;


String input=scanner.nextLine();


while (!"STOP".equals(input)){
    pieces=Integer.parseInt(input);
    cake-=pieces;

if (cake<=0){break;}
input=scanner.nextLine();
} if (cake <0){
            System.out.println("No more cake left! You need "+Math.abs(cake)+" pieces more.");
        } else if (cake>=0){
            System.out.println(cake+" pieces are left.");
        }


    }
}