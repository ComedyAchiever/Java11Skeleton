import java.util.Scanner;

class BCalcPaintArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long width, height, area;
        double paintprice, totalpaintprice;
        
        System.out.println("Enter a width:");
        width = scan.nextInt();
        
        System.out.println("Enter a height:");
        height = scan.nextInt();
        
        area = width * height;
        
        System.out.println("Enter The Price of paint:");
        paintprice = scan.nextDouble();
        
        totalpaintprice = paintprice * area;
        System.out.println("Cost of paint: $" + totalpaintprice);
    }
}