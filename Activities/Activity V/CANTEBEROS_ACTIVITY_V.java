import java.util.Scanner;
public class CANTEBEROS_ACTIVITY_V {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        do{
            System.out.print("Enter age: ");
            age = input.nextInt();

            if(age>= 0 && age <= 11){
                System.out.println("Child");
            }

            else if(age >=12 && age <= 17){
                System.out.println("Teen");
            }

            else if(age >=18 && <= 64){
                System.out.println("Adult");
                
            }
        }
    }
}