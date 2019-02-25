package vendingmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> kopi      = new ArrayList<String>();
        ArrayList<String> topping   = new ArrayList<String>();

        MesinKopi robusta = new MesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());

        MesinKopi arabica = new MesinKopi();
        arabica.setJenisKopi("Arabica");
        arabica.setJumlahStokKopi(40);
        kopi.add(arabica.getJenisKopi());

        MesinKopi flores = new MesinKopi();
        flores.setJenisKopi("Flores");
        flores.setJumlahStokKopi(40);
        kopi.add(flores.getJenisKopi());

        Topping gula = new Topping();
        gula.setJenisTopping("Gula");
        gula.setJumlahStokTopping(40);
        topping.add(gula.getJenisTopping());

        Topping susu = new Topping();
        susu.setJenisTopping("Susu");
        susu.setJumlahStokTopping(40);
        topping.add(susu.getJenisTopping());

        Topping cream = new Topping();
        cream.setJenisTopping("Cream");
        cream.setJumlahStokTopping(40);
        topping.add(cream.getJenisTopping());

        for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;

        for(int i=0; i< topping.size();i++){
            int j= i+1;
            System.out.println("Pilihan topping untuk kopi anda  adalah "+j+" "+topping.get(i));
        }

        System.out.println("Masukan topping yang mau dipilih ");
        int pilihanTopping = keyboard.nextInt() -1;

        if(pilihanKopi == 1){
            robusta.setTopping(topping.get(pilihanTopping));
            System.out.println("Pilihan kopi anda adalah " + kopi.get(pilihanKopi)
                    + " dengan topping " +robusta.getTopping());
        }
        else if(pilihanKopi == 2){
            arabica.setTopping(topping.get(pilihanTopping));
            System.out.println("Pilihan kopi anda adalah " + kopi.get(pilihanKopi)
                    + " dengan topping " +arabica.getTopping());
        }
        else {
            flores.setTopping(topping.get(pilihanTopping));
            System.out.println("Pilihan kopi anda adalah " + kopi.get(pilihanKopi)
                    + " dengan topping " +flores.getTopping());
        }





    }
}
