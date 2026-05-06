class Elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;  

    public Elektronik(String nama, String merek, double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);  // super() manggil constructor parent
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    
    }

    public String getMerek() {
        return merek;
    }

    public int getGaransiTahun() {
        return garansiTahun;
    }

    @Override
    public void tampilInfo() {
        System.out.println("[ELEKTRONIK]");
        System.out.println("Nama : " + getNama());
        System.out.println("Merek : " + merek);
        System.out.println("Garansi : " + garansiTahun + " tahun");
        System.out.println("Harga : Rp" + getHarga());
        System.out.println("Stok : " + getStok());
        System.out.println("---------------------");
    }
    
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.20;  // Pajak 20% untuk elektronik
    }
}
