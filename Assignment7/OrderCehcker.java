import java.util.Scanner;

class OrderCehcker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int boltprice = 5;
        final int nutprice = 3;
        final int washerprice = 1;
        
        int boltamm, washeramm, nutamm, totalcost;
        
       System.out.println("enter bolt quantity;");
       boltamm = scan.nextInt();
        
       System.out.println("enter nut quantity;");
       nutamm = scan.nextInt();
        
       System.out.println("enter washer quantity;");
       washeramm = scan.nextInt();
       
       totalcost = boltamm * boltprice + nutprice * nutamm + washeramm * washerprice;
       if (washeramm < boltamm * 2)
        {System.out.println("not enough washers");}
        
       if (nutamm < boltamm)
        {System.out.println("not enough nuts");}
        
       System.out.println("your total cost is " + totalcost +" cents");
    }
}    