import java.util.Scanner;

class IntegerAdding {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many numbers will be added up: ");
    int sum = 0;
    int numammount = scan.nextInt();
    
    int count = 0;
    while (count < numammount) {
        System.out.println("Enter an integer: ");
        sum += scan.nextInt();
        
        count++;
        }
    System.out.println(sum);
    }
}