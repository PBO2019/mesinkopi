https://imgur.com/x5wb1GP

Dengan menggunakan class diagram pada gambar pada link di atas,
buatlah program java dengan asosiasi untuk membuat vending machine.
Ada 3 jenis kopi yang disediakan, yaitu arabica, robusta dan kopi Flores
Untuk topping, disediakan, susu, gula dan cream.
Setiap kopi hanya boleh memakai 1 topping saja.
Gunakan scanner keyboar untuk memilih kopi dan topping yang hendak dipilih.
Sebelum memilih kopi dan topping, tampilkan dulu daftar kopi dan topping yang ada.
Petunjuk, gunakan arraylist untuk menyimpan kopi ke dalam list, lalu tampilkan
ke dalam command line seperti di bawah ini

        ArrayList<String> kopi   = new ArrayList<String>();

        MesinKopi robusta = new MesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());

	for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;

Setelah memilih kopi dan topping, tampilkan pesan
"Pesanan anda adalah kopi X dengan topping Y"
