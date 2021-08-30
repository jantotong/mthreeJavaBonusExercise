import java.util.Scanner;  // Import the Scanner class

public class bonusExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and display its multiples of 3 and 5: ");
        try {
            int n = Integer.parseInt(sc.nextLine());
            int total = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    total += i;
                }
            }
            System.out.println(total);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer type, not anything else!");
        }
    }
}
