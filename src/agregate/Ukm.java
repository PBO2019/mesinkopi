package agregate;

public class Ukm {
    private String nama;
    private Mahasiswa[] member = new Mahasiswa[2];

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMember(Mahasiswa[] mhs) {
        for(int i=0;i<member.length;i++){
            this.member[i] = mhs[i];
        }
    }

    public Mahasiswa[] getMember() {
        return member;
    }
}
