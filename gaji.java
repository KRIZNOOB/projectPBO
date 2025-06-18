import java.util.Scanner;

class pekerjaan {
    String namaPekerjaan;
    double gajiPerJam;
    int[] jamKerja = new int[7];

    pekerjaan(String job, double gaji) {
        this.namaPekerjaan = job;
        this.gajiPerJam = gaji;
    }

    double hitungGaji(){
        int totalJam = 0;
        for (int jam : jamKerja) {
            totalJam += jam;
        }
        return gajiPerJam * totalJam;
    }

    String tampilkanData(){
        return "Pekerjaan : " + namaPekerjaan + "\nGaji per jam : Rp." + gajiPerJam;
    }
}
public class gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Pekerjaan : ");
        String job = input.nextLine();
        System.out.print("Gaji per jam : Rp.");
        double gaji = input.nextDouble();
        pekerjaan pekerjaan = new pekerjaan(job, gaji);

        System.out.println("Masukkan jam kerja per hari : ");
        for (int i = 0; i < 7 ; i++) {
            System.out.print("Hari ke-" + (i + 1) + " : ");
            pekerjaan.jamKerja[i] = input.nextInt();
        }

        System.out.println("\n==== Data Pekerjaan dan Gaji ====");
        System.out.println(pekerjaan.tampilkanData());
        double totalGaji = pekerjaan.hitungGaji();
        System.out.println("Total Gaji : Rp." + totalGaji);

        input.close();
    }
}
