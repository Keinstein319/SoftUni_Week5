import java.util.Scanner;

public class NOD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int remain=0;
        int count=0;

         while (a%b!=0){
             count++;
            remain=a%b;
            a=b;
            b=remain;
        }if (count>0){
        System.out.println(remain);}
        else System.out.println(b);
}
    }