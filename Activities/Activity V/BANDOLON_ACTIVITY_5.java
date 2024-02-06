import java.util.Scanner;
public class BANDOLON_ACTIVITY_5 {
    public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);
        int age;
        System.out.println("Enter your age here: ");
        age = sr.nextInt();
    
    if (age >= 0 && age <= 11) {
        System.out.println("You are a child!"); 
    } else if (age >= 12 && age <= 17) {    
        System.out.println("You are a teen!");
    } else if (age >= 18 && age <= 64) {    
        System.out.println("You are an adult!");
        }      
    }
}