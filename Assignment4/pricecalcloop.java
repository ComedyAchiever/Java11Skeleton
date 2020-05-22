public class pricecalcloop {
    public static void main(String[] args) {
        double itemcost = 1.47;
        int itemcount = 4;
        double totalcost = 0;
        
        for (int i = 0; i < itemcount; i++) {
            totalcost = totalcost + itemcost;
        }
        System.out.println("Total price: " + totalcost);
    }
}    
