public class SwitchStatement {
    public static void main(String[] args) {
        //jika kondisi sederhana di if statement, seperti hanya menggunakan perbandingan
        // kondisi hanya untuk perbandinga==
        var nilai = 'A';

        switch (nilai) {
            case 'A':
                System.out.println("Wow Anda lulus dengan baik");
                break;
            case 'B':
            case 'C':
                System.out.println("Anda Lulus");
                break;
            case 'D':
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Anda Tidak Lulus, Mungkin Anda Salah Jurusan!");
                break;
        }
        // Swotch Lambda = tanpa nulis break di java version tinggi

        switch (nilai){
            case 'A' -> System.out.println("wow anda lulus dengan baik");
            case 'B', 'C' -> System.out.println("anda lulus");
            case 'D' -> System.out.println("anda tidak lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }

        }

        //Switch yeild

    }
}
