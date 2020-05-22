import java.util.Scanner;

class FantasyGame {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int maxpoints = 15;
    
    System.out.println("Welcome to comedy central");
    System.out.println("Please assign your stat points, you only get 15");
    System.out.println("Enter Health value");
    int health = scan.nextInt();
    System.out.println("Enter Strength value");
    int strength = scan.nextInt();
    System.out.println("Enter Luck value");
    int luck = scan.nextInt();
    
    if (health + strength + luck > maxpoints)
    {System.out.println("max points exceeded,stats have been lowered");
    health = 5;
    strength = 5;
    luck = 5;
        }
    System.out.println("your stats are health:" + health +" strength:" + strength +" and luck:" + luck);
    }
}