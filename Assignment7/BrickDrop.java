import java.util.Scanner;

class BrickDrop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d, t;
        double g = 9.81;
        
        System.out.println("Enter ammount of time falling:");
        t = scan.nextDouble();
        
        d = .5 * g * t * t;
 
        System.out.println("Total distance is "+ d);
    }
}    