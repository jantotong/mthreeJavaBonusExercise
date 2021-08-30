import java.util.Scanner;  // Import the Scanner class

public class bonusExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int total = 0;
        for (int i = 1; i<=n; i++){
            if(i % 3 == 0 || i % 5 == 0){
                total += i;
            }
        }
        System.out.println(total);
    }
}
