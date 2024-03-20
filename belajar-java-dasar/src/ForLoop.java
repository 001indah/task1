public class ForLoop {
    public static void main(String[] args) {
        //kode blok akan selalu diulang selama kondisi terpenuhi
        //for(int statement; kondisi; post stetement){

        //Kode pengulangan tanpa henti
//        for(;;){
//            System.out.println("perulangan tanpa henti");
//        }

        //jika dengan kondisi
        var counter = 1;
        for (;counter <=10;){
            System.out.println("Perulangan" + counter);

            counter++;
        }

        //penulisan lebih simpel
        for(var counter2 = 1; counter2 <= 10; counter2++){
            System.out.println("counter " + counter2);
            System.out.println("thank you");
        }




    }
}
