import java.util.Scanner;
public class PRAHINOG_ACTIVITY_5{


    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age");
        int age = sc.nextInt();

        if(age<64 && age>=18){
            System.out.println("ADULT");
        }else if(age<=17 && age>=12 ){
            System.out.println("TEEN");
        }else{
            System.out.println("CHILD");
        }
    }
    
}
