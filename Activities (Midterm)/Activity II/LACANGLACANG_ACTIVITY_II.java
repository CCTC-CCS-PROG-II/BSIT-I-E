import java.util.Scanner;
public class LACANGLACANG_ACTIVITY_II{

    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        double [] x = new double[10];
      
        
        for(int i = 0; i < 10;i++){
        System.out.print(" Enter the scores " + (i + 1) + ":" );
        x[i] = sc.nextDouble();
    }
       double sum = 0;
        for(double  y : x){
            sum +=y;
        }
        double average = sum / 10;
        
      System.out.println("The average kay kuan: " + average +"percent ");
    }

    
        

        

    }
