import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int S, H;
        int pilihan;

        do {
            System.out.println("=== Program Konversi Suhu ===");
            System.out.println("Pilih Tujuan Konversi");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Kelvin");
            System.out.println("3. Reamur");
            System.out.println("4. Keluar");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Input Suhu dalam Celcius : ");
                    S = input.nextInt();
                    H = (S * 9 / 5) + 32;
                    System.out.println("Suhu dalam Fahrenheit : " + H);
                    break;
                case 2:
                    System.out.print("Input Suhu dalam Celcius : ");
                    S = input.nextInt();
                    H = S + 273;
                    System.out.println("Suhu dalam Kelvin : " + H);
                    break;
                case 3:
                    System.out.print("Input Suhu dalam Celcius : ");
                    S = input.nextInt();
                    H = (S * 4 / 5);
                    System.out.println("Suhu dalam Reamur : " + H);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
            System.out.println(); 
        } while (pilihan != 4); 
        input.close();
    }
}