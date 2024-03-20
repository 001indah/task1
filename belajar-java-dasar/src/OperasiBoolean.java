public class OperasiBoolean {
    public static void main(String[] args) {

        //operasi boolean -> untuk pengecekan
        // operator
        // && -> dan -> harus semua true
        // || -> atau -> hanya butuh satu true
        // ! -> kebalikan

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);

        // if statement
        var nilai = 70;
        var absensi = 90;

        if(nilai >= 75 && absensi >= 75){
            System.out.println("anda lulus");
        }else {
            System.out.println("Anda tidak lulus");
        }

    }
}
