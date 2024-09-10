import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        /** buatlah sebuah program yang menghasilkan 2 input number dari user
         * Program tsb akan print out nilai yang paling besar
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka Pertama: ");
        int angkaPertama = scanner.nextInt();

        System.out.println("Masukkan Angka Kedua: ");
        int angkaKedua = scanner.nextInt();

        if (angkaPertama > angkaKedua) {
            System.out.println("Angka Terbesar adalah: " + angkaPertama);
        } else if (angkaKedua > angkaPertama) {
            System.out.println("Angka Terbesar adalah: " + angkaKedua);

        }
    }
}