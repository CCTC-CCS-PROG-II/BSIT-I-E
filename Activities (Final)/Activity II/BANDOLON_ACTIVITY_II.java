public class BANDOLON_ACTIVITY_4{
    static void feetToInches= (double feet){
        double res= feet*12;
        System.out.println("res");

    }
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a feet:");
        double feet= sc.newDouble();
        feetToInches(feet);
    }
}