import java.util.Scanner;

class ACalculateRectArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long width, height, area;
        
        System.out.println("Enter a width:");
        width = scan.nextInt();
        
        System.out.println("Enter a height:");
        height = scan.nextInt();
        
        area = width * height;
        
        System.out.println("area = " + area );
    }
}