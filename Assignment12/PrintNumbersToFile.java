import java.util.Scanner;
import java.io.*;

class PrintNumbersToFile {
        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            int age = 0;
            File file = new File("data.txt");
            PrintStream ps = new PrintStream(file);

            while (age != -1) {
                System.out.print("Age(-1 to exit): ");
                age = scan.nextInt();
            
                ps.println(age);
                if (age == -1) {
                    break;
                }

                System.out.print("Iq: ");
                int iq = scan.nextInt();
                ps.println(iq);
                
                System.out.print("Gender: ");
                int gender = scan.nextInt();
                ps.println(gender);
                
                System.out.print("Height(In Inches): ");
                int height = scan.nextInt();
                ps.println(height);
                ps.close();
            }
        }
    }