import java.util.Scanner;
public class LIBRADO {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter your first Number: ");
        int fnum = scanner.nextInt();
        System.out.println("Enter your Second Number: ");
        int snum = scanner.nextInt();
        
        int sum = fnum + snum;
        System.out.println("sum is = "+sum);
        int sub = fnum - snum;
        System.out.println("Sub is = "+sub);
        int prod = fnum * snum;
        System.out.println("Prod is = "+prod);


        

    }
}
