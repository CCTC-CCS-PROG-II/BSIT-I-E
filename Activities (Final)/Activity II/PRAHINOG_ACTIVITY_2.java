public class PRAHINOG_ACTIVITY_2 {
    public static double feettoinches(double feet){
        double inches = feet * feet;
        return inches;
}
public static void main(String[] args) {
    double feetvalue = 10;

    double inchesvalue = feettoinches(feetvalue);
    System.out.print(feetvalue + "feet is equal to" + inchesvalue + "inches");
}
}

