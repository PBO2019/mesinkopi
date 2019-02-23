package agregate;

public class Main {

    public static void main(String[] args) {

        Ukm catur = new Ukm();
        Mahasiswa daftarMember[] = new Mahasiswa[2];

        catur.setNama("Catur");
        daftarMember[0] = new Mahasiswa();
        daftarMember[0].setNama("Andi");
        daftarMember[0].setNim(1234);

        daftarMember[1] = new Mahasiswa();
        daftarMember[1].setNama("Budi");
        daftarMember[1].setNim(4321);


        catur.setMember(daftarMember);

        Mahasiswa[] listMember = catur.getMember();
        for (int j=0;j<listMember.length;j++) {
            System.out.println("Anggota ukm " + catur.getNama() +
                    " yang ke "+ j +" adalah bernama "+ listMember[j].getNama());

        }

    }
}
