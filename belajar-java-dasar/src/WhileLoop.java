public class WhileLoop {
    public static void main(String[] args) {
        //lebih sederhana dari loop
        //kondisi pengulangan tanpa int dan post statement

        var counter = 1;

        while (counter <=10){
            System.out.println("Perulangan ke-" + counter);

            //biar tidak terjadi pengulangan tenpa henti kita tambah post statement
            counter++;
        }
    }
}
