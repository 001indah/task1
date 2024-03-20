public class IfStatement {
    public static void main(String[] args) {
        // if digunakan untuk percabangan
        // percabangan= mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
        // hampir semua bahasa mendukung if expression

        var nilai = 78;
        var absen = 90;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Anda Lulus!");
        }else {
            System.out.println("Anda tidak lulus!");
        }

        //Penggunaan else if
        if (nilai >= 80 && absen >= 80){
            System.out.println("nilai anda A");
        } else if (nilai >= 70 && absen >= 70){
            System.out.println("nilai anda B");
        } else if (nilai >= 60 && absen >= 60){
            System.out.println("nilai anda C");
        } else {
            System.out.println("Nilai anda x");
        }

    }
}
