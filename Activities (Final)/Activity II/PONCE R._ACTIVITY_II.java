import java.util.Scanner;
public class RICKY P._ACTIVITY_II{
    static void ft(double feet){
         double res = feet * 12;
         System.out.println("result : " + res); 
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of feet: ");
        double feet = sc.nextDouble();
        ft(feet);
    }
}