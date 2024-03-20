public class TernaryOperator {
    public static void main(String[] args) {
        //operator sederhana dari if statement (Mempersingkat penggunaan if dan else
        //terdiri dari kondiri yang dievaluasi, jika menghasilkan true, nilai pertama dievaluasi
        //jika false maka diambil nilai kedua



        var nilai = 75;


//        //perbandingan if else dengan ternary operator
//        String ucapan;
//        if (nilai >= 75) {
//            ucapan = "Selamat Anda Lulus";
//        } else {
//            ucapan = "Silakan Coba Lagi";
//        }
//        System.out.println(ucapan);

        // jika di ternary operator
        String ucapan = nilai >= 75? "selamat anda lulus" : "silakan coba lagi";

        System.out.println(ucapan);

    }
}
