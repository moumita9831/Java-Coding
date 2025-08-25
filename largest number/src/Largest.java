import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println(" Enter Three Number : ");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter A :");
        double a = sc.nextDouble();
        System.out.print(" Enter B :");
        double b = sc.nextDouble();
        System.out.print(" Enter C :");
        double c = sc.nextDouble();


        if (a >= b && a >= c){
            System.out.println(" Your Largest Number Is: A ");
        }
        else if (b >= a && b >= c) {
            System.out.println(" Your Largest Number Is: B ");
        }
        else {
            System.out.println(" Your Largest Number Is: C ");
        }
    }
}
