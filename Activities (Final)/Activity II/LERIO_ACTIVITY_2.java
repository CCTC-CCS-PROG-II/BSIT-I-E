public class LERIO_ACTIVITY_2 {

    public static double feetToInches(double feet) {
        double inches = feet * 12;
        return inches;
    }

    public static void main(String[] args) {
        double feetValue = 10;

        double inchesValue = feetToInches(feetValue);
        System.out.println(feetValue + " feet is equal to " + inchesValue + " inches.");
    }
}
