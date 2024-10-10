import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables doubles
        double meters = 0;
        double miles;
        double feet;
        double inches;
        double meters_To_Miles = 0.00062137;
        double meters_To_Feet = 3.28084;
        double meters_To_Inches = 39.37008;
        //boolean
        boolean valid = false;


        Scanner scan = new Scanner(System.in);

        //do statement to find meters
        do{
            System.out.println("Enter meter measurement");
            if (scan.hasNextDouble()) {
               meters = scan.nextDouble();
                if (meters > 0) {
                    valid = true;
                }
                else {
                    scan.nextLine();
                    System.out.println("You did not enter a valid integer");
                }
            }
            else {
                scan.nextLine();
                System.out.println("You did not enter a valid data type");
            }
        } while (!valid);

        //calculations
        miles = meters * meters_To_Miles;
        feet = meters * meters_To_Feet;
        inches = meters * meters_To_Inches;

        System.out.printf("%-10s %5.2f", "Meters:", meters);
        System.out.printf("\n%-10s %5.2f", "Miles:", miles );
        System.out.printf("\n%-10s %5.2f", "Feet:", feet);
        System.out.printf("\n%-10s %5.2f", "Inches:", inches);

    }
}