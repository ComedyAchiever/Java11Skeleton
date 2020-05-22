import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {

    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        int age = 0;

        while (age != -1) {
            age = scan.nextInt();
            System.out.println(age);
        }
        
        scan.close();
    }
}