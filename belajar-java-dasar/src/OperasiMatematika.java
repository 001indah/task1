public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //augmented Assignments = operasi ke variable dia sendiri
        //a = a + 10 -> a += 10
        //a = a - 10 -> a -= 10
        //a = a * 10 -> a *= 10

        int c = 100;
        System.out.println("c=100");

        c += 10;
        System.out.println("c+=10 adalah " + c);

        c -= 10;
        System.out.println("c-=10 adalah " + c);

        c *=10;
        System.out.println("c*=10 adalah " + c);

        //unary operator = operator yang ditempatkan di depan variable
        // ++ -> a = a + 1
        // -- -> a = a - 1
        // - -> negative
        // + -> positive
        // ! -> boolean kebalikan

        int d = +100;
        int e = -10;
        System.out.println("d= " + d);
        System.out.println("e= " + e);

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);


    }
}
