import java.util.Scanner;
public class LACANGLACANG_ACTIVITY_VI{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

int num;

System.out.println("ENter number");
num = sc.nextInt();
int sum = 0;
int i = 1;
while(i <= num){
    sum += i;
    i++;
}
    System.out.print(sum);

} 
        

    }

