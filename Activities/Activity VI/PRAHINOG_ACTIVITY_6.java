    import java.util.Scanner;
    public class PRAHINOG_ACTIVITY_6{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            
            int sum = 0;
            
            int i = 1;
            
            while(num > 0){
                sum += i;
                i++;
            }
            System.out.println(sum);
        }

}

