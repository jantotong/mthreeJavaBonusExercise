import java.util.Scanner;  // Import the Scanner class

public class bonusExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and display its multiples of 3 and 5: ");
        
        try {
            int n = Integer.parseInt(sc.nextLine()); //This will prompt an NumberFormatExcept error if user didn't enter an integer
            int total = 0; //Variable used to store the total value
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    total += i; //Add to total if i is multiple of 3 or 5
                }
            }
            System.out.println(total);
        } catch (NumberFormatException e) { //Catching the error
            System.out.println("Please enter an integer type, not anything else!");
        }
    }
}
