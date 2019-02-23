package asosiasi;

public class Main {

    public static void main(String[] args) {

        Ukm voli = new Ukm();
        voli.setNama("voli");

        Mahasiswa andi = new Mahasiswa();
        andi.setNama("Andi");
        andi.setNim(1234);

        Mahasiswa budi = new Mahasiswa();
        budi.setNama("Budi");
        budi.setNim(4321);

        voli.setMember(andi.getNama());
        voli.setMember(budi.getNama());

        voli.getMember();
    }
}
