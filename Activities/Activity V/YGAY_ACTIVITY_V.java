import java.util.Scanner;
public class YGAY_ACTIVITY_V{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        
            System.out.print("Enter age: ");
           age = input.nextInt();
            
            if (age >= 0 && age <= 11) {
                System.out.println("Child");
            
            } else if (age >= 12 && age <= 17) {
                System.out.println("teen"); 

            } else if (age >= 18 && age <= 64) {
                System.out.println("adult");
           } 
        }
    }


