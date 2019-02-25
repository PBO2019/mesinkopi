package vendingmachine;

public class MesinKopi {
    private String JenisKopi;
    private String Topping;
    private  int JumlahStokKopi;

    public void setJenisKopi(String jenisKopi) {
        JenisKopi = jenisKopi;
    }

    public int getJumlahStokKopi() {
        return JumlahStokKopi;
    }

    public void setJumlahStokKopi(int jumlahStokKopi) {
        JumlahStokKopi = jumlahStokKopi;
    }

    public String getJenisKopi() {
        return JenisKopi;
    }

    public void setTopping(String topping) {
        Topping = topping;
    }

    public String getTopping() {
        return Topping;
    }
}
