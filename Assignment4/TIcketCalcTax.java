public class TIcketCalcTax {
    public static void main(String[] args) {
        double ticketcost = 23.45;
        double ticketcount = 8;
        double totalcost = ticketcount * ticketcost;
        double ticketwotax = totalcost * 0.12;
        double ticketwtax = totalcost * 1.12;
        
        System.out.println("Total tax: " + ticketwotax);
        System.out.println("Total Cost with tax: " + ticketwtax);
    }
}    
