import java.util.Scanner;
public class TheTriangle03 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput;
        int i = 0;
        String s = " ";

        System.out.print("Input some number: ");
        numInput = scanner.nextInt();

        while (i < numInput) {
            s += "*";
            System.out.println(s);
            i++;  
        }
    }
}
