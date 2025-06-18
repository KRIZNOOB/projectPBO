interface Kendaraan {
    int kecepatanMaksimum();
}

class Mobil implements Kendaraan {
    private int kecepatan;
    public Mobil(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    @Override
    public int kecepatanMaksimum() {
        return kecepatan;
    }
}

class Sepeda implements Kendaraan {
    private int kecepatan;
    public Sepeda(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    @Override
    public int kecepatanMaksimum() {
        return kecepatan;
    }
}

public class interfacemain {
    public static void main(String[] args) {

        Kendaraan mobil = new Mobil(180);
        Kendaraan sepeda = new Sepeda(30);

        System.out.println("Kecepatan Maksimum Mobil: " + mobil.kecepatanMaksimum() + " km/jam");
        System.out.println("Kecepatan Maksimum Sepeda: " + sepeda.kecepatanMaksimum() + " km/jam");
    }
}