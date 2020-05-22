import java.util.Scanner;

class Exercisetwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //declaring variables
        int count;
        String inputString;
        int times;

        //getting the word input
        System.out.println("Enter word:");
        inputString = scan.nextLine();

        times = inputString.length();

        count = 1;

        while (count<=times) {
            System.out.println(inputString);
            count = count + 1;
        }
    }
}