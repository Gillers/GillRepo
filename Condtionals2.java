import java.util.Scanner;

public class Condtionals2 {
    public static void main(String[] args) {


    int a ;

    System.out.print("please enter a number =");
    Scanner input =new Scanner(System.in);
    a= input.nextInt();


if(a % 2 == 0 )
            System.out.println("Entered number is even");
     else
             System.out.println("Entered number is odd");
    }

}
