import java.util.Scanner;

class PracticeTwo {
    public static void main(String[] args) {
        

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an iteger: ");
    int sidelength = scan.nextln();
    
    while (rowCount < sideLength) {
        int count = 0;
        while (count < sidelength) {
            System.out.print("#");
            count++;
        }
        System.out.println();
        rowCount++;
    }
}