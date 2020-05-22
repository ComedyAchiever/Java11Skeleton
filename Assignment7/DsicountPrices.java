import java.util.Scanner;

class DsicountPrices {
    public static void main(String[] args) {
        double cost;
        double Totalcost;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cost in cents;");
        cost = scan.nextDouble();

        if (cost >= 1000)
        {Totalcost = cost * .9;
        } else {
            Totalcost = cost; 
        }
        System.out.println("your discounted price is " + Totalcost);
    }
}    