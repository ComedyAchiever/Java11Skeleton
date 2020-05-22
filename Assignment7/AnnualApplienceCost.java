import java.util.Scanner;

class AnnualApplienceCost {
    public static void main(String[] args) {
        double costPerKwh;
        double KwhPerYear;
        double Totalcost;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter cost per Kwh in cents;");
        costPerKwh = scan.nextDouble();
        
        System.out.println("Enter Kwh used per year;");
        KwhPerYear = scan.nextDouble();
        
        Totalcost = costPerKwh * KwhPerYear;
        System.out.println("your cost is " + Totalcost);
    }
}    