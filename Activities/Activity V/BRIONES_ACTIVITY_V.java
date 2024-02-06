import java.util.Scanner;

public class BRIONES_ACTIVITY_V{
    public static void main(String []args){
         Scanner scanner = new Scanner(System.in);
    System.out.print("Enter age: ");
    int age = scanner.nextInt();

    if (age <=64 && age>=18) {
        System.out.println("Adult");
    }else if(age <=17 && age>=12){
        System.out.println("Teen");     
    }else{
        System.out.println("Child");
    }

}       
      
}        