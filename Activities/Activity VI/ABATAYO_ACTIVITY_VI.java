import java.util.Scanner;
public class ABATAYO_ACTIVITY_VI { 
Scanner sc = new Scanner(System.in) {
    System.out.println( "Enter your nuymber:");
      int num = sc.nextlnt();
    
     int sum = 0;
    
     int i = 1;
     
     while(i <= num){
        sum += i;
        i++;

     }
     System.out.println(sum);
    }
}
