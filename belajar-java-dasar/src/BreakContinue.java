public class BreakContinue {
    public static void main(String[] args) {

        //jika ada kata kunci break otomatis perulangan berhenti
        //continue hanya menghentikan perulangan saat ini dan melanjutkan dengan perulangan selanjutnya
        var counter = 1;
        while (true) {
            System.out.println("perulangan ke-"+ counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        //pengulangan continue

        for (int counter2 =1; counter2 <= 100 ; counter2++){
            if (counter2 % 2 ==0){
                continue;
            }
            System.out.println("continue ke-" + counter2);

        }
    }
}
