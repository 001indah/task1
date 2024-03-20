import java.util.Date;

public class Expression {
    public static void main(String[] args) {
        //Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value
        int value; //ekspresi sekaligus statement
        value = 10; //ekspresi sekaligus statement

        System.out.println(value =100); //statement = kalimat lengkap penggabungan ekspresi

        //statement adalah kalimat lengkap dalam bahasa diakhiri ;
        //jenis
        //expression
        //penggunaan ++ dan --
        //methode invocation
        //object creation expression

        //assignment statement = mengubah nilai value
        double aValue = 8933.234;
        //increment statement
        aValue++;
        //methode invocation statement
        System.out.println("hello world!");
        //object creation statement = pembuatan objek baru nanti buat di OOP
        Date date = new Date();

        //blok untuk nge grupping kode supaya lebih enak
        //block = kumpulan statement yang terdiri dari nol atau lebih statement
        //diawali dan diakhiri dengan kurung kurawa {}
        //jadi pembagiannya yang terkecil expression < statement <blok
        {
            System.out.println("Hello World 1");
            System.out.println("Hello World 2");
            System.out.println("Hello World 3");
            {
                System.out.println("Hello World 4");
                System.out.println("Hello World 5");
            }
            {
                System.out.println("Hello World 6");
            }
        }




    }
}
