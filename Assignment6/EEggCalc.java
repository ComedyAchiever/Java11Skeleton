import java.util.Scanner;

class EEggCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int eggammount, eggdozens, eggsingles;
        
        System.out.println("Enter ammount of eggs: ");
        eggammount = scan.nextInt();
        
        eggdozens = eggammount / 12;
        eggsingles = eggammount % 12;
        
        System.out.println("you have " + eggdozens + " dozens and " + eggsingles + " eggs");
    }
}