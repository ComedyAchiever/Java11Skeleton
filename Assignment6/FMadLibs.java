import java.util.Scanner;

class FMadLibs  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name, feature, animal;
        
        System.out.println("Enter A Name: ");
        name = scan.nextLine();
        
        System.out.println("Enter A Feature: ");
        feature = scan.nextLine();
        
        System.out.println("Enter An Animal: ");
        animal = scan.nextLine();
        
        System.out.format( "%s has %s like a(n) %s", name, feature, animal);
    }
}