import java.util.Scanner;
public class SUNGKIP_ACTIVITY_V {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int age;
        do{
            System.out.print("Enter your age: ");
            age = sc.nextInt();
             
            if(age >= 0 && age <= 11){
                System.out.println("child");
            }else if(age >= 12 && age <= 17){
                System.out.println("teen");
            }else if (age >= 64) {
                System.out.println("adult");
            }
        }while(age != -100);
    }
}