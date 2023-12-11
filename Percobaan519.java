public class Percobaan519 {
    static void print(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print("Daspro 2019", 100, 200);
        print("Teknologi Informasi", 1, 2, 3, 4, 5);
        print("Polinema");
    }
}
