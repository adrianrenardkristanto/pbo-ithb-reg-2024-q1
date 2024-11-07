package Model_Rusdilines;
import java.util.*;

public class First extends Penerbangan{
    private double jarak_tempuh;
    private ArrayList<Makanan> makanans;
    private PesanMakanan pesanMakan;
 
    public First(String tipe_penerbangan, double km, double berat_bagasi, double jarak_tempuh, ArrayList<Makanan> makanans, PesanMakanan pesanMakan) {
        super(tipe_penerbangan, km, berat_bagasi);
        this.jarak_tempuh = 30;
        this.makanans = makanans;
        this.pesanMakan = pesanMakan;
    }
    public PesanMakanan getPesanMakan() {
        return pesanMakan;
    }
    public void setPesanMakan(PesanMakanan pesanMakan) {
        this.pesanMakan = pesanMakan;
    }

    public ArrayList<Makanan> getMakanans() {
        return makanans;
    }

    public void setMakanans(ArrayList<Makanan> makanans) {
        this.makanans = makanans;
    }

    public double getJarak_tempuh() {
        return jarak_tempuh;
    }

    public void setJarak_tempuh(double jarak_tempuh) {
        this.jarak_tempuh = jarak_tempuh;
    }
    
    @Override
    public double hitungBiayaTiket(){
        double harga = getkm() * 15000; 
        if (pesanMakan == PesanMakanan.PESAN) {
            return harga + makanans.size() * (harga * 0.1);
        }
        return harga + (harga * 0.1);
    }
}
