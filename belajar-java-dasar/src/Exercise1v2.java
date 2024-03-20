import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise1v2 {
    //task 1

    private static int calculateArea(int length, int width){
        int area = length*width;
        return area;
    }

    // task 2
    public static void calculateAreaCircle(int radius) {
        int diameter = radius * 2;
        double circumference = diameter * Math.PI;
        double area = Math.PI*Math.pow(radius,2);

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }

    //task 3
    public static int carculateTriangleAngles(int angles1, int angles2){
        int triangle = 180 - (angles2 + angles1);
        return triangle;
    }
    //task 4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start Date ");
        String startDate = scanner.nextLine();
        System.out.println("End Date");
        String endDate = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate persedStartDate = LocalDate.parse(startDate,formatter);
        LocalDate persedEndDate = LocalDate.parse(endDate,formatter);
        long daysDifference = ChronoUnit.DAYS.between(persedStartDate,persedEndDate);
        System.out.println("Days difference beetween start and end is: " + daysDifference + "Days.");
        System.out.println(daysDifference);
        System.out.println("end");
        System.out.println("Hello World!");
    }
//    public static int dataDifferenece(String d1, String d2){
//        LocalDate
//    }


//    Scanner in = new Scanner(System.in);
//    System.out.print("Length: ");
//    int length = in.nextInt();
//    System.out.print("Width: ")
//    int width = in.nextInt();
//
//    System.out.print

}
