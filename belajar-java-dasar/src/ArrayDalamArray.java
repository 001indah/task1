public class ArrayDalamArray {
    public static void main(String[] args) {
        //membuat array dalam array
        String[][] members = {
                {"ana", "budi", "citra"},
                {"dodi", "eka", "Fajar"},
                {"Gugu", "heri"}
        };
        //cara mengakses data
        System.out.println(members[2][1]);
        System.out.println(members[0][1]);
    }
}
