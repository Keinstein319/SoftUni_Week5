import java.util.Scanner;

public class MovingOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      int a=Integer.parseInt(scanner.nextLine());
      int b=Integer.parseInt(scanner.nextLine());
      int c=Integer.parseInt(scanner.nextLine());
     String input=scanner.nextLine();

      int area=a*b*c;
      int spacetaken=0;

      while(!"Done".equals(input) && spacetaken<area){

          int boxes=Integer.parseInt(input);

          spacetaken=spacetaken+boxes;
          if (spacetaken>=area){
              break;
          }
          input=scanner.nextLine();

      }
      if (spacetaken<area){
          System.out.println((area-spacetaken)+ " Cubic meters left.");
      } if (spacetaken>=area){
            System.out.println(("No more free space! You need "+(spacetaken-area)+" Cubic meters more."));
        }


    }
}