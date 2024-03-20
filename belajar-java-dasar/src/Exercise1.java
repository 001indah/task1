import java.time.LocalDate;
import java.time.Period;

public class Exercise1 {
    public static void main(String[] args) {
// case 1
        int length = 5;
        int width = 3;
        int rectangleArea = length*width;

        System.out.println("Area of rectangle is " + rectangleArea);
// case 2
        int radius = 5;
        int diameter = 10;
        double circumference = Math.PI*diameter;
        double area = Math.PI*(radius*radius);

        System.out.println("circumference of circle is " + circumference);
        System.out.println("area of circle is " + area);
// case 3
        int a = 80;
        int b = 65;
        int sudut = 180 - 80-65;

        System.out.println("sudut " + sudut);
// case 4
        LocalDate date1 = LocalDate.of(2024, 03,19);
        LocalDate date2 = LocalDate.of(2024, 03, 21);

        Period diff = Period.between(date1,date2);
        System.out.println(diff.getDays());

        // case 5

////        String nama = "java lll";
////        String namaKapital = nama.substring(0, 1).toUpperCase() + nama.substring(1);
////        System.out.println(namaKapital);
////            for (int i=0 ; i < namaKapital.length(); i++){
////                if (nama.charAt(1) == (" "));
//////                    return namaKapital.substring(0, 1)
////            }
////        System.out.println(nama);
////        }
//
//        // ans
//        System.out.println(calculateArea
//        );
//        static int calculateArea ( int width, int high){
//            return width * high
//        }
    }
}
