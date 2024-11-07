package Model_Rusdilines;

public class Bussiness extends Penerbangan{
    private double jarak_tempuh = 20;
    private PesanMakanan pesanMakan;

    public Bussiness(String tipe_penerbangan, double km, double berat_bagasi, PesanMakanan pesanMakan) {
        super(tipe_penerbangan, km, berat_bagasi);
        this.pesanMakan = pesanMakan;
    }

    public PesanMakanan isPesanMakan() {
        return pesanMakan;
    }

    public void setPesanMakan(PesanMakanan pesanMakan) {
        this.pesanMakan = pesanMakan;
    }

    public double getJarak_tempuh() {
        return jarak_tempuh;
    }

    public void setJarak_tempuh(double jarak_tempuh) {
        this.jarak_tempuh = jarak_tempuh;
    }
    
    @Override
    public double hitungBiayaTiket(){
        double harga = 0; 
        if (getBerat_bagasi() > 5) {
            harga = getBerat_bagasi() * 2500;
        }else{
            harga = getkm() * 10000;
        }
        //Asumsi: Bussiness class hanya diperbolehkan memesan 1 Makanan saja
        // dengan kuantitas hanya 1
        if (pesanMakan == PesanMakanan.PESAN) {
            harga = harga + (harga * 0.1);
        }
        return harga;
    }
}
