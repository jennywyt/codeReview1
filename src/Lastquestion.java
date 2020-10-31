import java.util.Scanner;

public class Lastquestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (args.length < 2) {
            System.err.println("Please enter two numbers");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            System.out.println("The rectangle area is " + Q1.calculateRectArea(width, height));
        }
    }
}
