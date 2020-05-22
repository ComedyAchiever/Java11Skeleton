import java.util.Scanner;

class CAgeCalcDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double age, ageindays, ageinmonths;
        
        System.out.println("Enter your age:");
        age = scan.nextInt();
        
        ageindays = age * 365.25;
        ageinmonths = age * 12;
        
        System.out.println("Age in days = " + ageindays );
        System.out.println("Age in months = " + ageinmonths );
    }
}