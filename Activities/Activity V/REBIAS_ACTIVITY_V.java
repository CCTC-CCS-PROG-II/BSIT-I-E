import java.util.Scanner;
public class REBIAS_ACTIVITY_V {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

            System.out.print("Enter age: ");
            age = input.nextInt();
            if(age>= 0 && age <= 11) {
                System.out.print("Child");

            }else if(age >=12 && age <= 17) {
                System.out.println("Teen");

            }else if(age >=18 && age <=64) {
                System.out.println("Adult");
        }
    }
}
