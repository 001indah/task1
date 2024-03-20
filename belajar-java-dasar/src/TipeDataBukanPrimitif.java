public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        //dalam java OOP harusnya semua data objek, sayangnya di java banyak tipe data primitif (bawaan bahasa pemrograman, ngikutin operasinya tidak bisa diubah lagi (default: long, char, integer, boolean, double, float)
        //string bukan tipe data primitif karena jika bikin string default value == null (string = tipe data objek, jika tidak di assign value akan bernilai nul)
        //tipe data bukan primitif bisa memiliki method/function
        //semua tipe primitif punya representasi bukan primitif

        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBolean = true;
        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        Short iniShort; //null
        iniShort = 100;
    }
}
