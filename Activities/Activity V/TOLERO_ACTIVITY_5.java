import java.util.Scanner;

public class TOLERO_ACTIVITY_V {
    
    public static void main(String[] args) {
        
        Scanner Ages = new Scanner(System.in);
        System.err.print("Enter the age of the person:");
        int age = Ages.nextInt();

        if (age >= 0 && age <= 11){
            System.out.println("Child");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Teen");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Adult");
        } else {
            System.out.println(" Invalid age. Please enter a non-negative age");
        }
    }
}
