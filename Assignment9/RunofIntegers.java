import java.util.Scanner;

class RunOfIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int runStart;
        int runEnd;
        
        // getting first integer
        System.out.println("Enter start:");
        runStart = scan.nextInt();
        
        //getting second integer
        System.out.println("Enter end:");
        runEnd = scan.nextInt();
        
        // getting the ints and finding the numbers in between them
        while (runStart <= runEnd) {
            System.out.println(runStart);
            runStart += 1;
        }
    }
}