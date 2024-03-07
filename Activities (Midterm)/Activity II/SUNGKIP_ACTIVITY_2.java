
 
  import java.util.Scanner;
public class SUNGKIP_ACTIVITY_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grades[] ={1,2,3,4,5,6,7,8,9,10};
        double total = 0.0;
        int sum =0;
        for(int A = 0; A < grades.lenght; A++){
            System.out.print("enter the index" + (A + 1) +":");
            grades[A] = input.nextInt();
            total+=grades;
            sum/=10;

        }
        System.out.println(sum);
    }
}