import java.util.Scanner;

class DTicketCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double ticketprice, totalcost;
        int quantity;
        
        System.out.println("Enter Ticket price: ");
        ticketprice = scan.nextDouble();
        
        System.out.println("Enter Ticket count: ");
        quantity = scan.nextInt();
        
        totalcost = ticketprice * quantity;
        
        System.out.println("Total Cost: " + totalcost);
    }
}