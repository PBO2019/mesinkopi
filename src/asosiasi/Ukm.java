package asosiasi;

import java.util.ArrayList;
import java.util.List;

public class Ukm {
    private String nama;
    private List<String> member= new ArrayList<String>();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMember(String namaMember) {
        member.add(namaMember);
    }

    public void getMember() {

        for(int i =0;i<member.size();i++){
            System.out.println("Anggota ukm " + this.nama +
                    " yang ke "+ i +" adalah bernama "+ member.get(i));

        }
    }
}
